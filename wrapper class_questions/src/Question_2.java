import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1 to 255): ");
        int num = sc.nextInt();

        if (num < 1 || num > 255) {
            System.out.println("Number out of range!");
        } else {
            String binary = Integer.toBinaryString(num);
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }

        sc.close();
    }
}
