package PrintF;

public class PrintF {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // % [flags] [precision] [width] [specifier-character]

        String name = "Alice";
        char firstLetter = 'A';
        int age = 16;
        double height = 1.65;
        boolean isStudent = true;

        // [specifier-character]
        System.out.printf("My name is %s\n", name);
        System.out.printf("My first letter is %c\n", firstLetter);
        System.out.printf("I am %d years old\n", age);
        System.out.printf("I am %f meters tall\n", height);
        System.out.printf("I am a student: %b\n", isStudent);
        System.out.printf("%s is %d years old\n", name, age);

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers in parentheses
        // space = display a minus sign for negative numbers and a space for positive numbers

        // [precision]
        double price1 = 9.99;
        double price2 = 19.99;
        double price3 = -29.99;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        // [width]
        // 0= zero padding
        // number = right justify padding
        // negative number = left justify padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
