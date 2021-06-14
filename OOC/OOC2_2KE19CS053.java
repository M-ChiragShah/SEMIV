/*
Author : Mohammed Muzammil
Java Assignment 
Semester IV
*/
import java.util.Scanner;
public class OOC2_2KE19CS053{
    public static char enterchar(){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("\nENTER A CHARACTER : ");
        ch = input.next().charAt(0);
        input.close();
        return Character.toLowerCase(ch);
    }
    public static void main(String[] args){
        Scanner  reader = new Scanner(System.in);
        int choice = 0;
        char ch;
        while(choice != 5){
        System.out.println("\nCHARACTER CHECK:\n1. VOWEL\n2. CONSONANT\n3. SPECIAL CHARACTER\n4. NUMBER\n5. EXIT");
        choice = reader.nextInt();
        if(choice != 5){
            switch (choice) {
                case 1:
                    ch = enterchar();
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        System.out.println("\n" + ch + " is a vowel\n");
                    }
                    else{
                        System.out.println("\n" + ch + " is not a vowel\n");
                    }
                    break;
                case 2:
                    ch = enterchar();
                    if((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && ch > 'a' && ch < 'z'){
                        System.out.println("\n" + ch + " is a consonant\n");
                    }
                    else{
                        System.out.println("\n" + ch + " is not a consonant\n");
                    }
                    break;
                case 3:
                    ch = enterchar();
                    if(!(ch >= 'a' && ch <= 'z') && !(ch > '0' && ch < '9')){
                        System.out.println("\n" + ch + " is a special character\n");
                    }
                    else{
                        System.out.println("\n" + ch + " is not a special character\n");
                    }
                    break;
                case 4:
                    ch = enterchar();
                    if(ch >= '0' && ch <= '9'){
                        System.out.println("\n" + ch + " is a number\n");
                    }
                    else{
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