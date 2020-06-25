package Console;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Managment {
public static void main (String[] args) {

    // Initializing the Scanner
    Scanner input = new Scanner(System.in);

    // Collecting name information
    System.out.println("Please enter first name. ");
    String firstName = input.next();

    System.out.println("Please enter middle initial. ");
    String middleInitial = input.next();

    System.out.println("Please enter last name. ");
    String lastName = input.next();

    // Collecting contact information
    System.out.println("Please enter address. ");
    String address = input.next();

    System.out.println("Please enter email. ");
    String email = input.next();

    System.out.println("Please enter phone number. ");
    String phoneNumber = input.next();

    // Print the values.
    System.out.println(
        String.format("First name is %s. ", firstName)
    );

    System.out.println(
        String.format("Middle initial is %s. ", middleInitial)
    );

    System.out.println(
        String.format("Last name is %s. ", lastName)
    );

    System.out.println(
        String.format("Address is %s. ", address)
    );

    System.out.println(
        String.format("Email is %s. ", email)
    );

    System.out.println(
        String.format("Phone number is %s. ", phoneNumber)
    );

    System.out.print("Is this information correct?");
    String confirmation = input.next();

    }

}