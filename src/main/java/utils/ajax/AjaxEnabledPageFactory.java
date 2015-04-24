//package utils.ajax;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
//
//import utils.ajax.StaleReferenceAwareFieldDecorator;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//import static utils.ajax.SeleniumUtility.*;
//
//public class AjaxEnabledPageFactory extends PageFactory{
//
//
//    @SuppressWarnings("unchecked")
//
//    public static  T initializePage(WebDriver driver, Class pageClass) {
//
//        Object page = createInstance(driver, pageClass);
//
//        PageFactory.initElements(new StaleReferenceAwareFieldDecorator(
//
//                new AjaxElementLocatorFactory(driver,
//
//                        timeOutInSeconds)), page);
//
//        return (T) page;
//
//    }
//
//    public static Object createInstance(WebDriver driver, Class pageClassToProxy){
//
//        try {
//
//            try {
//
//                Constructor constructor = pageClassToProxy.getConstructor(WebDriver.class);
//
//                return constructor.newInstance(driver);
//
//            } catch (NoSuchMethodException e) {
//
//                return pageClassToProxy.newInstance();
//
//            }
//
//        } catch (InstantiationException e) {
//
//            throw new RuntimeException(e);
//
//        } catch (IllegalAccessException e) {
//
//            throw new RuntimeException(e);
//
//        } catch (InvocationTargetException e) {
//
//            throw new RuntimeException(e);
//
//        }
//
//    }
//
//}
