import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        System.out.println("Display Times Table. What number would you like? Enter a number :");
        int userNumber = reader.nextInt();
        for (int i = 1; i < 13; i++)
            System.out.println(userNumber + " x " + i + " = " + i * userNumber);
    }
}