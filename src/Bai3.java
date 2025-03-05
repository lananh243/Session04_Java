import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương : ");
        int n = scanner.nextInt();
        System.out.printf("Bảng cửu chương của %d \n",n);
        if (n > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = ", n, i);
                System.out.println(+(n*i));
            }
        }else {
            System.out.println("Số nhập vào ko hợp lệ");
        }
    }
}
