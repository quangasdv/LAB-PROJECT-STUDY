import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner nhapvao = new Scanner(System.in);

        //a. Nhập mảng một chiều các số nguyên
        System.out.print("Nhap so phan tu cua mang: ");
        int sophantu = nhapvao.nextInt();
        int mangmotchieu[] = new int[sophantu];

        System.out.println("=>> Nhap cac phan tu cua mang:  ");
        for (int i = 0; i < sophantu; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            mangmotchieu[i] = nhapvao.nextInt();
        }

        //b. Xuất các phần tử mảng ra cửa sổ xuất chuẩn
        System.out.print("=>> Mang vua nhap là: ");
        for (int i = 0; i < sophantu; i++) {
            System.out.print(mangmotchieu[i] + " ");
        }
        
        //c. Tìm vị trí của một số nguyên x trong mảng
        System.out.print("\n Nhap so nguyen x: ");
        int soX = nhapvao.nextInt();
        int vitri = timvitri(mangmotchieu, soX);
        if (vitri == -1) {
            System.out.println("=>> So " + soX + " khong ton tai trong mang");
        } else {
            System.out.println("=>> So " + soX + " ton tai trong mang tai vi tri " + vitri);
            
        }

        //d. Tìm giá trị lớn nhất trong mảng.
        int giatriMax = timgiatriMax(mangmotchieu);
        System.out.println("=>> Gia tri lon nhat trong mang la: " + giatriMax);

        //e. Tìm giá trị nhỏ nhất trong mảng.
        int giatriMin = timgiatriMin(mangmotchieu);
        System.out.println("=>> Gia tri nho nhat trong mang la: " + giatriMin);

        //f. Tìm vị trí phần tử có giá trị lớn nhất trong mảng.
        int vitriMax = timvitriMax(mangmotchieu);
        System.out.println("=>> Vi tri cua gia tri lon nhat trong mang la: " + vitriMax);

        //g. Sắp xếp mảng tăng dần.
        sapxepTangDan(mangmotchieu);
        System.out.print("=>> Mang sau khi sap xep tang dan la: ");
        xuatMang(mangmotchieu);
    }

    //xuất mảng
    public static void xuatMang (int mang[]) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    //tìm vị trí
    public static int timvitri(int mang[], int x) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //tìm giá trị lớn nhất
    public static int timgiatriMax(int mang[]) {
        int max = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    //tìm giá trị nhỏ nhất
    public static int timgiatriMin(int mang[]) {
        int min = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }

    //tìm vị trí phần tử có giá trị lớn nhất
    public static int timvitriMax(int mang[]) {
        int max = mang[0];
        int vitri = 0;
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
                vitri = i;
            }
        }
        return vitri;
    }

    //sắp xếp mảng tăng dần
    public static void sapxepTangDan(int mang[]) {
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }

}