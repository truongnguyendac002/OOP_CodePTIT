package JavaCoban;

public class MatHang {
    private String maMatHang,tenMatHang,donViTinh;
    private int giaMua,giaBan;

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    @Override
    public String toString() {
        return tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan;
    }

    public MatHang(String maMatHang, String tenMatHang, String donViTinh, String giaMua, String giaBan) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = Integer.parseInt(giaMua);
        this.giaBan = Integer.parseInt(giaBan);
    }
}
