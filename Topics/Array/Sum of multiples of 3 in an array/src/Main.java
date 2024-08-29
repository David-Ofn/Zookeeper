import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner-Instanz erstellen, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);

        // Anzahl der Elemente vom Benutzer einlesen
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Array mit Benutzereingaben füllen
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Summe der durch 3 teilbaren Elemente berechnen
        int sum = 0;
        for (int value : array) {
            if (value % 3 == 0) {
                sum += value;
            }
        }

        // Ergebnis ausgeben
        System.out.println(sum);

        // Scanner schließen, um Ressourcen freizugeben
        scanner.close();
    }
}
