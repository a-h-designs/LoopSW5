import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to sum to: ");
        int userInput = reader.nextInt();
        int counter = 1;
        int sumTo = 0;

        while(counter <= userInput) {
            System.out.print(counter + " ");
            sumTo = sumTo + counter; // adding the number
            counter = counter + 1; // updating counter

        }
        System.out.println();
        System.out.println("The total number from 1 to " + userInput + " is " + sumTo);
    }
}