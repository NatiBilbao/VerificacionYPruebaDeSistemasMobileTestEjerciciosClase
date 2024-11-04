package ejercicio1.controls;

import ejercicio1.session.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator = locator;
    }

    protected void findControl(){
        control = Session.getInstance().getDevice().findElement(locator);
    }

    public void click(){
        findControl();
        control.click();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
