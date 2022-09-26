package JavaCoban;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sanPhams.add(x);
        }

        int m = sc.nextInt();
        ArrayList<HoaDon> hoaDons = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            HoaDon x = new HoaDon(sc.next(), sc.nextInt());
            hoaDons.add(x);
        }

        for (int i = 0; i < hoaDons.size(); i++) {
            HoaDon x = hoaDons.get(i);
            SanPham sanPhamTuongUng = new SanPham();
            for (SanPham sp : sanPhams) {
                if (sp.getMa().equals(x.getMaHoaDon().substring(0,2))) {
                    sanPhamTuongUng = sp;
                    break;
                }
            }
            long donGia = sanPhamTuongUng.getDonGia(x.getMaHoaDon());
            System.out.println(x.getMaHoaDon() + "-" + String.format("%03d",i+1)+ " " +
                    sanPhamTuongUng.getTen() + " " + x.getTienGiamGia(donGia) + " " +
                    x.getTienPhaiTra(donGia));
        }
    }
}

