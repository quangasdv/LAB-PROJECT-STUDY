package LABTUAN1;
import java.util.Scanner;
public class Bai06 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap canh thu nhat: ");
        double canhthu1;
        canhthu1 = nhapvao.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        double canhthu2;
        canhthu2 = nhapvao.nextDouble();

        System.out.print("Nhap canh thu ba: ");
        double canhthu3;
        canhthu3 = nhapvao.nextDouble();

        if ((canhthu1 + canhthu2 > canhthu3 && canhthu1 + canhthu3 > canhthu2 && canhthu2 + canhthu3 > canhthu1))
        {
            System.out.println("Ba canh tao thanh mot tam giac.");
        }
        else
        {
            System.out.println("Ba canh khong tao thanh mot tam giac.");
        }
   }
}
