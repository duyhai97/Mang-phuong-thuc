import java.util.Arrays;
import java.util.Scanner;

public class Demchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcabcefefef";
        int dem = 0;
        System.out.println("nhap ki tu muon tim: ");
        String kytu = sc.nextLine();
        for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i) = kytu){
                    dem++;
                }
        }
        System.out.println("so lan xuat hien cua " + kytu + " la " + dem);
    }
}
