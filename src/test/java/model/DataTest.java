package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 * Clase TablaDatosTest JUnit 
 * @author alvaro suarez
 * @version 1.0.20150225
 * @since 1.0.20150225
 */
public class DataTest extends TestCase {
    
    public DataTest(String testName) {
        super(testName);
    }
    /**
     * Test of truncDouble method, of class Data.
     */
    public void testTruncDouble() throws Exception {
        System.out.println("truncDouble");
        double d = 1.123456789;
        Data instance = new Data(0,0.55338,6,10);
        double expResult = 1.12346;
        double result = instance.truncDouble(d);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of la_gamma method, of class Data.
     */
    public void testLa_gamma() {
        System.out.println("gamma");
        double x = 4.5;
        Data instance = new Data(0,0.55338,6,10);
        double expResult = 11.631728396567446;
        double result = instance.la_gamma(x);
        
        assertEquals(expResult, result);       
    }
    /**
     * Test de calculo de Data.
     */
    public void escenarioCalculo() {
        System.out.println("FindValueX");
        double incertidumbre = 0.01;
        Data instance = new Data(0,0.55338,6,10);
        double expResult = 0.35006;
        double result = instance.getP();
        assertTrue("fail",result>expResult && result<expResult+incertidumbre);
    }
    
}
