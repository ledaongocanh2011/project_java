/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
//public class tbQuanTri {
//    public int Kiemtra(String taikhoan, String matkhau) {
//        connect_SQL conn = new connect_SQL("root", "", "do_an_java");
//        conn.getConnect();
//        if (conn == null) {
//            return -1;
//        }
//        try {
//            String sql = "SELECT * FROM tbquantri WHERE taikhoan=? and matkhau=MD5(?)";
//            stmt = conn.stmt;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                return 1;
//            } else {
//                return 0;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(tbQuanTri.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
//        }
//    }
//}
