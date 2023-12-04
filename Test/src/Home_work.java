import javax.naming.PartialResultException;
import javax.swing.*;
import java.util.Scanner;

public class Home_work {

//    public static void main (String[] arg){
//        int [] check={1,2,3,4,5,6,7,8};
//        reverse(check);
//    }
    public static void findMax(int[] arr){
        int maxArr = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        System.out.println("lagest number in arrray is: " + maxArr);
    }

    public static boolean cotanghaykhong(int[] arr){
        for(int i=0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
        }


    public static void reverse(int[] arr){
        int f = 0;
        int l = arr.length - 1;
        while ( f < l){
            int temp = arr[l];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }

    public static void main(String[] arg){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số n:");
        int s = inputNumber.nextInt();
        int tong = 0;
        for (int i = 0; i < s; i++){
            tong += i;
        }
        System.out.println("Tổng từ 1 tới " + s + " là " + tong);
    }

    public static boolean isPRIME(int element){
        if(element < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(element) ; i++){
            if(element % i == 0) return false;
        }
        return true;
    }

    public static void PRIMEn(int n){
        for(int i = 0; i < n;i++){
            if(isPRIME(i)) System.out.println(i);
        }
    }
}
