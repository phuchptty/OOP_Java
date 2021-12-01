public class HocSinhChuyenToan extends HocSinh{
    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (toan * 2 + ly + hoa) / 4;
    }
}
