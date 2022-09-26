package JavaCoban;

public class BaiTap {
    private String tenBaiTap;
    private int thuTuNhom;

    public int getThuTuNhom() {
        return thuTuNhom;
    }

    @Override
    public String toString() {
        return tenBaiTap;
    }

    public BaiTap(String tenBaiTap, int thuTuNhom) {
        this.tenBaiTap = tenBaiTap;
        this.thuTuNhom = thuTuNhom;
    }
}
