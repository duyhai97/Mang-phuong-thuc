import java.util.Arrays;
import java.util.Scanner;
public class TimMaxArrhaichieu {
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
            System.out.print("mang nho " + (i + 1) + ":");
            array[i] = new int[3];
            for (int j = 0; j < array.length; j++) {
                System.out.print((j + 1) + ":");
                array[i][j] = sc.nextInt();
            }
        }
        int max = checkMAx(array);
        System.out.print("So lon nhat la: " + max);
    }



    public static int checkMAx(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}