import java.util.Scanner;

public class PT_bậc2 {
    public static void main(String[] arg){
        System.out.println("giải Pt ax+b=c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double x = (c - b) / a;
            System.out.println(" nghiệm là : "+x);
        }else if (b == c){
            System.out.println(" vô số nghiệm");
        }else {
            System.out.println("PT vô nghiệm");
        }
    }
}
