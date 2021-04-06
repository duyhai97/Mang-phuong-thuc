import java.util.Scanner;
import java.util.Arrays;
public class DemSVthido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ;
        int SV;
        do{
            System.out.println("tong so sv la: ");
             SV = sc.nextInt();
            if (SV>30){
                System.out.println("khong vuot qua 30");
            }
        } while (SV > 30);
        arr = new int[SV];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap diem cua SV " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("diem cua sv" + i + " la: " + arr[i] + ", ");
            if (arr[i]>=5 && arr[i]<=10){
               dem++;
            }
        }
        System.out.println("Co " + dem + " SV thi do");
    }
}
