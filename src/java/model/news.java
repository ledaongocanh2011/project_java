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
public class news {
    private int id;
    private String tieu_de;
    private String tom_tat;
    private String noi_dung;
    private String hinh_anh;

    public news() {
    }

    public news(int id, String tieu_de, String tom_tat, String noi_dung, String hinh_anh) {
        this.id = id;
        this.tieu_de = tieu_de;
        this.tom_tat = tom_tat;
        this.noi_dung = noi_dung;
        this.hinh_anh = hinh_anh;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieu_de() {
        return tieu_de;
    }

    public void setTieu_de(String tieu_de) {
        this.tieu_de = tieu_de;
    }

    public String getTom_tat() {
        return tom_tat;
    }

    public void setTom_tat(String tom_tat) {
        this.tom_tat = tom_tat;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }
    
}
