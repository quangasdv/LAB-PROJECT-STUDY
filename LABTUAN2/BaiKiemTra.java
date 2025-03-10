import java.util.Scanner;

public class BaiKiemTra {
    private String MSSV;
    private String hoten;
    private String diachi;
    private String SDT;

    // Constructor
    public BaiKiemTra(String MSSV, String hoten, String diachi, String SDT) {
        this.MSSV = MSSV;
        this.hoten = hoten;
        this.diachi = diachi;
        this.SDT = SDT;
    }

    // Getters
    public String getMSSV() {
        return MSSV;
    }
    
    public String getHoten() {
        return hoten;
    }
    
    public String getDiachi() {
        return diachi;
    }
    
    public String getSDT() {
        return SDT;
    }

    // Setters
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "MSSV: " + MSSV + ", Ho ten: " + hoten + ", Dia chi: " + diachi + ", SDT: " + SDT;
    }

    public static void main(String[] args) {
        Scanner nhapvao = new Scanner(System.in);
        
        // Tạo đối tượng với constructor rỗng (cần thêm constructor mặc định)
        System.out.println("Nhap thong tin sinh vien:");
        
        System.out.print("Nhap MSSV: ");
        String mssv = nhapvao.nextLine();
        
        System.out.print("Nhap Ho ten: ");
        String hoten = nhapvao.nextLine();
        
        System.out.print("Nhap Dia chi: ");
        String diachi = nhapvao.nextLine();
        
        System.out.print("Nhap SDT: ");
        String sdt = nhapvao.nextLine();

        // Tạo đối tượng với thông tin vừa nhập
        BaiKiemTra sv = new BaiKiemTra(mssv, hoten, diachi, sdt);

        System.out.println("\n=>> Thong tin sinh vien vua nhap: ");
        System.out.println(sv.toString()); 

        System.out.println("\n=>> Lay thong tin bang get: ");
        System.out.println("MSSV: " + sv.getMSSV());
        System.out.println("Ho ten: " + sv.getHoten());
        System.out.println("Dia chi: " + sv.getDiachi());
        System.out.println("SDT: " + sv.getSDT());

    }
}