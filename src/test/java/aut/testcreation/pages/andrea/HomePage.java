package aut.testcreation.pages.andrea;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends SeleniumWrapper {
    //Definir los localizadores
    By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");
    By locatorBtnTienda = (By.xpath("//*[@id=\"content\"]/div[2]/li[3]/a/h2"));

    //Centralizar las acciones
    /*public MiClaro irMiClaro(){
        //click(locatorBtnRegistrarte);
        click(esperarPorElementoLocalizado(locatorBtnMiClaro));

        return null
    }*/
    public void irMiClaro(){
        click(esperarPorElementoLocalizado(locatorBtnMiClaro));
    }

    public void irATienda(){
        click(esperarPorElementoLocalizado(locatorBtnTienda));
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
