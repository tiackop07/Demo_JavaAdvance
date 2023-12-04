import java.util.Scanner;

public class Greatest_Commont_Factor {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = sc.nextInt();
        System.out.println("Nhập số b");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Ko có số nào thoả mãn");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }

    }
}
