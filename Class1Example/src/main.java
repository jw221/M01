import java.math.RoundingMode;
import java.util.Scanner;
import static sun.misc.Version.print;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");

        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        double sum = number1 + number2 + number3;

        double average = sum/3;

        System.out.println("The average of number " + number1 + ", " + number2 + ", and " + number3 + " is " +
               average);
    }

}
