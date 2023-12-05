import java.util.Scanner;

public class Homework2 {


//    public static void main(String[] arg){
//        int [][] matrix = {
//                {4,5,9},
//                {4,5,9},
//                {7,9,9}
//        };
//
//
//
////        Viết một chương trình java để tìm giá trị lớn nhất
////        trong một ma trận và in ra tất cả các chỉ số của ô có giá trị đó. Sử dụng hàm để thực hiện nhiệm vụ này.
//        int[] maxPosition = findMaxMatrix(matrix);
//
//        if (maxPosition != null) {
//            System.out.println("Số lớn nhất trong ma trận là: " + matrix[maxPosition[0]][maxPosition[1]]);
//            System.out.println("Số lớn nhất nằm trong mảng có vị trí: " );
//            for (int i = 0; i < maxPosition.length; i++) {
//                System.out.println("[" + maxPosition[i] + "]");
//            }
//
//        } else {
//            System.out.println("Không tìm thấy số lớn nhất trong ma trận.");
//        }
//
////        int findMatrix = findMaxMatrix(matrix);
////        System.out.println("Số lớn nhất trong ma trận là: " + findMatrix + " Thuộc mảng: " );
//    }
//    public static int[] findMaxMatrix (int [][] matrix){
//        int max = matrix[0][0];
//        int [] maxPosition = {0, 0};
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++){
//                if (matrix[i][j] > max){
//                    max = matrix[i][j];
//                    maxPosition[0] = i;
//                    maxPosition[1] = j;
//                }
//            }
//        } return maxPosition;
//    }

    //    Kiểm Tra Ma Trận Đối Xứng
//    Viết một chương trình java để kiểm tra xem một ma trận có phải là ma trận đối xứng hay không.
//    Sử dụng hàm để kiểm tra.
//    public static void main(String[] args) {
//        // Ma trận mẫu 3x3 (ma trận đối xứng)
//        int[][] symmetricMatrix = {
//                {1, 2, 3},
//                {2, 4, 5},
//                {3, 5, 6}
//        };
//
//        // Kiểm tra xem ma trận có đối xứng hay không
//        boolean isSymmetric = isMatrixSymmetric(symmetricMatrix);
//
//        if (isSymmetric) {
//            System.out.println("Ma trận là ma trận đối xứng.");
//        } else {
//            System.out.println("Ma trận không phải là ma trận đối xứng.");
//        }
//    }
//
//    public static boolean isMatrixSymmetric(int[][] matrix) {
//        int rows = matrix.length;
//        int columns = matrix[0].length;
//
//        // Kiểm tra nếu ma trận không vuông thì không phải là ma trận đối xứng
//        if (rows != columns) {
//            return false;
//        }
//
//        // Duyệt qua từng phần tử của ma trận để so sánh với ma trận chuyển vị
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < i; j++) {
//                if (matrix[i][j] != matrix[j][i]) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }


//    Số Fibonacci Trong Mảng
//    Viết một chương trình java để tạo một mảng số nguyên chứa n số Fibonacci đầu tiên
//    (n là một số nguyên được người dùng nhập vào). In ra mảng này.

    public static int sumFibonacy (int n) {
        System.out.println("Nhập số phần tử của mảng Fibo ");
        Scanner inputN = new Scanner(System.in);

        int n = inputN.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inputN.nextInt();
        }
        inputN.close();
    }
}

