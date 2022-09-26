package JavaCoban;


public class HoaDon {
    private String maHoaDon;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public int getGia(MatHang x) {
        return soLuong *  x.getGiaBan();
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HoaDon() {
    }


    public String inHoaDon() {
        return maHoaDon + " " + khachHang + " " + matHang + " " + soLuong + " " + getGia(matHang);
    }
}
