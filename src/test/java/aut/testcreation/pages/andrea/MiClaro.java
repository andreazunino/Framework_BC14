package aut.testcreation.pages.andrea;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MiClaro extends SeleniumWrapper {

    By locatorBtnRegistrar = By.xpath("//a[contains(@id,'body-secondary-btn')]");

    public void irARegistrar() {
        //click(locatorBtnRegistrarte);
        esperarXSegundos(3000);
        click(esperarPorElementoLocalizado(locatorBtnRegistrar));

    }

    public MiClaro(WebDriver driver) {
        super(driver);
    }
}
