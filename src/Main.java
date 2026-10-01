import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Get how many times user wants to print smth
        System.out.println("Ile razy chcesz wydrukować wiadomość?");

//        Ask until user enters a valid value
        int n = 0;
        while (n <= 0) {
            System.out.print("Ilość razy: ");
            n = scanner.nextInt();
        }

//        Message
        String message = "Dzień dobry";

//        Loop with the user input as a limit
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }

    }
}
