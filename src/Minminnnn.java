import java.util.Scanner;
public class Minminnnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("nhap chieu dai mang:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("khong vuot qua 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu " + (i +1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = checkMin(array);
        System.out.print("so nho nhat la: " + min);
    }

    public static int checkMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min){
                min = arr[i];
            }
        }
        return min;
    }
}

