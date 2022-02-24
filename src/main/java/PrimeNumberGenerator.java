import java.util.List;
//given the interface
public interface PrimeNumberGenerator {
        List<Integer> generate(int startingValue, int endingValue);
        boolean isPrime(int value);
}
