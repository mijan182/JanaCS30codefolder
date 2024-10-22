public class MPHCalc {
    public void numbers(int distance, int hours, int minutes){
        System.out.print("\n" + distance + " miles in " + hours + " in " + minutes + " minutes");
    }
    public void MPHcalculate(int distance, int hours, int minutes){
        double minToHours = (double)minutes / 60;
        double totalHours = minToHours + hours;
        double speed = distance / totalHours;
        System.out.printf(" = %.0f MPH", speed);
    }
}
