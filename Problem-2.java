import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int count = 0;
        int num = 1;

        System.out.print("Output: ");
        while (count < a) {
            System.out.print(num);
            count++;
            num += 2;
            if (count < a) {
                System.out.print(", ");
            }
        }
    }
}
