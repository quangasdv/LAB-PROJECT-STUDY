public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0f;
        this.y = 0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getY() {
        return y;
    }

//tổng các thành phần x và y của hai điểm
    public Point2D tongcacTP(Point2D diemthu1, Point2D diemthu2) {
        return new Point2D(diemthu1.x + diemthu2.x, diemthu1.y + diemthu2.y);
    }

//điểm đối xứng qua trục hoành
    public Point2D diemDXtruchoanh() {
        return new Point2D(x, -y);
    }
//in tọa độ
    public void intoado () {
        System.out.println("Toa do la: (" + x + "," + y + ")");
    }

    public static void main(String[] args0) {
        Point2D d1 = new Point2D(7, 6.3f);
        Point2D d2 = new Point2D(2.5f, 4);

        Point2D tong = Point2D.tong(d1, d2);
        System.out.print("Tong hai diem la: ");
        tong.intoado();

        Point2D doixung = d1.diemDXtruchoanh();
        System.out.print("Diem doi xung qua truc hoanh la: ");
        doixung.intoado();
    }
}
