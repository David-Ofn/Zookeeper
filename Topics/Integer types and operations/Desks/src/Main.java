import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int groupOne = scanner.nextInt();
        int groupTwo = scanner.nextInt();
        int groupThree = scanner.nextInt();

        int studentsOne = groupOne / 2 + groupOne % 2;
        int studentsTwo = groupTwo / 2 + groupTwo % 2;
        int studentsThree = groupThree / 2 + groupThree % 2;

        int sum = studentsOne + studentsTwo + studentsThree;
        System.out.println(sum);
    }
}