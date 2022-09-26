package JavaCoban;

public class SinhVien {
    private String maSinhVien,hoTen,soDienThoai;
    private int thuTuNhom;

    public int getThuTuNhom() {
        return thuTuNhom;
    }

    public SinhVien(String maSinhVien, String hoTen, String soDienThoai, int thuTuNhom) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.thuTuNhom = thuTuNhom;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + soDienThoai;
    }
}