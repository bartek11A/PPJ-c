import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Ask for user input and store it inside variables
        System.out.print("Side 1: ");
        int a = scanner.nextInt();
        System.out.print("Side 2: ");
        int b = scanner.nextInt();
        System.out.print("Height: ");
        int h = scanner.nextInt();

//        Validate inputs
        if (a <= 0 || b <= 0 || h <= 0) {
            System.out.println("Invalid input!");
        }

//        Calculate volume
        int volume = (a * b) * h;
        System.out.println("Volume = " + volume);


    }
}
