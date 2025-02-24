package LABTUAN1;
import java.util.Scanner;
public class Bai05 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double sothu1;
        sothu1 = nhapvao.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double sothu2;
        sothu2 = nhapvao.nextDouble();

        System.out.print("Nhap so thu ba: ");
        double sothu3;
        sothu3 = nhapvao.nextDouble();

        double sonhonhat = Math.min(sothu1, Math.min(sothu2, sothu3));

        System.out.println ("=>> Gia tri nho nhat la: " + sonhonhat);

        if ((sothu1 == sothu2 && sothu1 == sothu3 && sothu2 == sothu3)) 
        {
            System.out.println ("Khong co gia tri nao nho nhat.");
        }

    } 
}
