package LABTUAN1;
import java.util.Scanner;
public class Bai03 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap do F: ");
        double doF;
        doF = nhapvao.nextDouble();

        double doC = (doF - 32) / 1.8;

        System.out.println ("=>> " +doF +"°F = " +doC +"°C");

    } 
}
