package control;
import model.Operations;
/**
 * clase para gestionar las operaciones para el calculo de la integracion numerica de la distribucion T  
 * y hallar el valor de X mas cercano a p
 * Clase  Controller
 * @author Carolina Caceres
 */
public class Controller { 
    /**
     * Metodo que retorna el valor de x que es igual al valor p
     * Metodo FindValueX
     * @param p
     * @param dof
     * @param x
     * @return 
     * @Parametro p double
     * Parametro dof double
     * Parametro x double t
     * Retorna valor X
     */
     public static double FindValueX(double p, double dof ,int x) {   
         Operations op = new Operations(x);         
         return op.getLimiteF();            
     }
}