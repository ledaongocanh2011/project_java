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
public class categories {
    private int id;
    private String ten_loai_banh;

    public categories() {
    }

    public categories(int id, String ten_loai_banh) {
        this.id = id;
        this.ten_loai_banh = ten_loai_banh;
    }

    public int getId() {
        return id;
    }

    public String getTen_loai_banh() {
        return ten_loai_banh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen_loai_banh(String ten_loai_banh) {
        this.ten_loai_banh = ten_loai_banh;
    }
    
}
