public class App {
    public static void main(String[] args) {

        // For loop example
        // This loop will print numbers from 1 to 19.
        for (int i = 1; i < 20; i++) {
            System.out.println(i);
        }

        System.out.println("\n--- End of for loop ---\n");

        // While loop example
        // This loop will print numbers from 1 to 9.
        int i = 1; // Initialize the loop control variable
        while (i < 10) {
            System.out.println(i);
            i++; // Increment the variable to avoid an infinite loop
        }
    }
}