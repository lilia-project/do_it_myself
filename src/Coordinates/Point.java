package Coordinates;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void quarter(int x, int y) {

        if (x == 0 & y == 0) {
            System.out.println("the point is the origin");
        } else if ((x > 0) & (y > 0)) {
            System.out.println("the point is in the first quarter");
        } else if ((x < 0) & (y > 0)) {
            System.out.println("the point is in the second quarter");
        } else if ((x < 0) & (y < 0)) {
            System.out.println("the point is in the third quarter");
        } else if ((x > 0) & (y < 0)) {
            System.out.println("the point is in the fourth quarter");
        } else System.out.println("the point belongs to axis coordinates");

    }
}
