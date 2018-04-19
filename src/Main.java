import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123 123 123");

    public static void main(String[] args) {

        //todo: menu form function
        printMenu();

        boolean quit = false;

        while(!quit){
            int chosen = scanner.nextInt();
            scanner.nextLine();

            switch (chosen){

                case 1:
                    addNewContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    mobilePhone.printContacts();
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("You have chosen bad number. Pick 6. to show menu");
                    break;


            }


        }




        //final development and tests maybe
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone numer");
        String phone = scanner.nextLine();
        Contact newContact = Contact.creatContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + " phone "+ phone);
        }else {
            System.out.println("Can't added: " + name + " phone "+ phone);
        }
    }

    private static void findContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: "+ existingContactRecord.getName()+" phone numer found.");
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Eneter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Eneter new contact phone");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.creatContact(newName,newPhone);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Sucessfully updated record");
        }else{
            System.out.println("Error updating");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Sucessfully deleted");
        }else{

            System.out.println("Error deleted");
        }
    }

    private static void printMenu(){
        System.out.println("..::      Menu       ::..");
        System.out.println("..::   Pick number   ::..");
        System.out.println("1..::   Add contact  ::..");
        System.out.println("2..::  Find contact  ::..");
        System.out.println("3..:: Update contact ::..");
        System.out.println("4..:: Delete contact ::..");
        System.out.println("5..::  Show contact  ::..");
        System.out.println("6..::    Show menu   ::..");
        System.out.println("7..::      Quit      ::..");
        System.out.println("..::                 ::..");
    }

}
