public class App {
    public static void main(String[] args) throws Exception {
        SubMethods test = new SubMethods();

        int num = test.myFunction();
        System.out.println("The return is " + num);

        myName();
    }

    private static void myName(){ //static = directly referencing instead of using an object
        System.out.println("My name is......");
    }
}
