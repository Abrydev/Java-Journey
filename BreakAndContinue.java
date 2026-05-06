package BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break = break out of a loop (STOP)
        // Continue = Skip current iteration of a Loop (SKIP)

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                continue;
            }

            // if(i == 5){
            //     break;
            // }

            System.out.print(i + " ");
        }
    }
}
