package TernaryOperation;

public class TernaryOperation {
    public static void main(String[] args) {
        // Ternary operator syntax: condition ? expression1 : expression2
        // ternary operator ? = return 1 of 2 values if a condition is true or false
        // Variable = (condition) ? isTrue : isFalse;

        int score = 55;

        if (score >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        String PassOrFail = (score >= 60) ? "Passed" : "Failed";
        System.out.println(PassOrFail);

        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        int income = 60000;

        String taxRate = (income >= 40000) ? "0.25" : "0.15";
        System.out.println(taxRate);
    }
    
}
