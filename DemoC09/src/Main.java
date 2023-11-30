import sun.awt.geom.AreaOp;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn 1 trong 2 để đổi tiền");
        System.out.println("1.Đổi tiền USD sang VND");
        System.out.println("2.Đổi tiền VND sang USD");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Mời nhập số tiền VND là : ");
            int vnd = scanner.nextInt();
            System.out.println("Số tiền $ nhận được là : " + vnd/24240 + " $");
        } else if (choice == 2) {
            System.out.println("Mời nhập số tiền USD là : ");
            int usd = scanner.nextInt();
            System.out.println("Số tiền $ nhận được là : " + usd * 24240 + " VNĐ");
        }
    }
}