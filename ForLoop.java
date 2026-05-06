package ForLoop;

import java.util.Scanner;

public class ForLoop {
    // for loop = execute some code a CERTAIN amount of times
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to count down from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year");

        // System.out.print("Enter how many times you want to loop: ");
        // int max = scanner.nextInt();

        // for(int i = 1; i <= max; i++){
        //     System.out.println(i);
        // }

        scanner.close();
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 10; i > 0; i--) {
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= 10; i+=2) {
        //     System.out.println(i);
        // }

        // for (int i = 10; i > 0; i-=3) {
        //     System.out.println(i);
        // }
    }
}
