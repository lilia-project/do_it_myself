import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String division = "/";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operator");
        String z = scanner.nextLine();

        System.out.println("Enter operand 1");
        double x = scanner.nextDouble();

        System.out.println("Enter operand 2");
        double y = scanner.nextDouble();

        if (z.equals(plus)) {
            System.out.println(x + "+" + y + "=" + (x + y));
        } else if (z.equals(minus)) {
            System.out.println(x + "-" + y + "=" + (x - y));
        } else if (z.equals(multiply)) {
            System.out.println(x + "*" + y + "=" + (x * y));
        } else if (z.equals(division)) {
            if (y == 0) {
                System.out.println("division is impossible");
            } else
                System.out.println(x + "/" + y + "=" + (x / y));
        } else System.out.println("this operator not found");

    }
}

