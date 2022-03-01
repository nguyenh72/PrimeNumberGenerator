import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        FindPrimes findPrimes = new FindPrimes();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter your first number: ");
            while (!scan.hasNextInt()) {
                String input = scan.next();
                System.out.printf("\"%s\" is not a valid starting value. Please re-enter number[e.g: 1]:> ", input);
            }
            int startingValue = scan.nextInt();
            System.out.println("The number entered starting value: "+startingValue);
            System.out.print("Enter your second number: ");
            while (!scan.hasNextInt()) {
                String input = scan.next();
                System.out.printf("\"%s\" is not an ending value. Please re-enter number[e.g: 10]:>", input);
            }
            int endingValue = scan.nextInt();
            System.out.println("The number entered ending value: "+endingValue);

            System.out.println("Here is the list of primes of range: " + startingValue + " - " + endingValue + " : " + findPrimes.generate(startingValue,endingValue));
        } catch(Exception ex){
            System.out.println(">>> Invalid Input, Exception Error Message:" + ex.getMessage());
        }
    }
}
