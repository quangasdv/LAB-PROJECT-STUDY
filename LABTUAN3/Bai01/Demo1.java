import java.util.Scanner;
// lớp demo1
public class Demo1 {
    public static void main (String[] args) {

        // đối tg hs ko có tham số
        HocSinh hs1 = new HocSinh();
        hs1.nhaphocsinh();
        hs1.xuathocsinh();

        // đối tg hs có tham số
        HocSinh hs2 = new HocSinh(111,"Nguyen Van A",8.5);
        hs2.xuathocsinh();

        // đối tg hs sao chép
        HocSinh hs3  = new HocSinh(hs2);
        hs3.xuathocsinh();

        // đổi tên hs
        hs3.setHoTen("Hoang Thi B");
        hs3.xuathocsinh();

        // tìm tên hs có đtb lớn nhất'
        double max = hs1.getDiemTB();
        String ht = hs1.getHoTen();
        if (max < hs2.getDiemTB()) {
            max = hs2.getDiemTB();
            ht = hs2.getHoTen();
        }
        if (max < hs3.getDiemTB()) {
            max = hs3.getDiemTB();
            ht = hs3.getHoTen();
        }
        System.out.println("Hoc sinh " + ht + " có diem TB cao nhat la: " + max);

    }
}

