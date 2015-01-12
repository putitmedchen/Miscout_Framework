package utils;

/**
 * Created by sgo on 02.01.2015.
 */
public class User {

    private String login;
    private String password;

    private static User user;

    public static User generateUser() {
        user = new User();
        user.login = "sgo";
        user.password = "sgo";

        return user;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
