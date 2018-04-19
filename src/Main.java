import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //todo: menu form function
        printMenu();


        int chosen = scanner.nextInt();

        switch (chosen){

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("You have chosen bad number. Pick 6. to show menu");
                break;


        }



        //final development and tests maybe
    }

    public static void printMenu(){
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
