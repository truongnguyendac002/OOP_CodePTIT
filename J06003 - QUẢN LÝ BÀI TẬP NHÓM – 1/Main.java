package JavaCoban;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVien> sv = new ArrayList<>();
        ArrayList<BaiTap> bt = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            sv.add(x);
        }
        for (int i = 0; i < m; i++) {
            BaiTap x = new BaiTap(sc.nextLine(), i + 1);
            bt.add(x);
        }

        int Q = sc.nextInt();
        while (Q-- > 0) {
            int truyVan = sc.nextInt();
            System.out.println("DANH SACH NHOM " + truyVan + ":");
            for (SinhVien i : sv) {
                if (i.getThuTuNhom() == truyVan)
                    System.out.println(i);
            }

            System.out.print("Bai tap dang ky: ");
            for (BaiTap i : bt) {
                if (i.getThuTuNhom() == truyVan)
                    System.out.println(i);
            }
        }
    }
}
