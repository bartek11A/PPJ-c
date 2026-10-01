import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Create a new scanner object
        Scanner scanner = new Scanner(System.in);

//        Get input
        System.out.print("Wprowadź a: ");
        int a = scanner.nextInt();
        System.out.print("Wprowadź b: ");
        int b = scanner.nextInt();

//        Check if both are equal
        if (a == b) {
            System.out.println("Obie liczby są równe");
//            Check if a is greater than b
        } else if (a > b) {
            System.out.println(a);
            System.out.println(b);
//            Else so b is greater than a
        } else {
            System.out.println(b);
            System.out.println(a);
        }
    }
}
