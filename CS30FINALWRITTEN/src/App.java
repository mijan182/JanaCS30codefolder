import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        List<Integer> scoreList = new ArrayList<>();
        int eliteCount = 0;
        int averageCount = 0;

        while (true) {//change
            System.out.print("Please enter the bowling score (-1 to quit):" );
            int scores = input.nextInt();

            if(scores == -1){
                break;
            }

            if (scores<0||scores>300){
                System.out.println("invalid score, please input again. ");
                continue;
            }

            scoreList.add(scores);

            if(scores<200){
                averageCount++;
            }else{
                eliteCount++;
            }

            System.out.print("\nYou entered the following scores: ");
        for (int score : scoreList) {
            System.out.print(score + " ");

        }
        System.out.println();
    }

    int totalBowlers = scoreList.size();

    if(totalBowlers>0){
        double elitePercentage = (eliteCount * 100.0)/totalBowlers;
        double averagePercentage = (averageCount*100.0)/totalBowlers;

        System.out.printf("\nPercentage of Elite Bowlers: %.2f", elitePercentage);
        System.out.printf("\nPercentage of Average Bowlers: %.2f", averagePercentage);

    }else{
        System.out.println("No score entered.");
    }

    input.close();
}
}
