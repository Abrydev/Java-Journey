package Static;

public class Static {
    public static void main(String[] args) {
        // Static = makes a variable or method belong to the class
        // rather than to any specific object.
        // commonly used for utility methods or shared resource

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");


        friend1.friendName();
        friend2.friendName();
        System.out.println(Friend.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(friend3.numOfFriends);

        Friend.showFriends();
    }
}
