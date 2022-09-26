package JavaCoban;

public class SanPham {
    private String ma,ten;
    private long donGia1,donGia2;

    public SanPham() {
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    public long getDonGia(String ma) {
        int x = Integer.parseInt(String.valueOf(ma.charAt(2)));
        if (x ==1) return donGia1;
        else return donGia2;
    }
    public SanPham(String ma, String ten, long donGia1, long donGia2) {
        this.ma = ma;
        this.ten = ten;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

}
