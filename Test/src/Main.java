import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên dương");
        System.out.println("Nhập số muốn kiểm tra :");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println("Không phải số nguyên dương");
        } else {
            int i = 2;
            boolean check = true;
            while ( i < number){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number +" là số nguyên dương");
            }else {
                System.out.println(number + " không là số nguyên dương");
            }
        }
    }
}