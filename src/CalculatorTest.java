import JavaWeb.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    //Test addition with positive integers,negative integers and decimals
    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3, 7),0);
        assertEquals(-17, calculator.add(-9, -8),0);
        assertEquals(8.8, calculator.add(6.5, 2.3),0);
    }

    //Test subtraction with positive integers,negative integers and decimals
    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();
        assertEquals(-4, calculator.sub(3, 7),0);
        assertEquals(-1, calculator.sub(-9, -8),0);
        assertEquals(4.2, calculator.sub(6.5, 2.3),0);
    }
    //Test multiplication with positive integers,negative integers and decimals
    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(21, calculator.multiply(3, 7),0);
        assertEquals(72, calculator.multiply(-9, -8),0);
        assertEquals(14.95, calculator.multiply(6.5, 2.3),0);
    }

    /*
    *Test division with positive integers,negative integers and decimals
    * Test division by zero
     */
    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5),0);
        assertEquals(1.125, calculator.divide(-9, -8),0);
        assertEquals(5.999999999999999, calculator.divide(6.6, 1.1),0);
        assertEquals("error", calculator.divide(1, 0));
    }
//    //Test CLS button
//    /*
//    *input method is to record input numbers and symbols
//    * After we call clickCLS method, contents in the input box should be cleared and reset to 0
//    * here we need to compare the expected value 0 with the actual data in the display area
//    * it is worth noting that pseudocode was used here
//     */
//    @Test
//    public void testCLS() {
//        Calculator calculator = new Calculator();
//        calculator.input(1);
//        calculator.clickCLS();
//        assertEquals(0, calculator.getDisplay(),0);
//    }

}
