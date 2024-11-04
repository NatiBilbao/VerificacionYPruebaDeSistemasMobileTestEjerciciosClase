package ejercicio1.testSuite;

import ejercicio1.activities.HomeActivity;
import ejercicio1.activities.InicioSesionActivity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IniciarYCerrarSesisonTest {

    HomeActivity homeActivity = new HomeActivity();
    InicioSesionActivity inicioSesionActivity = new InicioSesionActivity();

    @Test
    public void iniciarCerrarSesionTest() throws InterruptedException {
        homeActivity.menuPrincipal.click();
        homeActivity.inicioSesion.click();
        inicioSesionActivity.userName.click();
        inicioSesionActivity.elegirUsuario.click();
        inicioSesionActivity.password.click();
        inicioSesionActivity.elegirPassword.click();
        inicioSesionActivity.signIn.click();
        homeActivity.menuPrincipal.click();
        homeActivity.logout.click();
        Thread.sleep(800);

        Assertions.assertTrue(homeActivity.logout.isControlDisplayed(), "ERROR no se inicio la sesion correctamente");

        homeActivity.menuPrincipal.click();
        Thread.sleep(800);

        Assertions.assertTrue(homeActivity.inicioSesion.isControlDisplayed(), "ERROR no cerro la sesion correctamente");
    }

}
