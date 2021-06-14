
/*
Author : Mohammed Muzammil
Java Assignment 
Semester IV
*/
import java.util.Scanner;

public class OOC1_2KE19CS053 {
    public static void main(String[] args) {
        // Variable Declarations
        Scanner reader = new Scanner(System.in);
        int choice = 0;
        int op1, op2;
        int result;
        while (choice != 6) {
            System.out.println(
                    "\nCHOOSE ONE OF THE ARITHMETIC OPERATIONS\n1. Addition\n2. Subtraction \n3. Multiplication \n4. Division \n5. Remainder\n6. Exit\n");
            choice = reader.nextInt();
            if (choice != 6) {
                System.out.println("\nEnter the Operands\n");
                System.out.println("\nOperand 1 : ");
                op1 = reader.nextInt();
                System.out.println("\nOperand 2 : ");
                op2 = reader.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\nADDITION\n");
                        result = op1 + op2;
                        System.out.println(op1 + " + " + op2 + " = " + result);
                        break;
                    case 2:
                        System.out.println("\nSUBTRACTION\n");
                        result = op1 - op2;
                        System.out.println(op1 + " - " + op2 + " = " + result);
                        break;
                    case 3:
                        System.out.println("\nMULTIPLICATION\n");
                        result = op1 * op2;
                        System.out.println(op1 + " * " + op2 + " = " + result);
                        break;
                    case 4:
                        System.out.println("\nDIVISION\n");
                        try {
                            result = op1 / op2;
                            System.out.println(op1 + " / " + op2 + " = " + result);
                        } catch (ArithmeticException e) {
                                System.out.println("\nCANNOT DIVIDE BY 0!\n");
                       }
                        break;
                    case 5:
                        System.out.println("\nRemainder\n");
                        result = op1 % op2;
                        System.out.println(op1 + " % " + op2 + " = " + result);
                        break;
                    default:
                        break;
                }
            }
        }
        reader.close();
    }
}