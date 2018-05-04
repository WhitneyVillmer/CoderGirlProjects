
public class UserData {

    private String userName;
    private String realName;
    private String email;
    private String webAddress;


    public UserData(String userName, String realName, String email, String webAddress) {

        this.userName = userName;
        this.realName = realName;
        this.email = email;
        this.webAddress = webAddress;

    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public String getWebAddress() {
        return webAddress;
    }
}