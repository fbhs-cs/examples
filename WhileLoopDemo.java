public class WhileLoopDemo {
    public static void main(String[] args) {

        // Relational operators: >, <, >=, <=, ==, !=
        // result in a true or false (boolean)

        int n = 1;  // initialize

        while(n == 10) {  // check if condition is true
            System.out.println(n);  // action
            n += 5; // increment/decrement
        }
        
        System.out.println("Out of the loop.");
        
    }
}