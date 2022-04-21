package BaiThiCuoiKy;


import java.util.Date;

public class HangHoaThucPham extends HangHoa{
    private Date ngaySX, ngayHH;
    private String nhaCungCap;

     public HangHoaThucPham(int soLuongTonKho, String tenHangHoa, double donGiaHH, Date ngaySX, Date ngayHH,
            String nhaCungCap) {
        super(soLuongTonKho, tenHangHoa, donGiaHH);
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCungCap = nhaCungCap;
    }
    public HangHoaThucPham(Date ngaySX, Date ngayHH, String nhaCungCap) {
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCungCap = nhaCungCap;
    }
    public Date getNgaySX() {
        return ngaySX;
    }
    public void setNgaySX(Date ngaySX) {
        if (ngaySX.before(this.ngayHH)) {
            this.ngaySX = ngaySX;
        } else {
            System.out.println("Ngay San Xuat Phai Truoc Ngay Het Han");
        }
    }
    public Date getNgayHH() {
        return ngayHH;
    }
    public void setNgayHH(Date ngayHH) {
        if (ngayHH.after(this.ngaySX)) {
            this.ngayHH = ngayHH;
        } else {
            System.out.println("Ngay Het Han Phai Sau Ngay San Xuat");
        }
    }
    public String getNhaCC() {
        return nhaCungCap;
    }
    public void setNhaCC(String nhaCungCap) {
        if (nhaCungCap != null && nhaCungCap != "") {
            this.nhaCungCap = nhaCungCap;
        } else {
            System.out.println("Nha Cung Cap Khong Duoc De Trong");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() +"HangHoaThucPham [ngayHH=" + ngayHH + ", ngaySX=" + ngaySX + ", nhaCC=" + nhaCungCap + "]";
    }

}
    

