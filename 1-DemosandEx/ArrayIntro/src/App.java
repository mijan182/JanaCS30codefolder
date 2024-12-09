import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // String[] myarray = new String[5];
        // List<String> myarrlist = new ArrayList<String>();

        // System.out.println("The length is " + myarray.length);
        // System.out.println("The size is " + myarrlist.size());

        // // Add to a list
        // myarrlist.add("Wolf");
        // myarrlist.add("Fox");
        // myarrlist.add("Cook");
        // myarrlist.add("Sutter");
        // myarrlist.add("Zeck");

        // System.out.println(myarrlist);
        // System.out.println("The size is " + myarrlist.size());

        // // Add to a list in a certain position
        // myarrlist.add(2,"Golden");
        // System.out.println(myarrlist);
        // System.out.println("The size is " + myarrlist.size());

        // //Remove from list
        // myarrlist.remove(4);
        // //Output
        // System.out.println(myarrlist);
        // System.out.println("The size is " + myarrlist.size());

        // // Overwrite
        // myarray[3] = "George";
        // myarrlist.set(3, "George");
        // // Output
        // System.out.println(myarrlist);
        // System.out.println("The size is " + myarrlist.size());

        // // Retrieval Array vs ArrayList
        // System.out.println( myarray[3] );
        // System.out.println( myarrlist.get(3) );

        // ---------------------------------------------------------
        int[] numarr = new int[10];
        numarr[0] = 57;
        numarr[1] = 32;
        numarr[2] = 146;
        for (int i = 0; i < numarr.length; i++) {
            System.out.println("Item " + numarr[i]);
        }

        List<Integer> numlist = new ArrayList<Integer>();
        numlist.add(57);
        numlist.add(32);
        numlist.add(146);
        for (int i = 0; i < numlist.size(); i++) {
            System.out.println("Item " + numlist.get(i));
        }


    }
}