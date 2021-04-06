import java.util.Scanner;
public class Totalcot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luachon = -1;
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
        while (luachon != 0) {
            System.out.println("Menu");
            System.out.println("1. tong cot 1");
            System.out.println("2. tong cot 2");
            System.out.println("3. tong cot 3");
            System.out.println("0. Exit");
            System.out.println("nhap lua chon: ");
            int luachon1 = sc.nextInt();

            int total = 0;
            switch (luachon1) {
                case 1:
                    System.out.println("tinh tong cot dau tien");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            total += array[i][0];
                        }
                    }
                    System.out.println("tong laf: " + total);
                    break;

                case 2:
                    System.out.println("tinh tong cot thu 2");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            total += array[i][1];
                        }
                    }
                    System.out.println("tong la: " + total);
                    break;

                case 3:
                    System.out.println("tinh tong cot thu 3");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            total += array[i][2];
                        }
                    }
                    System.out.println("tong la: " + total);
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }

//    public static int total(int arr[][]){
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][0];
//           }
//        }
//        return sum;
//    }
}
