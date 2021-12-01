public class Mouse extends USB {
    public Mouse() {
    }

    public Mouse(String maHang, double gia, int soLuong) {
        super(maHang, gia, soLuong);
    }

    @Override
    public double tinhTongTien() {
        return super.tinhTongTien() * 0.8;
    }

    @Override
    public String show() {
        return super.show();
    }
}
