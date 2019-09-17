/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class products {
    private int id;
    private String ma_san_pham;
    private String ten_san_pham;
    private double gia_san_pham;
    private double gia_khuyen_mai;
    private int ma_loai;
    private int ma_loai_nhan;
    private String hinh_anh;
    private String tom_tat;
    private String noi_dung;
    private int trang_thai;

    public products() {
    }

    public products(int id, String ma_san_pham, String ten_san_pham, double gia_san_pham, double gia_khuyen_mai, int ma_loai, int ma_loai_nhan, String hinh_anh, String tom_tat, String noi_dung, int trang_thai) {
        this.id = id;
        this.ma_san_pham = ma_san_pham;
        this.ten_san_pham = ten_san_pham;
        this.gia_san_pham = gia_san_pham;
        this.gia_khuyen_mai = gia_khuyen_mai;
        this.ma_loai = ma_loai;
        this.ma_loai_nhan = ma_loai_nhan;
        this.hinh_anh = hinh_anh;
        this.tom_tat = tom_tat;
        this.noi_dung = noi_dung;
        this.trang_thai = trang_thai;
    }

    public int getId() {
        return id;
    }

    public String getMa_san_pham() {
        return ma_san_pham;
    }

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public double getGia_san_pham() {
        return gia_san_pham;
    }

    public double getGia_khuyen_mai() {
        return gia_khuyen_mai;
    }

    public int getMa_loai() {
        return ma_loai;
    }

    public int getMa_loai_nhan() {
        return ma_loai_nhan;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public String getTom_tat() {
        return tom_tat;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMa_san_pham(String ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public void setGia_san_pham(double gia_san_pham) {
        this.gia_san_pham = gia_san_pham;
    }

    public void setGia_khuyen_mai(double gia_khuyen_mai) {
        this.gia_khuyen_mai = gia_khuyen_mai;
    }

    public void setMa_loai(int ma_loai) {
        this.ma_loai = ma_loai;
    }

    public void setMa_loai_nhan(int ma_loai_nhan) {
        this.ma_loai_nhan = ma_loai_nhan;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public void setTom_tat(String tom_tat) {
        this.tom_tat = tom_tat;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }
    
    
     
    
}
