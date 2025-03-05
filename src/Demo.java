public class Demo {
    public static void main(String[] args) {
//        In ra các số chẵn từ 1 - 100 và tính tổng các số chẵn đó

//        B1 : Khỏi tạo biến tổng có giá trị = 0
        int totalNumber = 0;
//        B2 : IN ra các số chẵn và cộng dồn vào tổng
        System.out.println("Các số chẵn từ 1 - 100 là : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t",i);
                totalNumber += i;
            }
        }
        System.out.println("\n");
        System.out.println("Tổng các số chẵn là : "+totalNumber);
    }
}
