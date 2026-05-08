package Array;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Array = a collection of values of same data type
        // * Think of it as a variable that can store more than 1 value *

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

        // fruits[0] = "pineapple";
        // int numOfFruits = fruits.length;

        // for(int i = 0; i < fruits.length; i++){
        //     // System.out.println(fruits[0]);
        //     System.out.print(fruits[i] + " ");
        // }

        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // System.out.println(numOfFruits);
    }
}
