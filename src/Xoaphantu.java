import java.util.Arrays;
import java.util.Scanner;
public class Xoaphantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2, 3, 4, 5, 6} ;
        System.out.println("nhap chi số của phần tử muốn xóa");
        int idx = sc.nextInt();
        if (idx < 0 || idx >= arr.length){
            System.out.println("khong the xoa");
        }
        int []arr1 = new int[arr.length -1];
        System.arraycopy(arr, 0, arr1, 0, idx);
        System.arraycopy(arr, idx +1, arr1, idx, arr.length - idx -1);
        System.out.println("mang sau khi xoa la : " +  Arrays.toString(arr1) );
    }
}
