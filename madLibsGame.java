package madLibsGame;
import java.util.Scanner;

public class madLibsGame {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner input = new Scanner(System.in);

        String Adjective1;
        String Noun1;
        String Verb1;
        String Adjective2;
        String Adjective3;

        System.out.println("Welcome to the Mad Libs Game!");
        System.out.print("Please enter an adjective (description): ");
        Adjective1 = input.nextLine();
        System.out.print("Please enter a noun (animal or person): ");
        Noun1 = input.nextLine();
        System.out.print("Please enter an adjective (description): ");
        Adjective2 = input.nextLine();
        System.out.print("Please enter a verb end with -ing (action): ");
        Verb1 = input.nextLine();
        System.out.print("Please enter an adjective (description): ");
        Adjective3 = input.nextLine();
        input.nextLine()
;


        System.out.println("Today I went to " + Adjective1 + " zoo.");
        System.out.println("In a exhibit i saw a " + Noun1 + ".");
        System.out.println(Noun1 + " was " + Adjective2 + " and " + Verb1 + "!");
        System.out.println("I was " + Adjective3 + "!");

        input.close();
    }
}
