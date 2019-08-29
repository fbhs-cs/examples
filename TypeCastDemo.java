public class TypeCastDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double c = 3.5;
        // typecast a to a double

        double q = (double)a / b;
        
        int s = a + (int)c;

        // int = 32 bits    double = 64 bits

        //System.out.printf("%.2f\n",q);
        System.out.println(s);

        
        
    }
}