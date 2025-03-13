public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron (float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhapbankinh() {
        System.out.println("Nhap ban kinh: ");
        banKinh = bk.nextFloat();
    }

    @Override
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    @Override
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }

    @Override
    public void tinhTheTich() {
        theTich = 4f/3f * PI * Math.pow(banKinh, 3);
    }
    
}
