package BaseConverter;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("выберите число, соответствующее варианту конвертации");
            System.out.println();
            System.out.println("1 из шкалы Цельсия в шкалу Кельвина");
            System.out.println("2 из шкалы Цельсия в шкалу Фаренгейта");
            System.out.println("3 из шкалы Цельсия в шкалу Реомюра");
            System.out.println("4 из шкалы Цельсия в шкалу Ранкина");

            int option = scanner.nextInt();

            if (option != 1 & option != 2 & option != 3 & option != 4) {

                System.out.println("такой конвертер не предусмотрен");
                return;
            } else {
                System.out.println("введите значение температуры в градусах Цельсия");
            }
            double tempCelsius = scanner.nextDouble();
            Converter converter = new Converter();
            converter.tempConverter(option, tempCelsius);
        }
        while (true);
    }


}
