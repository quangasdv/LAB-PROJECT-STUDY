import java.util.Scanner;

// xd lớp HocSinh
public class HocSinh {
    private int MaSo;
    private String HoTen;
    private double DiemTB;

// phg thức get set
    public void setMaSo(int maSo) {
        this.MaSo = maSo;
    }
    public int getMaSo() {
        return MaSo;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen; 
    }
    public String getHoTen() {
        return HoTen;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }
    public double getDiemTB() {
        return DiemTB;
    }

//phg thức ko tham số
    public HocSinh () {
        this.MaSo = 0;
        this.HoTen = null;
        this.DiemTB = 0;
    }

// phg thức có tham số
    public HocSinh (int MaSo, String HoTen, double DiemTB) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.DiemTB = DiemTB;
    }

// phg thức sao chép
    public HocSinh (HocSinh hs) {
        this.MaSo = hs.MaSo;
        this.HoTen = hs.HoTen;
        this.DiemTB = hs.DiemTB;
    }

// phg thức nhập hs
    public void nhaphocsinh() {
        Scanner nhapvao = new Scanner (System.in);
        System.out.print("Nhap ma so: ");
        MaSo = nhapvao.nextInt();
        nhapvao.nextLine();
        System.out.print("Nhap ho ten: ");
        HoTen = nhapvao.nextLine();
        System.out.print("Nhap diem TB: ");
        DiemTB = nhapvao.nextDouble();
    }

// phg thức xuất hs
    public void xuathocsinh() {
        System.out.println("Ma so: " + MaSo + " - Ho ten: " + HoTen + " - Diem TB: " + DiemTB);
    }
}


