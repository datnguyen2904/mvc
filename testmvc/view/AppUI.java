package testmvc.view;

import testmvc.lib.Helper;
import testmvc.model.*;
import testmvc.services.QuanLyMeo;

public class AppUI {
    private QuanLyMeo qlm;

    public AppUI() {
        qlm = new QuanLyMeo();
        menu();
    }

    public void menu() {
        System.out.println("----Quan ly meo cho me----");
        System.out.println("1. Them meo");
        System.out.println("2. Xoa meo theo id");
        System.out.println("3. Hien thi toan bo meo");
        System.out.println("4. Hien thi meo theo id");
        System.out.println("5. Thay doi tieng keu theo id");
        System.out.println("6. Thoat");
        int chucNang = Helper.intInput("Nhap chuc nang:", "Loi, nhap lai!");
        thucThi(chucNang);
    }

    public void thucThi(int chucNang) {
        switch (chucNang) {
            case 1:
                System.out.println("Ban muon them loai meo nao(1. meo anh long dai, 2. meo anh long ngan, 3. meo ba tu, 4.meo nga: ");
                int loaiMeo = Helper.intInput("Nhap loai meo:", "Loi, nhap lai");
                Meo meo;
                switch (loaiMeo) {
                    case 1:
                        meo = new MeoAnhLongDai();
                        qlm.themMeo(meo);
                        break;
                    case 2:
                        meo = new MeoAnhLongNgan();
                        qlm.themMeo(meo);
                        break;
                    case 3:
                        meo = new MeoBaTu();
                        qlm.themMeo(meo);
                        break;
                    case 4:
                        meo = new MeoNga();
                        qlm.themMeo(meo);
                        break;
                }
                break;
            case 2:
                int id = Helper.intInput("Nhap id meo can xoa: ", "Loi, nhap lai!");
                qlm.xoaMeo(id);
                break;
            case 3:
                qlm.hienThiToanBoMeo();
                break;
            case 4:
                int id1 = Helper.intInput("Nhap id meo can tim: ", "Loi, nhap lai!");
                qlm.hienThiMeoTheoId(id1);
                break;
            case 5:
                int id2 = Helper.intInput("Nhap id meo can sua tieng keu: ", "Loi, nhap lai!");
                qlm.thayDoiTiengKeu(id2);
                break;
            case 6:
                System.exit(0);
        }
        menu();
    }
}
