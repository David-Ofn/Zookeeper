import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double miles = scanner.nextDouble();
        double hours = scanner.nextDouble();

        System.out.println(miles/hours);
    }
}