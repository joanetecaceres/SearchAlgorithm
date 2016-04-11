package model;

/**
 * Clase para gestionar las operaciones matematicas utilizadas en la integracion numerica
 * Clase Operations
 * @author Carolina Caceres
 */
public class Operations {
    
    public static double ACCEPTABLEERROR = 0.015;
    public static double NUM_SEG = 10;
    public static double LIMITEI = 0;
    private double limiteF;
    private double p;
    
    /**
     * Constructor
     * @param mostrar int 
     */
    public Operations(int mostrar){
        double limitef = 0.1;
        double dof=0;
        double pToGet=0;
        if(mostrar == 1){
            dof = 6;
            pToGet = 0.20;                                 
        }
        if(mostrar == 2){
            dof = 15;
            pToGet = 0.45;                                 
        }
        if(mostrar == 3){
            dof = 4;
            pToGet = 0.495;                                 
        }
        findX(limitef, dof, pToGet); 
    }
    
    /**
     * busca el valor x
     * @param limitef double
     * @param dof double
     * @param pToGet double 
     */
    private void findX(double limitef,double dof,double pToGet){
        Data td;
        do{                                             
            td = new Data(LIMITEI,limitef,dof,NUM_SEG);                            
            limitef = limitef+0.001;
        }while(!(td.getP() > pToGet && td.getP()<pToGet+ACCEPTABLEERROR)) ;
        this.limiteF = td.getD().getLimitef();
        this.p = td.getP();
        
    }
    
    public double getLimiteF() {
        return limiteF;
    }
    
}
