package JavaCoban;


public class HoaDon {
    private String maHoaDon;
    private  long soLuong;

    public HoaDon(String maHoaDon, long soLuong) {
        this.maHoaDon = maHoaDon;
        this.soLuong = soLuong;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public double getGiamGia() {
        if (soLuong >= 150) return 0.5;
        else if (soLuong >= 100) return 0.3;
        else if (soLuong >= 50) return 0.15;
        return 0;
    }
    public long getTienGiamGia(long donGia) {
        return (long) (donGia*soLuong*getGiamGia());
    }
    public long getTienPhaiTra(long donGia) {
        long x = donGia*soLuong;
        return (long) ( x*(1-getGiamGia()));
    }
}
