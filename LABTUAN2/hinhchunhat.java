import java.util.Scanner;
public class hinhchunhat{
    private double chieuDai;
    private double chieuRong;
    public hinhchunhat( double chieuDai, double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
        public double getChieudai(){
            return chieuDai;
        }
        public double setchieuDai(){
            return chieuDai;

        }
        public double tinhDienTich(){
         return chieuDai*chieuRong;
        }
        public double tihChuVi(){
        return (chieuDai+chieuRong)*2;
        }
        public toString (){
            return ( Chiều dài:" + chieuDai + ",chiều rộng:"
            + chieuRong +", diện tích:"+ tinhDienTich+", chu vi:" +tinhChuVi+")
        }
    } 
}