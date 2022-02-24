import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// call generate interface
class FindPrimes implements PrimeNumberGenerator{

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> listPrimes = new ArrayList<>();
        try {
            for (int n = startingValue; n <= endingValue; n++) {
                int i = 2;
                while (i <= n / 2) {
                    if (isPrime(n)) {
                        listPrimes.add(i);
                    }
                }
            }
         System.out.println("use given interface to add in value:" + listPrimes);
        return listPrimes;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean isPrime(int value) {
        int i=2;
        if (value % i==0)
            return false;
        return true;
    }

}
