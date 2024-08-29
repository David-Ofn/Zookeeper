import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here

        int rest = input % 2;
        System.out.println(rest);
        // The second operation goes here
        int letzteZahl = rest * 3;

        System.out.println(letzteZahl);
        scanner.close();
    }
}