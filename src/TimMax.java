import java.util.Scanner;
public class TimMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("so luong ko qua 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu " + (i+1) + ": "  );
            array[i] = sc.nextInt();
        }
        System.out.print("Mang moi nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
        System.out.println("Max la: " + check(array) );
    }
    public static int check(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
