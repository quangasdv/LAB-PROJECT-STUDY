package LABTUAN1;
import java.util.Scanner;
public class Bai04 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap so nam: ");
        double sonam;
        sonam = nhapvao.nextDouble();

        if ((sonam % 4 == 0 && sonam % 100 != 0)) 
        {
            System.out.println ("Nam " + sonam + " la nam nhuan.");
        }
        else
        {
            System.out.println ("=>> Nam " + sonam + " khong phai la nam nhuan.");
        }

    } 
}
