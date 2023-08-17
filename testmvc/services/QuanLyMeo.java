package testmvc.services;

import testmvc.lib.Helper;
import testmvc.model.*;

import java.util.ArrayList;
import java.util.List;

public class QuanLyMeo implements QuanLyMeoInterface {

    private List<Meo> db;
//    private List<MeoAnhLongDai> dbMeoAnhDai;
//    private List<MeoAnhLongNgan> dbMeoAnhNgan;
//    private List<MeoBaTu> dbMeoBaTu;
//    private List<MeoNga> dbMeoNga;

    public QuanLyMeo() {
        db = new ArrayList<>();
//        dbMeoAnhDai = new ArrayList<>();
//        dbMeoAnhNgan = new ArrayList<>();
//        dbMeoBaTu = new ArrayList<>();
//        dbMeoNga = new ArrayList<>();
    }

    @Override
    public boolean themMeo(Meo m) {
        for (Meo item : db)
            if (m.getId() == item.getId()) {
                System.out.println("Meo da ton tai");
                return false;
            }
        db.add(m);
        System.out.println("Them thanh cong");
        return true;
    }

    @Override
    public boolean xoaMeo(int id) {
        for (Meo item : db)
            if (id == item.getId()) {
                db.remove(item);
                System.out.println("Xoa thanh cong");
                return true;
            }
        System.out.println("Xoa that bai");
        return false;
    }

    @Override
    public boolean hienThiToanBoMeo() {
        System.out.println("Danh sach meo:");
        boolean daCoMeo = false;
        for (Meo item : db) {
            item.inThongTin();
            daCoMeo = true;
            System.out.println("---");
        }
        return false;
    }

    @Override
    public boolean hienThiMeoTheoId(int id) {
        for (Meo item : db) {
            if (id == item.getId()) {
                System.out.println("Thong tin meo co id: " + id);
                item.inThongTin();
                return true;
            }
        }
        System.out.println("Khong ton tai meo co ma " + id);
        return false;
    }

    private String hienThiTiengKeu(String str) {
        return str;
    }

    @Override
    public boolean thayDoiTiengKeu( int id) {
        List<Meo> newMeo = new ArrayList<>();

        for(Meo item: db) {
            if (id == item.getId()) {
                Meo updatedMeo = null; // Mèo sau khi cập nhật tiếng kêu

                if (item instanceof MeoAnhLongDai) {
                    MeoAnhLongDai meo = (MeoAnhLongDai) item;
                    String newTiengKeu = Helper.stringInput("Nhap tieng keu moi:");
                    meo.setTiengKeu(newTiengKeu);
                    updatedMeo = meo;
                } else if (item instanceof MeoAnhLongNgan) {
                    MeoAnhLongNgan meo = (MeoAnhLongNgan) item;
                    String newTiengKeu = Helper.stringInput("Nhap tieng keu moi:");
                    meo.setTiengKeu(newTiengKeu);
                    updatedMeo = meo;
                }
                // Thêm các lớp con khác tương tự

                if (updatedMeo != null) {
                    newMeo.add(updatedMeo); // Thêm con mèo đã cập nhật vào danh sách mới
                    System.out.println("Da thay doi tieng keu moi: " + updatedMeo.getTiengKeu());
                }
                return true;
            }
        }

//        for (int i = 0; i < db.size(); i++) {
//            if (db.get(i).getId() == id) {
//                String s = Helper.stringInput("Sua tieng keu:");
//                db.get(i).setTiengKeu(s);
//                System.out.println("Sua thanh cong!");
//                return true;
//            }
//        }
        System.out.println("Khong ton tai meo co id " + id);
        return false;
    }
}
