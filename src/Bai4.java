import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumber = 0;
        int inputNumber = 1;
        while (inputNumber != 0) {
            System.out.println("Nhập vào số nguyên bất kì : ");
            inputNumber = scanner.nextInt();
            totalNumber += inputNumber;
        }
        System.out.println("Tổng các số đã nhập là : "+totalNumber);

    }
}
