
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

class CalculationTest {



   @Test
   public void checkIfVarEquale () {
       int variable1 = 5;
       int variable2 = 6;
       assertTrue(variable1 < variable2); //true ===> test valid-pass
       assertFalse(variable1 > variable2); //false ===> test valid -pass
       assertTrue(variable1 == variable2); //false ===> testinvalid -fail
   }

   @Test
   public void checkArrays() {
       int[] Array1 =  {22,10,5,4};
       int[] Array2 =  {22,10,5,5};
       assertArrayEquals(Array1, Array2, "Array equale test");

   }


    @BeforeEach
    public void printMessage() {
        System.out.println("We are test Experts!");
    }

    @AfterEach
    public void afterPrintMessage() {
        System.out.println("after test message");
    }
    
    @Test

    public void testFindMax() {

        assertEquals(5, Calculation.findMax(new int[]{1,5,2,3}));
        assertEquals(-1, Calculation.findMax(new int[]{-12,-5,-1,-3})); //array[0] = -12 array[1] = -5
    }

//    //if the action is limited in time

    @Timeout(value = 4, unit = TimeUnit.SECONDS) //i expect the testcase to be executed in max 4 seconds
    @Test
    public void testExecutionTimeFindMax() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);   // make my method go to sleep for 7 seconds
        assertEquals(5, Calculation.findMax(new int[]{1,5,2,3}));
    }

    @Disabled //analog to Ignore
    public void testExecutionTimeFindMin() throws InterruptedException {
        TimeUnit.SECONDS.sleep(7);
        assertEquals(5, Calculation.findMax(new int[]{1,5,2,3}));
    }

}