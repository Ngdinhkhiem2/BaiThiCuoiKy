package BaiThiCuoiKy;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangHoaTestDriver {
    public static void main(String[] args) {
        DanhSachHangHoa dsHH = new DanhSachHangHoa();
        Scanner sc = new Scanner(System.in);
        try {
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            String s = "20-02-2022";
            String s1 = "26-02-2022";
            String s2 = "28-02-2022";
            String s3 = "29-04-2022";
            String s4 = "01-05-2022";
            Date d = sf.parse(s);
            Date d1 = sf.parse(s1);
            Date d2 = sf.parse(s2);
            Date d3 = sf.parse(s3);
            Date d4 = sf.parse(s4);

            HangHoa h1 = new HangHoaThucPham(12, "Bia 333", 1500, d, d2, "333");
            HangHoa h2 = new HangHoaDienMay(1, "LapTop", 13_500_000, 20, 80);
            HangHoa h3 = new HangHoaSanhSu(20, "chen", 20_000, "Inox", d1);
            HangHoa h4 = new HangHoaThucPham(200, "My Tom", 20_000, d3, d4, "Hao Hao");
            HangHoa h5 = new HangHoaDienMay(15,"TV", 20_000_000, 56, 150);

            dsHH.add(h1);
            dsHH.add(h2);
            dsHH.add(h3);
            dsHH.add(h4);
            dsHH.add(h5);
        } catch (Exception e) {
            
        }
        do{
            System.out.println("--------------------------");
            System.out.println("----------Menu------------");
            System.out.println("---------1.Them-----------");
            System.out.println("---------2.Xuat-----------");
            System.out.println("---------3.Tim Kiem-------");
            System.out.println("---------4.Xoa------------");
            System.out.println("---------5.Sap xep--------");
            System.out.println("---------6.Thong Ke-------");
            System.out.println("---------7.Ket thuc-------");
            System.out.println("--------------------------");
            int key1 = sc.nextInt();
            sc.nextLine();
            switch(key1){
                case 1:
                dsHH.them();
                break;
                case 2:
                dsHH.hienThiHangHoa();
                break;
                case 3:
                System.out.println("Nhap Id Muon tim kiem: ");
                int maHang = sc.nextInt();
                dsHH.timHangHoa(maHang);
                break;
                case 4:
                System.out.println("Nhap Id Mun Xoa");
                int maH = sc.nextInt();
                dsHH.xoa(maH);
                break;
                case 5:
                dsHH.sapXepHangHoa();
                break;
                case 6:
                dsHH.thongKe();
                break;
                case 7: 
                System.out.println("Thoat!!");
                System.exit(0);
            }
        }while(true);
    }    
}
    

