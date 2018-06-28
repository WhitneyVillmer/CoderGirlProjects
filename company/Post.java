package com.company;

public class Post {

    //Need to add user name to post
    //Create a method for posts
    //Variable tracking current user lets us know that's the most recent post (compares in main) when they equal each other

    private String userName;
    private int order;
    private String content;


    public Post(String userName, int order, String content)
    {
        this.userName = userName;
        this.order = order;
        this.content = content;
    }

    public String getUserName() { return userName; }


    public String getContent()
    {
        return content;
    }

    public void setContent(String newContent)
    {
        content = newContent;
    }


}