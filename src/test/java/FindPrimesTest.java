import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.swing.text.html.parser.Entity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class FindPrimesTest {


@Mock
Entity testEntity;
@Mock
List<Integer> listPrimes;


    FindPrimes findPrimesTest = new FindPrimes();

    @BeforeEach
    void setUp() {

        //not Prime
        when(findPrimesTest.isPrime(2)).thenReturn(false);
        when(findPrimesTest.generate(1,2)).thenReturn(Collections.emptyList());

        //not Prime
        when(findPrimesTest.isPrime(3)).thenReturn(true);
        when(findPrimesTest.generate(3,7)).thenReturn(listPrimes);

        listPrimes = findPrimesTest.generate(1,100);
    }

    @Test
    void shouldPrimes() {

        Assertions.assertEquals(true, findPrimesTest.isPrime(3));
        Assertions.assertNotEquals(false, findPrimesTest.isPrime(2));
    }

    @Test
    public void testGenerateException() {
        Throwable exception = assertThrows(Exception.class, () -> findPrimesTest.generate(1,0));
        assertEquals("expected messages", exception.getMessage());
    }

    @Test
    public void isPrimeException() {
        Throwable exception = assertThrows(Exception.class, () -> findPrimesTest.isPrime(0));
        assertEquals("expected messages", exception.getMessage());
    }
}