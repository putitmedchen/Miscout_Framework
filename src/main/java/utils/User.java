package utils;

/**
 * Created by sgo on 02.01.2015.
 */
public class User {

    private String login;
    private String password;

    private static User user;
    
    public User (String login, String password){
        this.login = login;
        this.password = password;
    }

    public static User generateUser() {
        user = new User("sgo", "sgo");
        return user;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    
    
}
