import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int sumNumber = 0;

        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            for (int i = 1; i <= n; i++) {
                sumNumber += i;
            }
        }
        System.out.println("\n");
        System.out.printf("Tổng các số từ 1 đến %d là : ",n);
        System.out.println(sumNumber);
    }
}
