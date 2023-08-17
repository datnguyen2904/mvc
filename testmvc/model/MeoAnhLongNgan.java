package testmvc.model;

public class MeoAnhLongNgan extends Meo{
    public MeoAnhLongNgan() {
        super();
    }
    @Override
    public void hienThiTiengKeu() {
        System.out.println("meo anh long ngan");
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.print("Tieng keu: ");
        hienThiTiengKeu();
    }
}
