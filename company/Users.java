package com.company;
import java.util.Scanner;

public class Users {

    private static String avatarLink;
    private static String userName;
    private static String authorName;
    private static String email;

    public Users(){}

    public static void createUser(){
        String avatarLink;
        String userName;
        String authorName;
        String email;
    }

   public static void createUser(String avatarLink, String userName, String authorName, String email)
    {
    }

    public static String getAvatarLink()
    {
        return avatarLink;
    }

    public static String getUserName()
    {
        return userName;
    }

    public static String getAuthorName()
    {
        return authorName;
    }

    public static String getEmail()
    {
        return email;
    }

    public static void setAvatarLink(String newAvatarLink)
    {
        avatarLink = newAvatarLink;
    }

    public static void setUserName(String newUserName)
    {
        userName = newUserName;
    }

    public static void setAuthorName(String newAuthorName)
    {
        authorName = newAuthorName;
    }

    public static void setEmail(String newEmail)
    {
        email = newEmail;
    }

}
