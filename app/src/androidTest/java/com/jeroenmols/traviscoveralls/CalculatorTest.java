package com.jeroenmols.traviscoveralls;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jeroen Mols on 06/09/15.
 */
@RunWith(AndroidJUnit4.class)
public class CalculatorTest extends TestCase {

    @Test
    public void test_add() throws Exception {
        Calculator calculator = new Calculator();

        int result = calculator.add(3, 2);

        assertEquals(5, result);
    }
}
