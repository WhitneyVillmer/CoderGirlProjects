import java.util.Scanner;
import java.util.Iterator;

//ADD WEB ADDRESS TO THE USERDATA CONSTRUCTOR AND THE OBJECT IN THIS FILE
public class MicroBlog {
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
    }

    public static UserData[] createMenu() {

        UserData[] data = new UserData[4];
        data[0] = new UserData("Sigourney Weaver", "sweaver", "sweaver@gmail.com", "http://www.avpics.com/sig");
        data[1] = new UserData("Grace Augustine", "pandoradoc", "drpandora@gmail.com", "http://www.avpics.com/pandoc");
        data[2] = new USerData("Ellen Ripley", "returnofripley", "iheartjonesy@gmail.com", "http://www.avpics.com/ripley");
        data[3] = new UserData("Katharine Parker", "kparker", "kparker@gmail.com", "http://www.avpics.com/kpark");

        return data;
    }

    public static void orderNumber(UserData[] data) {
        for (int counter = 0; counter < data.length; counter++) {
            System.out.println(counter + " . " + data[counter].UserPosts());
        }
    }
}
