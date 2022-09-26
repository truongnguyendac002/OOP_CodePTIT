package JavaCoban;

public class KhachHang {
    private String maKhachHang, tenKhachHang, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    @Override
    public String toString() {
        return tenKhachHang + " " + diaChi;
    }
}
