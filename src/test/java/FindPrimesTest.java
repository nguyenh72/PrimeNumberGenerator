import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.swing.text.html.parser.Entity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class FindPrimesTest {

@Mock
Entity testEntity;
@Mock
List<Integer> listPrimes;


    FindPrimes findPrimesTest = new FindPrimes();

    @Before
    void setUp()  {
        //Prime
        int startingValue=1;
        int endingValue=7;
        when(findPrimesTest.isPrime(3)).thenReturn(true);
        when(findPrimesTest.generate(3,7)).thenReturn(listPrimes);

        //not Prime
        when(findPrimesTest.generate(1,1)).thenReturn(Collections.emptyList());
        when(findPrimesTest.isPrime(4)).thenReturn(false);

        listPrimes = findPrimesTest.generate(startingValue,endingValue);
    }

    @Test
    void shouldPrimesorNot() {
        int startingValueEx=1;
        int endingValueEx=0;
        Assertions.assertNull(listPrimes);
        listPrimes = findPrimesTest.generate(2,10);
        listPrimes = findPrimesTest.generate(startingValueEx,endingValueEx);
        Assertions.assertEquals(0,listPrimes.size());
        Assertions.assertTrue(findPrimesTest.isPrime(5));
        Assertions.assertFalse(findPrimesTest.isPrime(10));
    }

   @Test
    public void isPrimeEmpty() {
       listPrimes = findPrimesTest.generate(0,0);
       Assertions.assertEquals(0,listPrimes.size());
    }
}