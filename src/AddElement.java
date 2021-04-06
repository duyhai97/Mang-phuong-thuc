import java.util.Scanner;
import java.util.Arrays;
public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(arr));
        System.out.print("nhap chi so can chen vao: ");
        int id = sc.nextInt();
        System.out.print("nhap gia tri can chen vao: ");
        int el = sc.nextInt();
        if (id < 0 || id > arr.length) {
            System.out.println("khong the them vao mang");
        }
        int a[] = addElement(arr, id, el);
        System.out.println(Arrays.toString(a));

    }
    public static int[] addElement(int arr[], int id, int el){
        int[] arr1 = new int[arr.length +1];
        for (int i = 0; i <arr.length; i++) {
            arr1[i] = arr[i];
            arr1[id] = el;
        }
        for (int i = id +1; i < arr1.length ; i++) {
            arr1[i] = arr[i-1];
        }

            return arr1;

    }
}
