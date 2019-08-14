package edu.escuelaing.arem.ASE.app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        try {
            DecimalFormat df = new DecimalFormat("#.00");
            ArrayList<Double> rta=App.calculo("C:/Users/USUARIO/Documents/lab/prueba.txt");
            assertEquals(df.format(rta.get(0)),"550.60");
            assertEquals(df.format(rta.get(1)),"572.03");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     public void testApp2()
    {
        try {
            DecimalFormat df = new DecimalFormat("#.00");
            ArrayList<Double> rta=App.calculo("C:/Users/USUARIO/Documents/lab/prueba2.txt");
            assertEquals(df.format(rta.get(0)),"60.32");  
            assertEquals(df.format(rta.get(1)),"62.26");
        }
        catch(Exception e){
            System.out.println(e.getMessage());    
        }
    }
}