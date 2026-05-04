package StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String name = "password";

        // int length = name.length();
        // System.out.println("Length of the string: " + length);

        // char letter = name.charAt(2);
        // System.out.println("Character at index 2: " + letter);

        // int index = name.indexOf('b');
        // System.out.println("Index of 'b': " + index);

        // int lastIndex = name.lastIndexOf('e');
        // System.out.println("Last index of 'e': " + lastIndex);

        // name = name.toUpperCase();
        // System.out.println("Uppercase: " + name);

        // name = name.toLowerCase();
        // System.out.println("Lowercase: " + name);

        // name = name.trim();
        // System.out.println("Trimmed: '" + name );

        // name = name.replace('a', 'b');
        // System.out.println("Replaced 'A' with 'b': " + name);

        // System.out.println(name.isEmpty());

        // if (name.isEmpty()) {
        //     System.out.println("The string is empty.");
        // } else {
        //     System.out.println("The string is not empty.");
        // }

        // if(name.contains(" ")) {
        //     System.out.println("The string contains a space.");
        // } else {
        //     System.out.println("The string does not contain a space.");
        // }

        // if(name.equals("password")){
        //     System.out.println("Access granted.");
        // } else {
        //     System.out.println("Access denied.");
        // }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
    
}
