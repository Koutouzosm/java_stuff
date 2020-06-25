package Console;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class Arrays {
    public static void main (String[] args) {

        // Initialize the Scanner, and set the list to populate
        Scanner input = new Scanner(System.in);

        ArrayList<HashMap<String, String>> students = new ArrayList<>();

        System.out.print("Please enter the student's first name. ");
        String firstName = input.next();
    
        System.out.print("Please enter the student's last name. ");
        String lastName = input.next();
    
        System.out.print("Please enter the student's middle initial. ");
        String middleInitial = input.next();
        input.nextLine(); // Strip the newline.
    
        // ---- CONTACT INFORMATION ----
        
        System.out.print("Please enter the student's address. ");
        String address = input.nextLine();
    
        System.out.print("Please enter the student's email. ");
        String email = input.next();
    
        System.out.print("Please enter the student's phone number. ");
        String phoneNumber = input.next();
    
        // ---- PRINT  ----
    
        /* Refactor this to print the value of each key iteratively. Use
         *   String.format, and substitute the key/value names into the string.
         */
        System.out.println(String.format("The student's first name is %s. ", firstName));
    
        System.out.println(String.format("The student's last name is %s. ", lastName));
    
        System.out.println(String.format("The student's middle initial is %s. ", middleInitial));
    
        System.out.println(String.format("The student's address is %s. ", address));
    
        System.out.println(String.format("The student's email is %s. ", email));
    
        System.out.println(String.format("The student's phone number is %s. ", phoneNumber));
    
        // Don't change this confirmation code just yet!
        // System.out.print("Is this information correct?");
        // String confirmation = input.next();
      

      student.forEach((attribute, value) -> {
        System.out.println(
          String.format("The student's %s is %s", attribute, value));
      });

      String confirmation = input.next();
      System.out.print("Is this information correct? (Y/n)" );


    }
    }
    
