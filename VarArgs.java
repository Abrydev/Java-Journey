package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        // Varargs = Allow a method to accept a Varying # of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ...(ellipsis)

        // System.out.println(add(1,2,3,4));
        System.out.println(average());
    }

    // static int add(int... numbers){
    //     int sum = 0;
    //     for(int number : numbers){
    //         sum += number;
    //     }

    //     return sum;
    // }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}

