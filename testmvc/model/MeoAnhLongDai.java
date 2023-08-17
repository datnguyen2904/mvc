package testmvc.model;

public class MeoAnhLongDai extends Meo {
    public MeoAnhLongDai() {
        super();
    }

    @Override
    public void hienThiTiengKeu() {
        System.out.println("meo anh long dai");
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.print("Tieng keu: ");
        hienThiTiengKeu();
    }
}
