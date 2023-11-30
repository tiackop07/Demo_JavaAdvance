import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        int monney = 1;
        double loan_rate = 1.0;
        int month = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn vay");
        monney = scanner.nextInt();
        System.out.println("Nhập thời gian vay");
        month = scanner.nextInt();
        System.out.println("Nhập phần trăm lãi vay");
        loan_rate = scanner.nextDouble();
        double total = 0;
        for ( int i = 0; i < month; i++){
            total += monney * (loan_rate/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi là : " + total);
    }
}
