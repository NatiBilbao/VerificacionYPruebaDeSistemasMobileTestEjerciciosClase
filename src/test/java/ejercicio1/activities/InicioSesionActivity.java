package ejercicio1.activities;

import ejercicio1.controls.Button;
import org.openqa.selenium.By;

public class InicioSesionActivity {
    public Button userName = new Button(By.xpath("//android.widget.Spinner[@content-desc=\"username-input\"]"));
    public Button elegirUsuario = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"demouser\"]\n"));

    public Button password = new Button(By.xpath("\t\n" + "//android.widget.Spinner[@content-desc=\"password-input\"]"));
    public Button elegirPassword = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"testingisfun99\"]\n"));

    public Button signIn = new Button(By.xpath("\t\n" + "//android.widget.TextView[@text=\"Sign in\"]"));
}
