import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương bất kỳ: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Các số Palindrome nhỏ hơn hoặc bằng " + n + " là: ");
            for (int i = 1; i <= n; i++) {
                int temp = i;
                int reversed = 0;
                int original = i;

                while (temp > 0) {
                    int lastDigit = temp % 10;
                    reversed = reversed * 10 + lastDigit;
                    temp /= 10;
                }

                if (original == reversed) {
                    System.out.printf("%d \t",original);
                }
            }
        } else {
            System.out.println("Số nhập vào không hợp lệ");
        }

    }
}
