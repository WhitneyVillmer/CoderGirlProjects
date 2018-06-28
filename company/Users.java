package com.company;

public class Users {

    private String avatarLink;
    private String userName;
    private String authorName;
    private String email;


    public Users(String avatarLink, String userName, String authorName, String email)
    {
        this.avatarLink = avatarLink;
        this.userName = userName;
        this.authorName = authorName;
        this.email = email;
    }

    public String getAvatarLink()
    {
        return avatarLink;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setAvatarLink(String newAvatarLink)
    {
        avatarLink = newAvatarLink;
    }

    public void setUserName(String newUserName)
    {
        userName = newUserName;
    }

    public void setAuthorName(String newAuthorName)
    {
        authorName = newAuthorName;
    }

    public void setEmail(String newEmail)
    {
        email = newEmail;
    }

}