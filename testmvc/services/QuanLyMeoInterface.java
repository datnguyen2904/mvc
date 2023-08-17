package testmvc.services;

import testmvc.model.Meo;

public interface QuanLyMeoInterface {
    public boolean themMeo(Meo m);

    public boolean xoaMeo(int id);

    public boolean hienThiToanBoMeo();

    public boolean hienThiMeoTheoId(int id);

    public boolean thayDoiTiengKeu(int id);
}
