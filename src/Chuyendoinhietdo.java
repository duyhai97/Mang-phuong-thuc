import java.util.Scanner;
public class Chuyendoinhietdo {
    public static double CtoF(double C){
        double F = 1.8*C + 32;
        return F;
    }
    public static double FtoC(double F){
        double C = (5.0 / 9 )*(F - 32);
        return C;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon;
        do {
            System.out.println("Menu.");
            System.out.println("1.Doi F sang C");
            System.out.println("2. Doi C sang F");
            System.out.println("0. Kết thúc");
            System.out.println("nhap lua chon: ");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    System.out.println("Nhập độ F");
                    double F = sc.nextDouble();
                    System.out.println("Độ C là: " + FtoC(F));
                    break;
                case 2:
                    System.out.println("Nhập độ C");
                    double C = sc.nextDouble();
                    System.out.println("Độ F là: " + CtoF(C));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (luachon != 0);
    }
//    public static double CtoF(double C){
//        double F = 1.8*C + 32;
//        return F;
//    }
//    public static double FtoC(double F){
//        double C = (5/9)*(F - 32);
//        return C;
//
//    }
}
