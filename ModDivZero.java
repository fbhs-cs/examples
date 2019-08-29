public class ModDivZero {
    public static void main(String[] args) {

        // modulo (mod) operator is %
        // this a % b gives the remainder 
        // from a / b

        int a = 10;     // a and b are called "variable"s
        int b = 3;      // 10 and 3 are called "literal"s
        int q = a / b;  // remember that int / int = int
        int r = a % b;  // % (mod) gives us the remainder

        System.out.printf("%d divided by %d is %d with a remainder of %d\n", a, b, q, r);
        
    }
}