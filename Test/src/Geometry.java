import java.util.Scanner;

public class Geometry {
    public static void main(String[] arg){
        int choice = - 1;

        System.out.println("Menu");
        System.out.println("1. Vẽ hình Tam giác");
        System.out.println("2. Vẽ hình Vuông");
        System.out.println("3. Vẽ hình Chữ Nhật");
        System.out.println("0. Out");
        System.out.println("Lựa Chọn:");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Vẽ hình Tam giác");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Vẽ hình Vuông");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 3:
                System.out.println("Vẽ hình Chữ Nhật");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Ko có sự lựa chọn nào.");
        }
    }
}
