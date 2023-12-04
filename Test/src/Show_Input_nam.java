import java.sql.SQLOutput;
import java.util.Scanner;

public class Show_Input_nam {
    public static void main(String[] arg){
        System.out.println("Nhập tên của bạn: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello "+ name);
    }
}
