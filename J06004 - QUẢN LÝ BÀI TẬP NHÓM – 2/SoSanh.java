package JavaCoban;

import java.util.Comparator;

public class SoSanh implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getMaSinhVien().compareTo(o2.getMaSinhVien()) ;
    }
}
