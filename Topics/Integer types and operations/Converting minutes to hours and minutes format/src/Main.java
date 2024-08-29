import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!

        int hours = minutes / 60;
        int finalMinutes = minutes % 60;

        System.out.print(hours  + " hours and " + finalMinutes + " minutes" );

        scanner.close();
    }
}