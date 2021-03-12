package Coordinates;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x");
        int x = scanner.nextInt();

        System.out.println("enter y");
        int y = scanner.nextInt();

        Point point = new Point(x, y);
        point.quarter(x, y);

    }
}
