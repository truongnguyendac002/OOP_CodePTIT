package JavaCoban;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> aKhachHang = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ma = "KH" + String.format("%03d",i);
            KhachHang x = new KhachHang(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            aKhachHang.add(x);
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> aMatHang = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String ma = "MH" + String.format("%03d",i);
            MatHang x = new MatHang(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            aMatHang.add(x);
        }
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=t; i++) {
            String[] s = sc.nextLine().split("\\s+");
            HoaDon x = new HoaDon();
            String ma = "HD" + String.format("%03d",i);
            x.setMaHoaDon(ma);
            for (KhachHang o : aKhachHang) {
                if (o.getMaKhachHang().equals(s[0])) {
                    x.setKhachHang(o);
                    break;
                }
            }
            for (MatHang o : aMatHang) {
                if (o.getMaMatHang().equals(s[1])) {
                    x.setMatHang(o);
                    break;
                }
            }
            x.setSoLuong(Integer.parseInt(s[2]));
            System.out.println(x.inHoaDon());
        }
    }
}
