import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DigitNumbersTest {
    /**
     * Тест на выбрасивания эксепшена при вводе негативного числа
     */
    @Test(expected = IllegalArgumentException.class)
    public void negativeNumberTest() {
        int n = -100 ;
        int result = DigitNumbers.counting(n);
        assertEquals(0,result);
    }
    /**
     * Тест на проверку работоспособности программы
     */
    @org.junit.Test
    public void efficiencyTest() {
        int n = 100000;
       int result =  DigitNumbers.counting(n);
        assertEquals(6,result);
    }
    /**
     * Тест на выбрасивания эксепшена при вводе нуля
     */
    @org.junit.Test
    public void zeroTest() {
        int n = 0;
        int result =  DigitNumbers.counting(n);
        assertEquals(1,result);
    }

}