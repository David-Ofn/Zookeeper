
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lese eine Fließkommazahl ein und teile sie durch 2
		float inputNumber = scanner.nextFloat();
		float halfOfInput = inputNumber / 2;

		// Wandle das Ergebnis in einen ganzzahligen Wert um
		int roundedResult = (int) halfOfInput;

		// Gebe das Ergebnis aus
		System.out.println(roundedResult);

		// Schließe den Scanner
		scanner.close();
	}
}
