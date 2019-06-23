package com.sonar.sample;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App obj = new App();
    
    @Test
    public void testApp()
    {
        assertEquals(10,obj.adder(4,6));
    }
}
