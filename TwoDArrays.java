package TwoDArrays;

public class TwoDArrays {
    // 2D Arrays = an Array where each element is Array
    // useful for storing a Matrix of data
public static void main(String[] args) {

    // // String[] fruits = {"apple", "orange", "banana"};
    // // String[] vegetables = {"Potato", "Onion", "carrot"};
    // // String[] meat = {"Chicken", "pork", "beef", "fish"};

    // String[][] groceries = {{"apple", "orange", "banana"}, {"Potato", "Onion", "carrot"}, {"Chicken", "pork", "beef", "fish"}};

    // // groceries[1][2] = "celery";

    // for(String[] foods : groceries){
    //     for(String food : foods){
    //         System.out.print(food + " ");
    //     }
    //     System.out.println();
    // }

    char[][] telephone = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}, {'*','0','#'}};

    for(char[] row : telephone){
        for(char number : row){
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
}
}

