package Method;

public class Method {
    // D.R.Y = Don't Repeat Yourself
    public static void main(String[] args) {
        // Method = a block of reuseable code that is executed when called ()
        // like a function in python

        // String name = "Aubrey";
        // int age = 16;


        // happyBirthday(age, name);
        // happyBirthday(age, name);
        // happyBirthday(age, name);

        System.out.println(square(3));
        System.out.println(cube(3));

        String fullName = getFullName("Muhammad", "Aubrey");
        System.out.println(fullName);

        int age = 21;

        if(ageCheck(age)){
            System.out.println("You may sign up");
        }else{
            System.out.println("you must be 18+ to sign up");
        }
    }
    static void happyBirthday(int age, String name){
        System.out.println("Happy birth day to you!");
        // System.out.println("Happy birth day dear you!");
        System.out.printf("Happy birth day dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birth day to you!\n");

    }
    
    static double square(double number){
        return number * number;
    }
    
    static double cube(double number){
        return number * number * number;
    }
    
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static Boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }

        // OR
        // return age >= 18;
    }
}
