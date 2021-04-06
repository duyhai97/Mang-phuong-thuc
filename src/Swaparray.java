import java.util.Scanner;

public class Swaparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("nhap phan tu " + (j + 1) + ": ");
            array[j] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ", ");
        }

//        for (int i = 0; i < array.length; i++) {
//            int a = array[i];
//            array[i] = array[size-1-i];
//            array[size-1-i] = a;
//        }
        for (int i = 0; i < array.length/2; i++) {
           int a = array[i];
           array[i] = array[size - 1-i];
           array[size - 1-i] = a;
        }
        System.out.println("mang moi se la");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }
}
