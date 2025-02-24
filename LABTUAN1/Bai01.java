package LABTUAN1;
import java.util.Scanner;
public class Bai01 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap ho ten sinh vien: ");
        String hoten;
        hoten = nhapvao.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String ngaysinh;
        ngaysinh = nhapvao.nextLine();

        System.out.print("Nhap ma so sinh vien: ");
        String mssv;
        mssv = nhapvao.nextLine();

        System.out.println ("\n");
        System.out.println ("Hien thi thong tin sinh vien");
        System.out.println ("Ho va ten: " + hoten);
        System.out.println ("Ngay sinh: " + ngaysinh);
        System.out.println ("MSSV: " + mssv);
        System.out.println ("\n");

    } 
}
