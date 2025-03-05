import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        System.out.println("Các số Happy nhỏ hơn " + n + " là:");
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                int num = i;
                int sum = num;
                boolean isHappy = false;

                while (sum != 4 && sum != 1) {
                    int temp = sum;
                    sum = 0;

                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += digit * digit;
                        temp /= 10;
                    }

                    if (sum == 1) {
                        isHappy = true;
                        break;
                    }
                }

                if (isHappy) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Số nhập vào không hợp lệ");
        }

    }
}
