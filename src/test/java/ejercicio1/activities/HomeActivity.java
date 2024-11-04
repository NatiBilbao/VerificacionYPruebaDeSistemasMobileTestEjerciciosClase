package ejercicio1.activities;

import ejercicio1.controls.Button;
import org.openqa.selenium.By;

public class HomeActivity {
    public Button menuPrincipal = new Button(By.xpath("\t\n" + "//android.widget.TextView[@text=\"\uE5D2\"]"));

    public Button inicioSesion = new Button(By.xpath("\t\n" + "//android.view.ViewGroup[@content-desc=\"16\"]"));

    public Button logout = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"16\"]"));
}
