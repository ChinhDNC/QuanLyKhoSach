/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu;

import controller.DAOInterface;
import controller.DAO_Phieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Phieu.Phieu;
import doanoop.model.Book;
import java.sql.Date;
import static org.apache.poi.hwmf.record.HwmfTernaryRasterOp.PN;

/**
 *
 * @author 84907
 */
public class PhieuDAO implements DAOInterface<Phieu> {

    public static PhieuDAO getInstance() {
        return new PhieuDAO();
    }

    @Override
    public int insert(Phieu t) {
        int ketQua = 0;
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "INSERT INTO Phieu (maPhieu, nguoiTao, ngayTao,gioTao,loaiPhieu,Total) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setString(2, t.getNguoiTao());
            pst.setString(3, t.getNgayTao());
            pst.setString(4, t.getGioTao());
            if (t.getMaPhieu().contains("PN")) {
                pst.setString(5, "Phiếu nhập");
            } else {
                pst.setString(5, "Phiếu xuất");
            }
            pst.setInt(6, t.getTotal());
            ketQua = pst.executeUpdate();

            DAO_Phieu.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Phieu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Phieu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Phieu> selectAll() {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> selectAllPN() {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu where maphieu like '%PN%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> selectAllPX() {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu where maphieu like '%PX%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Phieu selectById(Phieu t) {
        Phieu ketQua = null;
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                ketQua = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public Phieu selectByMaphieu(String x) {
        Phieu ketQua = null;
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE maPhieu='" + x + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                ketQua = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public boolean Update(String x, int k) {
        String sql = "UPDATE Phieu SET Total=? WHERE maPhieu='" + x + "'";
        try {
            Connection con = DAO_Phieu.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, k);

            return pst.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Phieu> findByMaPhieuN(String x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu nhập' and maPhieu like'%" + x + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByNguoiTaoN(String x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu nhập' and nguoiTao like '%" + x + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByTotalThapHonN(int x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu nhập' and Total < '"+x+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByTotalCaoHonN(int x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu nhập' and Total > '"+x+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    
    //Tìm kiếm phiếu xuất
    public ArrayList<Phieu> findByMaPhieuX(String x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu xuất' and maPhieu like'%" + x + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByNguoiTaoX(String x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu xuất' and nguoiTao like '%" + x + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByTotalThapHonX(int x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu xuất' and Total < '"+x+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> findByTotalCaoHonX(int x) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = DAO_Phieu.getConnection();
            String sql = "SELECT * FROM Phieu WHERE loaiPhieu=N'Phiếu xuất' and Total > '"+x+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                String nguoiTao = rs.getString("nguoiTao");
                String ngayTao = rs.getString("ngayTao");
                String gioTao = rs.getString("gioTao");
                String loaiPhieu = rs.getString("loaiPhieu");
                int Total = rs.getInt("Total");
                Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao, gioTao, loaiPhieu, Total);
                ketQua.add(px);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
