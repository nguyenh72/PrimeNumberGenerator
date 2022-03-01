import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// call generate interface
class FindPrimes implements PrimeNumberGenerator{

    public List<Integer> generate(int startingValue, int endingValue)   {
        List<Integer> listPrimes = new ArrayList<>();
            for (int n = startingValue; n < endingValue; n++) {
                    if (isPrime(n))
                        listPrimes.add(n);
            }
        return listPrimes;
    }

    public boolean isPrime(int value) {
            boolean returvalue = value > 1
                    && IntStream.range(2, value).noneMatch(n -> (value % n == 0));
            return returvalue;
    }
}
