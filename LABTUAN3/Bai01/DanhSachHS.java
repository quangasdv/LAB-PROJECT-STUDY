import java.util.Scanner;
// lớp dsach hs
public class DanhSachHS {
    private HocSinh ds[];
    private double soHS;

    public void nhapDS() {
        Scanner nhapvao = new Scanner(System.in);
        System.out.print("Nhap so HS: ");
        soHS = nhapvao.nextDouble();
        ds = new HocSinh[(int)soHS];
        for (int i = 0; i < soHS; i++) {
            ds[i] = new HocSinh();
            ds[i].nhaphocsinh();
        }
    }
    public void xuatDS() {
        System.out.println("Danh sach hoc sinh la: \n");
        for (int i = 0; i < soHS; i++) {
            ds[i].xuathocsinh();
        }
    }
    public void sapxepHS() {
        for (int i = 0; i < soHS - 1; i++) {
            for (int j = i + 1; j < soHS; j++) {
                if (ds[i].getDiemTB() < ds[j].getDiemTB()) {
                    HocSinh tg = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tg;
                }
            }
        }
        System.out.println("\nDanh sach giam dan theo diem TB cua hs la: ");
        xuatDS();
    }
}