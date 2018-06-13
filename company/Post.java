package com.company;
import java.util.Scanner;

public class Post {

    private static String content;
    private static String webAddress;

    public void Posts() { }

    public static void createPost(String content, String webAddress) { }


    public static String getContent()
    {
        return content;
    }

    public static String getWebAddress()
    {
        return webAddress;
    }

    public static void setContent(String newContent)
    {
        content = newContent;
    }

    public static void setWebAddress(String newWebAddress)
    {
        webAddress = newWebAddress;
    }

}
