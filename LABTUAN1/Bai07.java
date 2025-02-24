package LABTUAN1;
import java.util.Scanner;
public class Bai07 {
    public static void main (String[]args)
   {
        Scanner nhapvao = new Scanner(System.in);

        System.out.print("Nhap diem Ly: ");
        double diemLy;
        diemLy = nhapvao.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double diemHoa;
        diemHoa = nhapvao.nextDouble();

        System.out.print("Nhap diem Sinh: ");
        double diemSinh;
        diemSinh = nhapvao.nextDouble();

        System.out.print("Nhap diem Toan: ");
        double diemToan;
        diemToan = nhapvao.nextDouble();

        System.out.print("Nhap diem May tinh: ");
        double diemMaytinh;
        diemMaytinh = nhapvao.nextDouble();

        double phantram = ((diemLy + diemHoa + diemSinh + diemToan + diemMaytinh) / 50) * 100;

        System.out.println("=>> Phan tram diem: " + phantram);

        if (phantram > 90)
        {
            System.out.println("=>> Hang A");

        }
        else if (phantram > 80)
        {
            System.out.println("=>> Hang B");
        }
        else if (phantram > 70)
        {
            System.out.println("=>> Hang C");
        }
        else if (phantram > 60)
        {
            System.out.println("=>> Hang D");
        }
        else if (phantram > 40)
        {
            System.out.println("=>> Hang E");
        }
        else if (phantram < 40)
        {
            System.out.println("=>> Hang F");
        }

   }
}
