/*
Author : Mohammed Muzammil
Java Assignment 
Semester IV
*/
import java.util.Scanner;
public class OOC1_2KE19CS053{
    public static void main(String[] args){
        //Variable Declarations
        Scanner reader = new Scanner(System.in);
        int choice;
        int op1,op2,result;
        System.out.println("\nCHOOSE ONE OF THE ARITHMETIC OPERATIONS\n1. Addition\n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus\n");
        choice = reader.nextInt();
        System.out.println("\nEnter the Operands\n");
        System.out.println("\nOperand 1 : ");
        op1 = reader.nextInt();
        System.out.println("\nOperand 2 : ");
        op2 = reader.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nADDITION\n");
                
                break;
        
            default:
                break;
        }
    }
}