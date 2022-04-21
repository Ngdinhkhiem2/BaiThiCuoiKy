package BaiThiCuoiKy;


import java.util.Date;

public class HangHoaSanhSu extends HangHoa{
    private String nhaSX;
    private Date ngayNhapKho;
    
    public HangHoaSanhSu(int soLuongTonKho, String tenHangHoa, double donGiaHH, String nhaSX, Date ngayNhapKho) {
        super(soLuongTonKho, tenHangHoa, donGiaHH);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
   
    public HangHoaSanhSu(String nhaSX, Date ngayNhapKho) {
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSX() {
        return nhaSX;
    }
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        if (ngayNhapKho != null) {
            this.ngayNhapKho = ngayNhapKho;
        } else {
            System.out.println("Ngay Khong Duoc De Trong");
        }
    }
    @Override
    public String toString() {
        return "HangHoaSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhaSX=" + nhaSX + "]";
    }
    
    
}
    

