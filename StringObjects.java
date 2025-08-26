import java.util.Scanner;

public class StringObjects {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? My name is Gilberto Gonzalez ");
        String name = scanner.nextLine();


        System.out.println("Hello, " + name + "!");


        System.out.println("My name has " + name.length() + " 8 Characters.");


        System.out.println("GILBERTO GONZALEZ: " + name.toUpperCase());

       
        System.out.println("gilberto gonzalez: " + name.toLowerCase());

        scanner.close();
    }
}
