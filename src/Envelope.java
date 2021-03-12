import java.util.Scanner;

public class Envelope {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter length envelope 1");
        double a=scanner.nextDouble();

        System.out.println("enter width envelope 1");
        double b=scanner.nextDouble();

        System.out.println("enter length envelope 2");
        double c=scanner.nextDouble();

        System.out.println("enter width envelope 2");
        double d= scanner.nextDouble();

        if ((a>c&b>d)|(a<c&b<d)){
            System.out.println("один из конвертов можно положить в другой");
        } else System.out.println("невозможно вложить один конверт в другой");

    }
}
