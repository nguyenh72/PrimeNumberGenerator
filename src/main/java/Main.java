public class Main
{
    public static void main(String[] args) {

        FindPrimes findPrimes = new FindPrimes();

        System.out.println("Here is the list of Primes [1-10]:" + findPrimes.generate(1,10));
        System.out.println("Here is the list of Primes [10-1]:" + findPrimes.generate(10,1));
        System.out.println("Here is the list of Primes [1-1000]:" + findPrimes.generate(1,100));
        System.out.println("testing with new list"+ findPrimes.generate(7200,7899));
    }
}
