package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCalc {
    @Test
    public  void test_summ() {
        calc calculator = new calc();
        int result = calculator.summ(2,3 );
        assertEquals(5, result);
        }
    @Test
public void test_subtract() {
    calc calculator = new calc();
    int result = calculator.subtract(5,2);
    assertEquals(3, result);}
}
