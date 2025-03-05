import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        Viết chương trình thực hiện nhập các số nguyên, kết thúc nhập khi nhập = 0
//        Tính tổng các số vừa nhập
//        b1 : Khởi tạo biến tồng và biến lưu trữ giá trị nhập
//        b2 : sử dụng while nhập dữ liệu và cộng dồn số nhập vào biến tổng
        Scanner scanner = new Scanner(System.in);
        int sumNumber = 0;
        int inputValue = 1;
        while (inputValue != 0) {
            System.out.println("Nhập vào 1 số nguyên : ");
            inputValue = Integer.parseInt(scanner.nextLine());
            sumNumber += inputValue;
        }
        System.out.println("Tổng các số vừa nhập : "+sumNumber);
    }
}
