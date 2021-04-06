import java.util.Scanner;
public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 5, 6, 8, 4, 7, 9, 6};
        System.out.println("so nho nhat la: " + CheckMin(array));
    }
    public static int CheckMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min< arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
