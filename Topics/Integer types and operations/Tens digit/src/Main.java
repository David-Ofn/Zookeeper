import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N = scanner.nextInt();

        if (N < 0 || N > 1000000) {
            System.out.println("The number is out of the allowed range.");
            return;
        }

        // Find the tens digit
        int tensDigit = (N / 10) % 10;

        // Print the tens digit
        System.out.println( tensDigit);
    }
}