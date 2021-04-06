import java.util.Scanner;
public class TimgiatritrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap ten can tim kiem: ");
        String Name = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(Name)){
                System.out.println("vi tri sv " + Name + " trong danh sach la " +  (i+1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("khong tim thay " + Name + " trong danh sach");
        }
    }
}
