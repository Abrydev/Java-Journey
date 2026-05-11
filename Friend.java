package Static;

public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    void friendName(){
        System.out.println("hello " + this.name);
    }

    static void showFriends(){
        System.out.println("you have this amount of friends: " + numOfFriends);
    }
}
