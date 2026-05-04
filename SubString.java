package SubString;
import java.util.Scanner;

public class SubString {
    // substring() = A method used to extract a portion of a string.
    // string.substring(start, end)

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String  domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);   

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Invalid email address. Please include an '@' symbol."); 
        }
;

        // String email = "rmuhammadaubrey@gmail.com";
        // String username = email.substring(0, email.indexOf("@"));
        // String domain = email.substring(email.indexOf("@") + 1);
        // String domain = email.substring(16, 25); 
        // this is not a good way to do it because if the email changes the code will not work but with the indexOf() method it will work no matter what the email is.

        scanner.close();
    }
    }
