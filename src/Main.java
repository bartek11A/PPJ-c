import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Get input until valid
        int a = 0;
        while (a <= 0) {
            System.out.print("Podaj bok 1: ");
            a = scanner.nextInt();
        }

        int b = 0;
        while (b <= 0) {
            System.out.print("Podaj bok 2: ");
            b = scanner.nextInt();
        }
//        Calculate area
        int area = a * b;

//        Check if square, else rectangle
        if (a == b) {
            System.out.println("Pole kwadratu wynosi: " + area);
        } else {
            System.out.println("Pole prostokąta wynosi: " + area);
        }
    }
}
