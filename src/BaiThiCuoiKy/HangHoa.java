package BaiThiCuoiKy;


    public abstract class HangHoa {
        private int maH, soLuongTonKho;
        private String tenHangHoa;
        private double donGiaHH;
    
        public HangHoa(int soLuongTonKho, String tenHangHoa, double donGiaHH) {
            this.soLuongTonKho = soLuongTonKho;
            this.tenHangHoa = tenHangHoa;
            this.donGiaHH = donGiaHH;
        }
    
        public HangHoa() {
        }
    
        
        public int getMaH() {
            return maH;
        }
        
        public void setMaH(int maH) {
            if(maH > 0){
                this.maH = maH;
            }
            else{
                System.out.println("Ban Nhap Sai Roi");
            }
        }
    
        public int getsLTonKhoH() {
            return soLuongTonKho;
        }
        
        public void setsLTonKhoH(int sLTonKhoH) {
            if(sLTonKhoH > 0){
                this.soLuongTonKho = sLTonKhoH;
            }
            else{
                System.out.println("So Luong Hang Ton Khong Dung");
            }
        }
    
        public String getTenHH() {
            return tenHangHoa;
        }
    
        public void setTenHH(String tenHH) {
            if(tenHH != null){
                this.tenHangHoa = tenHH;
            }
        }
        
        public double getDonGiaHH() {
            return donGiaHH;
        }
    
        public void setDonGiaHH(double donGiaHH) {
            if(donGiaHH > 0){
                this.donGiaHH = donGiaHH;
            }
            else{
                System.out.println("Don Gia Khong Dung");
            }
        }
    
        @Override
        public String toString() {
            return "HangHoa [donGiaHH=" + donGiaHH + ", maH=" + maH + ", soLuongTonKho=" + soLuongTonKho + ", tenHangHoa=" + tenHangHoa + "]";
        }
    
        
        
    }
    

