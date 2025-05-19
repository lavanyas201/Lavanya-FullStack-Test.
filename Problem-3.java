import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int count = 0;
        int num = 1;

        System.out.print("Output: ");
        while (count < a) {
            if ((2 * count + 1) <= (2 * ((a - 1) / 2) + 1)) {
                System.out.print(num);
                num += 2;
                count++;
                if ((2 * count - 1) <= (2 * ((a - 1) / 2) + 1) && count < a) {
                    System.out.print(", ");
                }
            } else {
                break;
            }
        }
    }
}
