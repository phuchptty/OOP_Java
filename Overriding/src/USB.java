public class USB {
    public String maHang;
    public double gia;
    public int soLuong;

    public USB() {}

    public USB(String maHang, double gia, int soLuong) {
        this.maHang = maHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong >= 0)
            this.soLuong = soLuong;
        else
            throw new Error("So luong phai lon hon hoac bang 0");
    }

    public void setGia(double gia) {
        if(gia >= 0)
            this.gia = gia;
        else
            throw new Error("Gia phai lon hon hoac bang 0");
    }

    public double tinhTongTien() {
        return gia * soLuong;
    }

    public String show() {
        return "USB{" +
                "maHang='" + maHang + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", tongTien=" + tinhTongTien() +
                '}';
    }
}
