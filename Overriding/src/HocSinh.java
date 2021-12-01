public class HocSinh {
    public String hoTen;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double tinhDiemTrungBinh() {
        return (toan + ly + hoa) / 3;
    }
}
