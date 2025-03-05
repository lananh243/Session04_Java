import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp số nguyên dương bất kì : ");
        int n = scanner.nextInt();

        boolean found = false;
        if (n > 0) {
            System.out.println("Các số hoàn hảo nhỏ hơn hoặc bằng " + n + " là: ");
            for (int i = 1; i <= n; i++) {
                int total = 0;
                for (int j = 1; j <= i/2; j++) {
                    if (i % j == 0) {
                        total += j ;
                    }
                }
                if (total == i) {
                    System.out.printf("%d \t",i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
            }
        } else {
            System.out.println("Số nhập vào ko hợp lệ");
        }
    }
}
