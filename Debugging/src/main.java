import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int v = input.nextInt();
        System.out.println("You entered " + v);

        System.out.print("Enter a double: ");
        double v2 = input.nextDouble();
        System.out.println("You entered " + v2);
    }

}
