package edu.escuelaing.arem.ASE.app;

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
            ArrayList<Double> rta=App.calculo("C:/Users/USUARIO/Documents/lab/prueba.txt");
            assertEquals(Math.round(rta.get(0)),Math.round(550.6));
            assertEquals(Math.round(rta.get(1)),Math.round(542.6723));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        assertTrue( true );
    }
    
     public void testApp2()
    {
        try {
            ArrayList<Double> rta=App.calculo("C:/Users/USUARIO/Documents/lab/prueba2.txt");
            assertEquals(Math.round(rta.get(0)),Math.round(60.32));  
            assertEquals(Math.round(rta.get(1)),Math.round(59.06));
        }
        catch(Exception e){
            System.out.println(e.getMessage());    
        }
    }
}