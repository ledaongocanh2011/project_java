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
//    nếu t thay lsoibanh =2 tuong đương với bánh dẻo, loaibanh=1 tương đuqong với bánh nướng
//            viết như ban nãy. lấy ra được theo cái loaibanh =1;
//            nhuqng, t muốn lấy cả bánh nướng có loaibanh =2, thì t phải sửa
//    bsys giờ, t muốn cái giá trị 1, 2 k cần phải thay đổi, mỗi khi t chọn bánh nướng , nó ẽ hiểu là lấy các loại bánh có loaibanh =1, còn kích vào bánh dẻo thì loaibanh =2, và hiển thị theo cái vùng mà t phân ra như trên giao diện

    public ResultSet getData(String tbName, int loaibanh) {
        try {
            String sql = "select * from " + tbName + " where ma_loai = " + loaibanh;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet getFilling(int loaiNhan ){
        try {
            String sql = "SELECT * FROM `filling_cake` WHERE id = " + loaiNhan ;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(connect_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
