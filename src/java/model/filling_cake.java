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
public class filling_cake {
    private int id;
    private String ten_loai_nhan;

    public filling_cake() {
    }

    public filling_cake(int id, String ten_loai_nhan) {
        this.id = id;
        this.ten_loai_nhan = ten_loai_nhan;
    }

    public int getId() {
        return id;
    }

    public String getTen_loai_nhan() {
        return ten_loai_nhan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen_loai_nhan(String ten_loai_nhan) {
        this.ten_loai_nhan = ten_loai_nhan;
    }
    
}
