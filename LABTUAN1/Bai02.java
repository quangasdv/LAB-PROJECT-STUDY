package LABTUAN1;
import java.util.Scanner;
public class Bai02 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap chieu dai HCN: ");
        double chieudai;
        chieudai = nhapvao.nextDouble();

        System.out.print("Nhap chieu rong HCN: ");
        double chieurong;
        chieurong = nhapvao.nextDouble();

        double dientich = (chieudai + chieurong) * 2;

        System.out.println ("=>> Dien tich hinh chu nhat la: " + dientich);

    } 
}
