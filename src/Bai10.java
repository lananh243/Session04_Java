import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------MENU-------------------");
            System.out.println("1. Kiểm tra một số có phải là số nguyên tố không");
            System.out.println("2. Kiểm tra một số có phải là số hoàn hảo không");
            System.out.println("3. Tìm và tính tổng tất cả các ước của một số");
            System.out.println("4. Thoát chương trình");
            System.out.println("Lựa chọn của bạn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
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
                            System.out.printf("%d là số nguyên tố \n",n);
                        } else {
                            System.out.printf("%d không phải là số nguyên tố \n",n);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhâp số nguyên dương bất kì : ");
                    int num = scanner.nextInt();
                    boolean found = false;
                    for (int i = 1; i <= num; i++) {
                        int total = 0;
                        for (int j = 1; j <= i/2; j++) {
                            if (i % j == 0) {
                                total += j ;
                            }
                        }
                        if (total == i) {
                            found = true;
                        }
                    }
                    if (found) {
                        System.out.printf("%d là số hoàn hảo \n",num);
                    } else {
                        System.out.printf("%d không phải là số hoàn hảo \n",num);
                    }
                    break;
                case 3:
                    System.out.println("Nhập số nguyên dương bất kì : ");
                    int number =  scanner.nextInt();

                    int sumNumber = 0;
                    System.out.println("Các ước của số nguyên là : ");
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            sumNumber += i;
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng tất cả các ước của "+number+" là : "+sumNumber);

                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 4");
            }
        }while (true);
    }
}
