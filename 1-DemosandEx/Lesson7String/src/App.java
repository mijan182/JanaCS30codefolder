public class App {
    public static void main(String[] args) throws Exception {
        String m1 = "this is a test";
        String m2 = new String("hello");
        String m3 = "another test";

        System.out.println(m1.length());
        System.out.println(m2.substring(0,2));
        System.out.println(m3.indexOf("test"));
    }
}
