import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a value for foot: ");

        double foot = input.nextDouble();

        double meter = foot * 0.305;

        System.out.println(foot + " feet is " + meter);
    }
}
