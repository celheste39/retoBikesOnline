package pages;

import org.openqa.selenium.By;

public class Bike_Page {
    static By barraBusqueda = By.xpath("//input[@class='form-control ajax_search findify-autocomplete-search-selector']");
    static By btnLupaBuscar = By.xpath("//button[@class='btn btn-info']");
    static By btnHome = By.xpath("//div[@class='col-xs-6 col-sm-5 col-md-3 wrapper-logo']");
    static By producto = By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div/a");
    static By validador;
    static By mostrador = By.xpath("//div[@class='findify-components--cards--product__image-wrap']");

    public static By getBarraBusqueda(){
        return barraBusqueda;
    }
    public static By getBtnLupaBuscar(){
        return btnLupaBuscar;
    }
    public static By getBtnHome(){
        return btnHome;
    }
    public static By getProducto() {
        return producto;
    }
    public static By getValidador() {
        return validador;
    }
    public static void setValidador(String producto) {
        Bike_Page.validador = By.xpath("//h1[contains(text(),'"+ producto +"')]//ancestor::div[@class='wrapper-product-title col-sm-12']");
    }
    public static By getMostrador(){
        return mostrador;
    }

}
