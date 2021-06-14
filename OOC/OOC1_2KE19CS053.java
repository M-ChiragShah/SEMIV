
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
/*
OUTPUT :
CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

1

Enter the Operands


Operand 1 : 
1

Operand 2 : 
2

ADDITION

1 + 2 = 3

CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

2

Enter the Operands


Operand 1 : 
1

Operand 2 : 
2

SUBTRACTION

1 - 2 = -1

CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

3

Enter the Operands


Operand 1 : 
2

Operand 2 : 
2

MULTIPLICATION

2 * 2 = 4

CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

4

Enter the Operands


Operand 1 : 
1

Operand 2 : 
0

DIVISION


CANNOT DIVIDE BY 0!


CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

4

Enter the Operands


Operand 1 : 
4

Operand 2 : 
2

DIVISION

4 / 2 = 2

CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

5

Enter the Operands


Operand 1 : 
5

Operand 2 : 
2

Remainder

5 % 2 = 1

CHOOSE ONE OF THE ARITHMETIC OPERATIONS
1. Addition
2. Subtraction 
3. Multiplication 
4. Division 
5. Remainder
6. Exit

6
*/