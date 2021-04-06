import java.util.Scanner;
public class TotalDgcheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[][] array;
        do {
            System.out.print("nhap kich thuoc:");
            size = sc.nextInt();
            if (size > 5)
                System.out.println("khong vuot qua 20");
        } while (size > 20);

        array = new int[size][];
        for (int i = 0; i < array.length; i++) {
            System.out.print("mang nho " + (i + 1) + ": ");
            array[i] = new int[3];
            for (int j = 0; j < array.length; j++) {
                System.out.print((j + 1) + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        int tong = total(array);
        System.out.println("tong la: " + tong);
    }
public static int total(int arr[][]){
        int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i==j){
                sum = sum + arr[i][j];
            }
        }
    }
    return sum;
}

}
