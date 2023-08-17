package testmvc.model;

import testmvc.lib.Helper;

import java.util.Scanner;

public abstract class Meo {
    private int id, tuoi;
    private String ten;
    private boolean gioiTinh;
    private String tiengKeu;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    private Scanner sc = new Scanner(System.in);

    public Meo() {
        id = Helper.intInput("Nhap id: ", "Loi, nhap lai!");
        ten = Helper.stringInput("Nhap ten meo:");
        tuoi = Helper.intInput("Nhap tuoi:", "Loi, nhap lai!");
        System.out.println("Nhap gioi tinh(false/true): ");
        gioiTinh = sc.nextBoolean();
        //setGioiTinh(gioiTinh);
    }

    public void inThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Ten meo: " + ten);
        System.out.println("Tuoi meo: " + tuoi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "meo duc" : "meo cai"));
    }

    public abstract void hienThiTiengKeu();
}
