package LearnJavaFiles.Static;

public class Friend {

    // Instead of all the friend objects using this by themselves.
    // There are the static and its owner by the class, so when you call it, you call it like Friend.numOfFriends
    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

     static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}