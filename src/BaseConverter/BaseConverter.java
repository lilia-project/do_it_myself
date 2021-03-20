package BaseConverter;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            methodConvert();
            int option = scanner.nextInt();

            if (invalidSelection(option)) return;

            double tempCelsius = scanner.nextDouble();
            Converter converter = new Converter();
            converter.tempConvert(option, tempCelsius);
        }
        while (true);
    }

    private static boolean invalidSelection(int option) {
        if (option != 1 & option != 2 & option != 3 & option != 4) {

            System.out.println("this number does not belong to the list ");
            return true;
        } else {
            System.out.println("enter the temperature in degrees Celsius");
        }
        return false;
    }

    private static void methodConvert() {
        System.out.println();
        System.out.println("select option");
        System.out.println();
        System.out.println("1 from Celsius to Kelvin");
        System.out.println("2 from Celsius to Fahrenheit");
        System.out.println("3 from Celsius to Reaumur");
        System.out.println("4 from Celsius to Rankine");
    }


}
