package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class InverterTest {



    @Test
    public void shouldInvert() {
        String inverted = new String("  ");

        assertNotNull(inverted);
        assertEquals(0, inverted.trim().length());
        assertFalse(inverted.isEmpty());
        assertEquals("Output is empty ", "", inverted.trim());
       
        assertTrue(false);
        
        Assert.fail();
    }

}
