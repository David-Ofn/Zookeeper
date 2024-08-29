import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double input = scanner.nextDouble();
        double ergebnis = (input*input*input)+(input*input)+input+1;
        System.out.println(ergebnis);
        scanner.close();
    }
}