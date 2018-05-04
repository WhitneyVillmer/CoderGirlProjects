import.java.util.ArrayList;
import.java.util.Iterator;

public class UserPosts {

    private static int nextUserNumber = 0;
    private int userNumber;
    private ArrayList getUserNumber;
    int data;

    public UserPosts() {

        this.userNumber = nextUserNumber;
        nextUserNumber++;
    }

    public ArrayList getUserData() {
        return data;

    }




}
