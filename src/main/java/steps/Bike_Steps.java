package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.Bike_Page;
import utils.Bike_Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class Bike_Steps {

    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();
    public static void escrituraBarra(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }
    public static String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public static void seleccion(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public static boolean esperar(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).isDisplayed();
    }
    public static void validarTexto(By elemento, String texto){
        assertEquals(obtenerTexto(elemento), texto);
    }
    public static void stepConBike_Excel(){
        try {
            lecturaExcel = Bike_Excel.readExcel("C:\\Users\\megat\\Desktop\\ProductosReto.xlsx", "Hoja1");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < lecturaExcel.size(); i++) {
            escrituraBarra(Bike_Page.getBarraBusqueda(), lecturaExcel.get(i).get("PRODUCTO"));
            try {
                Thread.sleep(3000);
                seleccion(Bike_Page.getBtnLupaBuscar());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
                if (esperar(Bike_Page.getMostrador())){
                    seleccion(Bike_Page.getProducto());
                }
                else{
                    System.out.println("e");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
                Bike_Page.setValidador(lecturaExcel.get(i).get("PRODUCTO"));
                validarTexto(Bike_Page.getValidador(), lecturaExcel.get(i).get("PRODUCTO"));
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seleccion(Bike_Page.getBtnHome());
        }
    }
}
