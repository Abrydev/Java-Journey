package RandomNumbers;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        // int number1;
        // int number2;
        // int number3;

        // double number;

        boolean isHeads;

        isHeads = random.nextBoolean();

        // number = random.nextDouble();

        // number1 = random.nextInt(1, 101);
        // number2 = random.nextInt(1, 101);
        // number3 = random.nextInt(1, 101);

        if(isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
        // System.out.println(number);
        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);
    }
}
