package prakticeElifHoca.day7;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*

         WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.

		     */
        Scanner scan = new Scanner(System.in);


        String word ="";

        do {

            System.out.println("lutfen bir kelime giriniz : ");
            word= scan.nextLine();

            if (word.length()<3){
                System.out.println("girilen word 3 karekterden az");
            }

            if (word.length()%2==1 && word.length()>=3){
                System.out.println("Ortadaki karekter :"+word.charAt(word.length()/2));
            }else {
                System.out.println("You entered wrong word.");
            }

        }while (!(word.length()%2==1 && word.length()>=3)); // ! buldugumuzda sorguyu tekrar etmesin diye koyduk
    }
}
