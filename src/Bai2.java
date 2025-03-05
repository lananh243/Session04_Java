import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên bất kì : ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.printf("%d không phải số nguyên tố", n);
        } else {
            boolean isFlag = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n  % i == 0) {
                    isFlag = false;
                    break;
                }
            }

            if (isFlag) {
                System.out.printf("%d là số nguyên tố",n);
            } else {
                System.out.printf("%d không phải là số nguyên tố",n);
            }
        }


    }
}
