import java.util.Scanner;

public class ReplacementTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the text");
        String text = scanner.nextLine();

        text = text.replaceAll("бяка", "вырезано цензурой");
        System.out.println(text);

    }
}


