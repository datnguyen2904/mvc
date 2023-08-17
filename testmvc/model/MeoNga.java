package testmvc.model;

public class MeoNga extends Meo{
    public MeoNga() {
        super();
    }
    @Override
    public void hienThiTiengKeu() {
        System.out.println("meo nga");
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.print("Tieng keu: ");
        hienThiTiengKeu();
    }
}
