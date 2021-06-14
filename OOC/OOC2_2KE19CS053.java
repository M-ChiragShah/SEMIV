/*
Author : Mohammed Muzammil
Java Assignment 
Semester IV
*/
import java.util.Scanner;

public class OOC2_2KE19CS053 {
    public static char enterchar(Scanner input) {
        char ch;
        System.out.println("\nENTER A CHARACTER : ");
        ch = input.next().charAt(0);
        return Character.toLowerCase(ch);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice = 0;
        char ch;
        while (choice != 5) {
            choice = 0;
            System.out.println("\nCHARACTER CHECK:\n1. VOWEL\n2. CONSONANT\n3. SPECIAL CHARACTER\n4. NUMBER\n5. EXIT");
            choice = reader.nextInt();
            if (choice != 5) {
                switch (choice) {
                    case 1:
                        ch = enterchar(reader);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            System.out.println("\n" + ch + " is a vowel\n");
                        } else {
                            System.out.println("\n" + ch + " is not a vowel\n");
                        }
                        break;
                    case 2:
                        ch = enterchar(reader);
                        if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && ch > 'a' && ch < 'z') {
                            System.out.println("\n" + ch + " is a consonant\n");
                        } else {
                            System.out.println("\n" + ch + " is not a consonant\n");
                        }
                        break;
                    case 3:
                        ch = enterchar(reader);
                        if (!(ch >= 'a' && ch <= 'z') && !(ch > '0' && ch < '9')) {
                            System.out.println("\n" + ch + " is a special character\n");
                        } else {
                            System.out.println("\n" + ch + " is not a special character\n");
                        }
                        break;
                    case 4:
                        ch = enterchar(reader);
                        if (ch >= '0' && ch <= '9') {
                            System.out.println("\n" + ch + " is a number\n");
                        } else {
                            System.out.println("\n" + ch + " is not a number\n");
                        }
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
OUTPUT:
CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
1

ENTER A CHARACTER : 
a

a is a vowel


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
1

ENTER A CHARACTER : 
q

q is not a vowel


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
2

ENTER A CHARACTER : 
e

e is not a consonant


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
2

ENTER A CHARACTER : 
b

b is a consonant


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
3

ENTER A CHARACTER : 
w

w is not a special character


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
3

ENTER A CHARACTER : 
#

# is a special character


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
4

ENTER A CHARACTER : 
@

@ is not a number


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
4

ENTER A CHARACTER : 
h

h is not a number


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
4

ENTER A CHARACTER : 
3

3 is a number


CHARACTER CHECK:
1. VOWEL
2. CONSONANT
3. SPECIAL CHARACTER
4. NUMBER
5. EXIT
5
*/