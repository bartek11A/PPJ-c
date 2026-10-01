import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podstawa: ");
        int a = scanner.nextInt();
        System.out.print("Wysokość: ");
        int h = scanner.nextInt();

        int p = (a * h) / 2;
        System.out.println("Pole: " + p);

    }
}
