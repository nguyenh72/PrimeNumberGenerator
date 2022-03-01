import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Iterator;

class MainTest {
    @Mock
    FindPrimes findPrimesTest;
    @Mock
    List<Integer> listPrimes;

    @Before
    void setUp() {
        int startingValue=0;
        int endingValue=10;
    }
    @Test
    public void testMain()
    {
        // MOCK System.in
        InputStream stdin = System.in;

     //   ResultStore store = mock(ResultStore.class);
        Iterator iterator = mock(Iterator.class);
        //when(store.resultIterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true);
       // when(iterator.next()).thenReturn("Hello");
        //verify(processor).process("Hello");
        when(iterator.hasNext()).thenReturn(false);
        Scanner scan = new Scanner(System.in);
        System.setIn(stdin);
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    @Test
    public void readInputFromSystemIn() {
        Scanner scanner = new Scanner(System.in);
        assertEquals(100, scanner.nextLine());
    }

    @Test
    void testMainException() {
        findPrimesTest = new FindPrimes();
        listPrimes = findPrimesTest.generate(0,0);
     //   when(findPrimesTest.generate(anyInt(),anyInt())).thenThrow(Exception.class);
        Assertions.assertEquals(0,listPrimes.size());
    }
}
