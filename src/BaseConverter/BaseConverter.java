package BaseConverter;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            methodConvert();
            int option = scanner.nextInt();

            if (inputValidation(option)) return;

            double tempCelsius = scanner.nextDouble();
            Converter converter = new Converter();
            converter.tempConverter(option, tempCelsius);
        }
        while (true);
    }

    private static boolean inputValidation(int option) {
        if (option != 1 & option != 2 & option != 3 & option != 4) {

            System.out.println("конвертер c таким номером не предусмотрен");
            return true;
        } else {
            System.out.println("введите значение температуры в градусах Цельсия");
        }
        return false;
    }

    private static void methodConvert() {
        System.out.println();
        System.out.println("выберите номер варианта конвертации");
        System.out.println();
        System.out.println("1 из шкалы Цельсия в шкалу Кельвина");
        System.out.println("2 из шкалы Цельсия в шкалу Фаренгейта");
        System.out.println("3 из шкалы Цельсия в шкалу Реомюра");
        System.out.println("4 из шкалы Цельсия в шкалу Ранкина");
    }


}
