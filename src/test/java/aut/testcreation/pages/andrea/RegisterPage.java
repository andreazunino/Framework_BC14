package aut.testcreation.pages.andrea;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends SeleniumWrapper {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    By locatorEmail = By.id("email");
    By locatorPassword = By.name("password");
    By locatorRepeatPassword = By.name("password-confirm");
    By locatorRegistrar = By.xpath("//*[@id=\"btnRegister\"]");

    By locatorErrorContrasenia = By.xpath("//*[@id=\"password-help-text\"]");

            //"//*[@id=\"password-help-text\"]");

    String resultadoEsperado = corregirEncoding("La contraseña debe contener al menos 8 caracteres, una mayúscula.");

    By locatorBtnCancelar = By.xpath("//a[@id='reset-login']");
    //Centralizar Acciones

    public void completarFormularioRegistro(String correo, String password){

        escribirTexto(esperarPorElementoLocalizado(locatorEmail),correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword),password);
        escribirTexto(esperarPorElementoLocalizado(locatorRepeatPassword),password);

        //Assertions.assertEquals(resultadoEsperado,obtenerTexto(esperarPorElementoLocalizado(locatorErrorContrasenia)));
       // click(esperarPorElementoLocalizado(locatorIngresar));
    }
    public void Registrar(){
        click(esperarPorElementoLocalizado(locatorRegistrar));
    }
    public void errorContrasenia(){
        Assertions.assertEquals(resultadoEsperado,obtenerTexto(esperarPorElementoLocalizado(locatorErrorContrasenia)));

    }
    public void cancelarRegistracion(){
        /*escribirTexto(esperarPorElementoLocalizado(locatorEmail),correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword),password);
        escribirTexto(esperarPorElementoLocalizado(locatorRepeatPassword),password);

        Assertions.assertEquals(resultadoEsperado,obtenerTexto(esperarPorElementoLocalizado(locatorErrorContrasenia)));
        click(esperarPorElementoLocalizado(locatorIngresar));*/

        click(esperarPorElementoLocalizado(locatorBtnCancelar));
    }
}



