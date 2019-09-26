/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.filling_cake;
import model.products;

/**
 *
 * @author Admin
 */
public class connect_SQL {

    public String username;
    public String password;
    public String dbName;

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public connect_SQL() {
    }

    public connect_SQL(String username, String password, String dbName) {
        this.username = username;
        this.password = password;
        this.dbName = dbName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
// kết nối cơ sở dữ liệu 

    public Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + this.dbName + "?useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(url, this.username, this.password);
            System.out.println("Connectted !");
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Can't connect ");
        }
        return conn;
    }
//  hàm lấy dữ liệu từ cơ sở dữ liệu 

    public ResultSet getData(String tbName, int loaibanh) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from " + tbName + " where ma_loai = " + loaibanh;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
//    lấy loại nhân

    public ArrayList<filling_cake> getFillingCake(int id) {
//        đưa vào mảng
        ArrayList<filling_cake> arr = null;
        String sql;
        if (id == -1) {
            sql = "SELECT * FROM `filling_cake`";
        } else {
            sql = "SELECT * FROM `filling_cake` WHERE id =" + id;
        }
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<filling_cake>();
//          lấy giá trị của mảng
            while (rs.next()) {
                filling_cake loainhan = new filling_cake(rs.getInt(1), rs.getString(2));
                arr.add(loainhan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
//    lấy sản phẩm theo id

    public products getProduct(int id) {
        products sp = null;
        String sql = "SELECT * FROM `products` WHERE id =" + id;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
//            lấy ra giá tri của bảng
            if (rs.next()) {
                sp = new products(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10));
            }
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
//    tìm kiếm sản phẩm

    public ArrayList<products> Search(String search) {
        ArrayList<products> arr = null;
        String sql = "SELECT * FROM `products` WHERE name LIKE '%" + search + "%'";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<products>();
            while (rs.next()) {
                products sp = new products(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
// lấy sản phẩm theo loại 
//==================================================================================================
//==================================================================================================
//==================================================================================================
//    public ArrayList<products> getProductType(int type) {
//        ArrayList<products> arr = null;
//        String sql = "SELECT * FROM `products` WHERE ma_loai = 4";
//        try {
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql);
//            arr = new ArrayList<products>();
//            while (rs.next()) {
//                products sp = new products(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10));
//                arr.add(sp);
//            }
//        } catch (Exception e) {
//        }
//        return arr;
//    }
    
    public ResultSet getPrType(int type){
        String sql = "select * from products where ma_loai =" +type;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
        }
        return rs;
    }
    //==================================================================================================
//==================================================================================================
//==================================================================================================
//    lấy tin tức

    public ResultSet getNews(int id) {
        try {
            String sql = "SELECT * FROM news WHERE id =" + id;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
//    đăng nhập

    public int checkLogin(String user, String pass) {
        String sql = "SELECT * FROM admin WHERE email = '" + user + "'";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                if (rs.getString("password").equals(pass)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }

        } catch (Exception e) {
            return -1;
        }
    }

}
