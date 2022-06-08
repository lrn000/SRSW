package edu.escuelaing.arsw.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CountLinesTest
    extends TestCase
{

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testLocCountLines(){
        assertTrue(LocCountLines.numberOfLines("src/main/resources/Person.java")==5);
    }

    public void testPhyCountLines(){
        assertTrue(PhyCountLines.numberOfLines("src/main/resources/Person.java")==18);
    }
}
