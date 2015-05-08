package utils.drivers;

import java.util.ResourceBundle;

/**
 * Created by sgo on 4/28/2015.
 */
public class PropertyManager {

    private static String browserName;
    private static long implicitWait;
    private static long pageLoadTimeout;
    private static ResourceBundle bundle;
    private static String baseUrl;
    private static String firefoxProfile;

    public static void getProperties() {

        bundle = ResourceBundle.getBundle("miscout");
        browserName = bundle.getString("browser.name");
        pageLoadTimeout = Long.parseLong(bundle.getString("pageload.timeout"));
        implicitWait = Long.parseLong(bundle.getString("implicit.wait"));
        firefoxProfile = bundle.getString("firefox.profile");
        baseUrl = bundle.getString("base.url");

    }

    public static BrowserType setBrowser() {
        getProperties();
        BrowserType browserType = null;

        for (BrowserType type : BrowserType.values()) {
            if (browserName.equalsIgnoreCase(type.toString())) {
                browserType = type;
                break;
            } else {
                browserType = BrowserType.FIREFOX;
            }
        }
        return browserType;
    }

    public static Long implicitWait() {
        return implicitWait;
    }

    public static Long pageLoad() {
        return pageLoadTimeout;
    }

    public static String baseUrl() {
        return baseUrl;
    }
    
    public static String firefoxProfile(){
        return firefoxProfile;
    }
}
