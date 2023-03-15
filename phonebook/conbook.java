//Nicholaus Santo Agnus Dei - B2602174415 - L2BC

package phonebook;
import java.io.*;
import java.util.*;

public class conbook {
    public static void main(String[] args){
        SLList cb = new SLList();
        Scanner xinput = new Scanner(System.in);
        String menu;
        boolean done = false;
        do{
            System.out.println("*****************************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("*****************************************************");
            System.out.print("Please Enter a command: ");
            menu = xinput.nextLine().toUpperCase();
            switch (menu) {
                case "A": 
                System.out.println("Add a contact");
                System.out.print("Enter the name of the contact: ");
                String name = xinput.next();
                System.out.print("Enter the email address: ");
                String email = xinput.next();
                System.out.print("Enter phone numbers: ");
                String phoneNumber = xinput.next();
                cb.add(name, email, phoneNumber);
                break;
                case "D":
                System.out.print("Enter number to delete: ");
                int delete = xinput.nextInt();
                cb.delete(delete);
                break;
                case "E":
                System.out.print("Enter an E-mail to search for: ");
                String missemail = xinput.next();
                cb.emailSearch(missemail);
                break;
                case "P":
                System.out.println("Printing List...");
                cb.printList();
                break;
                case "S":
                System.out.print("Enter a Name to search for: ");
                String missName = xinput.next();
                cb.nameSearch(missName);
                break;
                case "Q":
                System.out.println("Quitting program...");
                done = true;
                break;
                default:
                System.out.println("Please enter the given input");
            }
        }
        while (!done);
        System.out.println("Thanks for using this program.");
    }
}