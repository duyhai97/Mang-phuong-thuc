import java.util.Scanner;
import java.util.Arrays;
public class Gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner(System.in);
        int size;
//        do {
//            System.out.print("nhap so luong:");
//            size = sc.nextInt();
//            if (size > 10)
//                System.out.println("khong vuot qua 20");
//        } while (size > 10);

        array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("nhap phan tu " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang 1 la: \n" + Arrays.toString(array1));

        array2 = new int[6];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("nhap phan tu " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang 2 la: \n" + Arrays.toString(array2));

        int array3[] = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[array3.length-array2.length + i] = array2[i];
        }
        System.out.println("Mang sau khi gop \n" + Arrays.toString(array3));
    }
}
