import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Ask until user enters a valid value
        int n = 0;
        while (n <= 0) {
            System.out.print("Górna granica: ");
            n = scanner.nextInt();
        }


//        Loop to print numbers divisible by 2
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
