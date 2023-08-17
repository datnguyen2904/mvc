package testmvc.model;

public class MeoBaTu extends Meo{
    public MeoBaTu() {
        super();
    }
    @Override
    public void hienThiTiengKeu() {
        System.out.println("meo ba tu");
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.print("Tieng keu: ");
        hienThiTiengKeu();
    }
}
