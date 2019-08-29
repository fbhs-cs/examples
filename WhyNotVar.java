public class WhyNotVar {
    public static void main(String[] args) {

        // As of Java 10, you can now declare 
        // local variables using the "var" type

        int x = 10;
        System.out.println(x);
        // Java will infer the data type from the code

        x /= 3;
        System.out.println(x);

        
    }
}