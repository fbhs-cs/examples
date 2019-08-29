public class VarExprDemo {
    public static void main(String[] args) {
        int a = 1;
        double b = 1.0;
        final int c = 10;   // final -> CONSTANT, CANNOT BE CHANGED LATER IN THE PROGRAM
        
        System.out.printf("a: %d\tb: %f\tc: %d\n", a, b, c);
        System.out.println("a + a = " + (a + a));   // int +-*/ int = int
        System.out.println("a + b = " + (a + b));   // double +-*/  ____ = double
        System.out.printf("b + b = %.1f\n",b + b);
        System.out.printf("c / b = %f\n", c / b);

        
        a = 5;
        b = 3.4;
        //c = 100;
        System.out.printf("a: %d\tb: %f\tc: %d\n", a, b, c);
        System.out.println("a + a = " + (a + a));
        System.out.println("a + b = " + (a + b));
        System.out.printf("b + b = %.1f\n",b + b);
        System.out.printf("c / b = %f\n", c / b);
        

    }
}