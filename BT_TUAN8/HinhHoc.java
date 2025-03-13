abstract class HinhHoc {
    public static final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    
    public void HinhHoc(String ten, float chuVi, float dienTich, float theTich) {
        this.ten = ten;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
        this.theTich = theTich;
    }

    public void xuatTen() {
        System.out.println("Ten hinh hoc: " + ten);
    }

    public abstract void tinhChuVi();
    public void inChuVi() {
        System.out.println("Chu vi: " + chuVi);
    }

    public abstract void tinhDienTich();
    public void inDienTich() {
        System.out.println("Dien tich: " + dienTich);
    }

    public abstract void tinhTheTich();
    public void inTheTich() {
        System.out.println("The tich: " + theTich);
    }
    
}