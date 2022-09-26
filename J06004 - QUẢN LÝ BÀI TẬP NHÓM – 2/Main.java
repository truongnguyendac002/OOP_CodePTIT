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
        sv.sort(new SoSanh());

        for (int i = 0; i < m; i++) {
            BaiTap x = new BaiTap(sc.nextLine(), i + 1);
            bt.add(x);
        }

        for (SinhVien i : sv) {
            System.out.println("" + i + " " + i.getThuTuNhom() + " " + bt.get(i.getThuTuNhom() - 1));
        }
    }
}


