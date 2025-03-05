import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương bất kì : ");
        int n = scanner.nextInt();
        int temp, num, rem, count = 0;

        if (n > 0) {
            System.out.println("Các số Armstrong nhỏ hơn hoặc bằng " + n + " là: ");
            for (int i = 1; i <= n; i++) {
                temp = i;
                num = 0;
                while (temp != 0) {
                    rem = temp % 10;
                    num += rem*rem*rem;
                    temp /= 10;
                }
                if (i == num) {
                    System.out.printf("%d \t",i);
                    count++;
                }
                if (count == 0) {
                    System.out.println("Không có số Armstrong nào.");
                }
            }
        }else {
            System.out.println("Số nhập vào không hợp lệ");
        }
    }
}
