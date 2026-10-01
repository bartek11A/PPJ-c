import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Ask for hour
        System.out.print("Godzina: ");
        int hour = scanner.nextInt();

//        Ask for minute
        System.out.print("Minuta: ");
        int minute = scanner.nextInt();

//        Validate input
        if (hour <= 0 || hour >= 24 || minute < 0 || minute >= 60) {
            System.out.println("Invalid input!");
        }

//        Return message after checking the entered values
        if (hour == 12 ) {
            if (minute == 0) {
                System.out.println("Południe");
            } else if (minute > 0) {
                System.out.println("Godzina popołudniowa");
            }
        } else if (hour > 12) {
            System.out.println("Godzina popołudniowa");
        } else {
            System.out.println("Godzina przedpołudniowa");
        }

    }
}
