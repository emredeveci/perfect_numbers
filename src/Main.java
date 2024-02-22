import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations
        int number, total = 0, divisor = 1;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        //calculation to find a perfect number
        while (divisor < number) {
            if (number % divisor == 0) {
                total += divisor;
            }
            divisor++;
        }

        System.out.print((total == number)? number + " is a perfect number." : number + " is not a perfect number." );
    }
}