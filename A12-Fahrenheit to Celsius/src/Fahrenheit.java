public class Fahrenheit {

    private double FahrenNum;

    public void setfahrenheit(double fahrenheit){
        FahrenNum = fahrenheit;
    }
    public double getcelcius(){
        double celcius = 0.0;
        celcius = (( FahrenNum -32)*5/9);
        return (celcius);
    }

    public void print(){
        System.out.printf("Celcius: %.1f \n", getcelcius());
        
    }
}
