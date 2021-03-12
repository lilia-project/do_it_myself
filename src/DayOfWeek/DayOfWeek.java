package DayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("input number day of week");
            int counter = scanner.nextInt();

            if (counter < 1 | counter > 7) {
                System.out.println("such day of week does not exist");
            } else {
                String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
                };
                System.out.println(dayOfWeek[counter - 1]);
            }
        } while (true);
    }
}

