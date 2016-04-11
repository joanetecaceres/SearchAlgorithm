import static spark.Spark.*;
import control.Controller;
import static spark.Spark.get;
/**
 * Esta clase administra la vista de la pagina y muestra los resultados de los casos de prueba
 * Clase  Main
 * @author Carolina Caceres
 */
public class Main {
    /**
     * Metodo main 
     * @param args argumentos
     */
    public static void main(String[] args) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/FindValueX", (req, res) -> {            
           String resultHtml="<!DOCTYPE html><br>" +
                   "<html><br>" +
                   "<head><br>" +
                   "<style><br>" +
                   "table, th, td {<br>" +
                   "    border: 1px solid gray;<br>" +
                   "    border-collapse: collapse;<br>" +
                   "}<br>" +
                   "th, td {<br>" +
                   "    padding: 5px;<br>" +
                   "}<br>" +
                   "</style><br>" +
                   "</head><br>" +
                   "<body><br>" +
                   "<br>" +
                   "<table style=\"width:100%\"><br>" +
                   "  <tr><br>" +
                   "    <th>p</th><br>" +
                   "    <th>dof</th><br>" +
                   "    <th>Expected Value</th><br>" +
                   "    <th>Actual Value</th><br>" +
                   "   <br>" +
                   "  </tr><br>" +
                   "  <tr><br>" +
                   "    <td>0.20</td><br>" +
                   "    <td>6</td><br>" +
                   "    <td>0.55338</td><br>" +
                   "    <td>"+ Controller.FindValueX(0.20,6,1) +"</td><br>" +
                   "    <br>" +
                   "  </tr><br>" +
                   "  <tr><br>" +
                   "    <td>0.45</td><br>" +
                   "    <td>15</td><br>" +
                   "    <td>1.75305</td><br>" +
                   "    <td>"+  Controller.FindValueX(0.20,6,2)  +"</td><br>" +
                   "    <br>" +
                   "  </tr><br>" +
                   "  <tr><br>" +
                   "    <td>0.495</td><br>" +
                   "    <td>4</td><br>" +
                   "    <td>4.60409</td><br>" +
                   "    <td>"+  Controller.FindValueX(0.20,6,3) +"</td><br>" +
                   "    <br>" +
                   "  </tr><br>" +                        
                   "</table><br>" +
                   "<br>" +
                   "</body><br>" +
                   "</html>";            
           return resultHtml;            
        });
    }
}