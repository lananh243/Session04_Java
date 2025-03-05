import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên bất kì : ");
        int number = scanner.nextInt();
        if (number < 0) {
            number = (-number);
        }

        int totalNumber = 0;

        while (number != 0) {
            totalNumber += number % 10;
            number /= 10;
        }

        System.out.println("Tổng tất cả các số là : "+totalNumber);
    }
}
