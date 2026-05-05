package EnhancedSwitches;
import java.util.Scanner;

public class EnhancedSwitches {
    // Enhanced switches are a new feature in Java 14
    // A replacement for too many else if statements

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's weekday");
            case "Saturday", "Sunday" -> System.out.println("It's weekend");
            default -> System.out.println("Invalid day");
    }

    //     switch(day){
    //         case "Monday" -> System.out.println("It's weekday");
    //         case "Tuesday" -> System.out.println("It's weekday");
    //         case "Wednesday" -> System.out.println("It's weekday");
    //         case "Thursday" -> System.out.println("It's weekday");
    //         case "Friday" -> System.out.println("It's weekday");
    //         case "Saturday" -> System.out.println("It's weekend");
    //         case "Sunday" -> System.out.println("It's weekend");
    //         default -> System.out.println("Invalid day");
    // }

    scanner.close();
    }
}
