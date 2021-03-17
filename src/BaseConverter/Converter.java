package BaseConverter;

public class Converter {
    void tempConverter(int option, double tempCelsius) {
        switch (option) {
            case 1:
                double tempKelvin = tempCelsius + 273.15;
                System.out.println(tempCelsius + " градусов по Цельсию соответствует " + tempKelvin + " градусам по Кельвину");
                return;
            case 2:
                double tempFahrenheit = tempCelsius * 1.8 + 32;
                System.out.println(tempCelsius + " градусов по Цельсию соответствует " + tempFahrenheit + " градусам по Фаренгейту");
                return;
            case 3:
                double tempReaumur = tempCelsius * 4 / 5;
                System.out.println(tempCelsius + " градусов по Цельсию соответствует " + tempReaumur + " градусам пр Реомюру");
                return;
            default:
                double tempRankin = (tempCelsius + 273.15) * 9 / 5;
                System.out.println(tempCelsius + " градусов по Цельсию соответствует  " + tempRankin + " градусам по Ранкину");
        }
    }
}
