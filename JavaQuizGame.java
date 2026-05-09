package JavaQuizGame;
import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args) {
        // Java Quiz Game
        Scanner scanner = new Scanner(System.in);

        // QUESTIONS Array[]
        String[] questions = {
        "WHAT IS THE MAIN FUNCTION OF A ROUTER?", 
        "WHICH PART OF THE COMPUTER IS CONSIDERED THE BRAIN?", 
        "WHAT YEAR WAS FACEBOOK LAUNCHED?", 
        "WHO IS KNOWN TO BE THE FATHER OF COMPUTERS?", 
        "WHAT IS THE FIRST PROGRAMMING LANGUAGE?"};

        // OPTIONS Array[][]
        String[][] options = {
        {"1. STORING FILES", "2. ENCRYPTING DATA", "3. DIRECTING INTERNET TRAFFIC", "4. MANAGING PASSWORDS"}, 
        {"1. CPU", "2. HARD DRIVE", "3. RAM", "4. GPU"}, 
        {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, 
        {"1. Steve Jobs","2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"}, 
        {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        // DECLARE VARIABLE
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess = 0;

        // WELCOME MESSAGE
        System.out.println("**********************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("**********************************");

        
        
        
        
        // QUESTION(LOOP)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //  OPTIONS 
            for(String option : options[i]) {
                System.out.println(option);
            }
            //  GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  CHECK GUESS
            if(guess == answers[i]){
                System.out.println("**********************************");
                System.out.println("Correct!");
                System.out.println("**********************************");
                score++;
            }else{
                System.out.println("**********************************");
                System.out.println("WRONG!");
                System.out.println("**********************************");  
            }
        }

        // DISPLAY FINAL SCORE
        System.out.println("Your final score is: " + score + " out of " +  questions.length);

        scanner.close();
    }
}
