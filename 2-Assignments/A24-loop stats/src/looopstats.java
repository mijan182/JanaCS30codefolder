public class looopstats {
    

    public static boolean loop(int beg, int end){
        int sum = 0;
        int oddscount = 0;
        int evenscount = 0;
        
        boolean odds = false;
        boolean evens = false;

        for (int i = beg; i <= end; i++) {
            sum += i; // Correctly sum up the numbers

            if (i % 2 == 0) {
                evenscount++;
                evens = true; // Set flag for evens
            } else {
                oddscount++;
                odds = true; // Set flag for odds
            }
            
        }
            
        System.out.println("\n" +beg+" " + end +"\ntotal: "+sum+"\neven count: "+ evenscount + "\nodd count: " + oddscount);
        return evens || odds;
                
    }
    }

