import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the text");
        String text = scanner.nextLine();

        String badWord = "бяка";

        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].equals(badWord)) {
                splitText[i] = "вырезано цензурой";

                for (String count : splitText) {
                    System.out.print(count + " ");
                }
            }
        }
    }
}
