public class Home_work {

//    public static void main (String[] arg){
//        int check = 12121212;
//        System.out.println(" Tổng là: " + sumOfNumber(check));
//    }
//    public static void findMax(int[] arr){
//        int maxArr = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] > maxArr){
//                maxArr = arr[i];
//            }
//        }
//        System.out.println("lagest number in arrray is: " + maxArr);
//    }
//
//    public static void cotanghaykhong(int[] arr){
//        boolean check = true;
//        for(int i=0; i < arr.length - 1; i++){
//            if(arr[i] > arr[i+1]){
//                check = false;
//                break;
//            }
//        }
//         if(check){
//             System.out.println("mảng có tăng");
//         }else{
//             System.out.println("Mảng ko tăng");
//         }
//    }
//
//    public static void reverse(int[] arr){
//        int f = 0;
//        int l = arr.length - 1;
//        while ( f < l){
//            int temp = arr[l];
//            arr[f] = arr[l];
//            arr[l] = temp;
//            f++;
//            l--;
//        }
//        System.out.println("Mảng sau khi đảo ngược là: ");
//        for(int i: arr){
//            System.out.println(i);
//        }
//    }
//
//    public static void main(int[] arr){
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số n:");
//        int s = inputNumber.nextInt();
//        int tong = 0;
//        for (int i = 0; i <= s; i++){
//            tong += i;
//        }
//        System.out.println("Tổng từ 1 tới " + s + " là " + tong);
//    }

//    public static boolean isPRIME(int element){
//        if(element < 2) return false;
//        for(int i = 2 ; i <= Math.sqrt(element) ; i++){
//            if(element % i == 0) return false;
//        }
//        return true;
//    }

//    public static void PRIMEn(int n){
//        for(int i = 0; i < n;i++){
//            if(isPRIME(i)) System.out.println(i);
//        }
//    }

//    public static int sumOfNumber(int  number){
//        int sum = 0;
//        while (number != 0){
//            sum += number%10;
//            number /= 10;
//        }
//        return sum;
//    }

    public static void sort (int [] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int findK (int [] arr , int k){
        int count = 1;
        sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if(arr[i] != arr[i-1]){
                count++;
            }
            if(count == k){
                return arr[i];
            }
        }
        return count;
    }


}
