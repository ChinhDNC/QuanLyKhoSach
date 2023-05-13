/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import com.sun.jdi.connect.spi.Connection;
import Phieu.Phieu;
import Phieu.PhieuDAO;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import doanoop.model.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import doanoop.model.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static javax.management.remote.JMXConnectorFactory.connect;
import java.sql.*;
import doanoop.model.GiaoTrinh;
import doanoop.model.SachKhac;
import doanoop.model.Sachgiaokhoa;
import doanoop.model.Truyen;

/**
 *
 * @author 84907
 */
public class DAO {

    Connection connect;

    public static DAO getInstance() {
        return new DAO();
    }

    public DAO() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=BookList;"
                    + "encrypt=false";

            String user = "sa";
            String pass = "1234";
            connect = DriverManager.getConnection(url, user, pass);
//            if(connect !=null){
//                System.out.println("Thanh cong DAO");}
        } catch (Exception e) {
            System.out.println("That bai");

        }

    }

    //Sách nói chung
    public boolean addBook(Book book) {
        String sql = "INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getMasach());
            ps.setString(2, book.getTensach());
            ps.setString(3, book.getTheloai());
            ps.setString(4, book.getTacgia());
            ps.setInt(5, book.getSoluong());
            ps.setString(6, book.getNhaxuatban());
            ps.setInt(7, book.getNamxuatban());
            ps.setInt(8, book.getGia());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public void fillBook(String sql, ArrayList<Book> list) {
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));

                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> getBookList() {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book ";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> getBookList_inWare() {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book where Soluong > 0 ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));

                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteBook(Book book) {
        String sql = "Delete Book where Masach=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getMasach());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Book> findByTensach(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Tensach like N'%" + key + "%' ";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByGiaThapHon(int key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Gia < '" + key + "'";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByGiaCaoHon(int key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Gia > '" + key + "'";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByMasach(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        fillBook(sql, list);
        return list;
    }

    public Book getBook(String key) {
        Book x = new Book();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x.setMasach(rs.getString("Masach"));
                x.setTensach(rs.getString("Tensach"));
                x.setTacgia(rs.getString("Tacgia"));
                x.setSoluong(rs.getInt("Soluong"));
                x.setTheloai(rs.getString("Theloai"));
                x.setNhaxuatban(rs.getString("Nhaxuatban"));
                x.setNamxuatban(rs.getInt("Namxuatban"));
                x.setGia(rs.getInt("Gia"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public GiaoTrinh getGiaoTrinh(String key) {
        GiaoTrinh x = new GiaoTrinh();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x.setMasach(rs.getString("Masach"));
                x.setTensach(rs.getString("Tensach"));
                x.setTacgia(rs.getString("Tacgia"));
                x.setTheloai(rs.getString("Theloai"));
                x.setNhaxuatban(rs.getString("Nhaxuatban"));
                x.setNamxuatban(rs.getInt("Namxuatban"));
                x.setGia(rs.getInt("Gia"));
                x.setLinhvuc(rs.getString("Linhvuc"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public Truyen getTruyen(String key) {
        Truyen x = new Truyen();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x.setMasach(rs.getString("Masach"));
                x.setTensach(rs.getString("Tensach"));
                x.setTacgia(rs.getString("Tacgia"));
                x.setTheloai(rs.getString("Theloai"));
                x.setNhaxuatban(rs.getString("Nhaxuatban"));
                x.setNamxuatban(rs.getInt("Namxuatban"));
                x.setGia(rs.getInt("Gia"));
                x.setTomau(rs.getBoolean("Tomau"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public Sachgiaokhoa getGiaoKhoa(String key) {
        Sachgiaokhoa x = new Sachgiaokhoa();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x.setMasach(rs.getString("Masach"));
                x.setTensach(rs.getString("Tensach"));
                x.setTacgia(rs.getString("Tacgia"));
                x.setTheloai(rs.getString("Theloai"));
                x.setNhaxuatban(rs.getString("Nhaxuatban"));
                x.setNamxuatban(rs.getInt("Namxuatban"));
                x.setGia(rs.getInt("Gia"));
                x.setKhoi(rs.getInt("Khoi"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public SachKhac getSachKhac(String key) {
        SachKhac x = new SachKhac();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x.setMasach(rs.getString("Masach"));
                x.setTensach(rs.getString("Tensach"));
                x.setTacgia(rs.getString("Tacgia"));
                x.setTheloai(rs.getString("Theloai"));
                x.setNhaxuatban(rs.getString("Nhaxuatban"));
                x.setNamxuatban(rs.getInt("Namxuatban"));
                x.setGia(rs.getInt("Gia"));
                x.setLoai(rs.getString("Loai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public ArrayList<Book> findByTacgia(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Tacgia like N'%" + key + "%' ";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByTensach1(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Tensach like N'%" + key + "%' and Soluong > 0 ";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByMasach1(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Masach like '%" + key + "%' and Soluong > 0";
        fillBook(sql, list);
        return list;
    }

    public ArrayList<Book> findByTacgia1(String key) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Tacgia like N'%" + key + "%' "
                + "AND Soluong > 0";
        fillBook(sql, list);
        return list;
    }

    public boolean afterExport(Book book, String x, int k) {
        String sql = "UPDATE Book SET Soluong=? WHERE Masach='" + x + "'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, book.getSoluong() - k);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean afterImport(Book book, String x, int k) {
        String sql = "UPDATE Book SET Soluong=? WHERE Masach='" + x + "'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, book.getSoluong() + k);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Giáo trình
    GiaoTrinh gt = new GiaoTrinh();

    public boolean addGT(GiaoTrinh gt) {
        String sql = "INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia,Linhvuc)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, gt.getMasach());
            ps.setString(2, gt.getTensach());
            ps.setString(3, "Giáo trình");
            ps.setString(4, gt.getTacgia());
            ps.setInt(5, 0);
            ps.setString(6, gt.getNhaxuatban());
            ps.setInt(7, gt.getNamxuatban());
            ps.setInt(8, gt.getGia());

            ps.setString(9, gt.getLinhvuc());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<GiaoTrinh> getGTBook() {
        ArrayList<GiaoTrinh> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiaoTrinh book = new GiaoTrinh();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));
                book.setLinhvuc(rs.getString("Linhvuc"));
                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean editGT(GiaoTrinh book) {
        String sql = "UPDATE Book SET Tensach=?,Tacgia=?,Nhaxuatban=?,NamXuatban=?,Gia=?,Linhvuc=? WHERE Masach=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getTensach());
            ps.setString(2, book.getTacgia());
            ps.setString(3, book.getNhaxuatban());
            ps.setInt(4, book.getNamxuatban());
            ps.setInt(5, book.getGia());
            ps.setString(6, book.getLinhvuc());
            ps.setString(7, book.getMasach());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Truyện
    Truyen tr = new Truyen();

    public boolean addTR(Truyen tr) {
        String sql = "INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia,Tomau)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, tr.getMasach());
            ps.setString(2, tr.getTensach());
            ps.setString(3, "Truyện");
            ps.setString(4, tr.getTacgia());
            ps.setInt(5, 0);
            ps.setString(6, tr.getNhaxuatban());
            ps.setInt(7, tr.getNamxuatban());
            ps.setInt(8, tr.getGia());
            if (tr.isTomau()) {
                ps.setBoolean(9, true);
            } else {
                ps.setBoolean(9, false);
            }

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<Truyen> getTRBook() {
        ArrayList<Truyen> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Truyen book = new Truyen();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));
                book.setTomau(rs.getBoolean("Tomau"));
                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean editTR(Truyen book) {
        String sql = "UPDATE Book SET Tensach=?,Tacgia=?,Nhaxuatban=?,NamXuatban=?,Gia=?,Linhvuc=? WHERE Masach=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getTensach());
            ps.setString(2, book.getTacgia());
            ps.setString(3, book.getNhaxuatban());
            ps.setInt(4, book.getNamxuatban());
            ps.setInt(5, book.getGia());
            if (book.isTomau()) {
                ps.setString(6, "Có");
            } else {
                ps.setString(6, "Không");
            }

            ps.setString(7, book.getMasach());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//Sách giáo khoa
    Sachgiaokhoa gk;

    public boolean addSGK(Sachgiaokhoa sgk) {
        String sql = "INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia,Khoi)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, sgk.getMasach());
            ps.setString(2, sgk.getTensach());
            ps.setString(3, "Sách giáo khoa");
            ps.setString(4, sgk.getTacgia());
            ps.setInt(5, 0);
            ps.setString(6, sgk.getNhaxuatban());
            ps.setInt(7, sgk.getNamxuatban());
            ps.setInt(8, sgk.getGia());

            ps.setInt(9, sgk.getKhoi());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<Sachgiaokhoa> getGKBook() {
        ArrayList<Sachgiaokhoa> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sachgiaokhoa book = new Sachgiaokhoa();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));
                book.setKhoi(rs.getInt("Khoi"));
                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean editSGK(Sachgiaokhoa book) {
        String sql = "UPDATE Book SET Tensach=?,Tacgia=?,Nhaxuatban=?,NamXuatban=?,Gia=?,Khoi=? WHERE Masach=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getTensach());
            ps.setString(2, book.getTacgia());
            ps.setString(3, book.getNhaxuatban());
            ps.setInt(4, book.getNamxuatban());
            ps.setInt(5, book.getGia());
            ps.setInt(6, book.getKhoi());
            ps.setString(7, book.getMasach());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

// Các loại sách khác
    SachKhac sk = new SachKhac();

    public boolean addSK(SachKhac sk) {
        String sql = "INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia,Loai)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, sk.getMasach());
            ps.setString(2, sk.getTensach());
            ps.setString(3, "Khác");
            ps.setString(4, sk.getTacgia());
            ps.setInt(5, 0);
            ps.setString(6, sk.getNhaxuatban());
            ps.setInt(7, sk.getNamxuatban());
            ps.setInt(8, sk.getGia());

            ps.setString(9, sk.getLoai());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<SachKhac> getSKBook() {
        ArrayList<SachKhac> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachKhac book = new SachKhac();
                book.setMasach(rs.getString("Masach"));
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));
                book.setLoai(rs.getString("Loai"));
                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean editSK(SachKhac book) {
        String sql = "UPDATE Book SET Tensach=?,Tacgia=?,Nhaxuatban=?,NamXuatban=?,Gia=?, Loai=? WHERE Masach=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, book.getTensach());
            ps.setString(2, book.getTacgia());
            ps.setString(3, book.getNhaxuatban());
            ps.setInt(4, book.getNamxuatban());
            ps.setInt(5, book.getGia());
            ps.setString(6, book.getLoai());
            ps.setString(7, book.getMasach());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    Tài khoản
    TaiKhoan tk = new TaiKhoan();

    //Thêm
    public boolean addTK(TaiKhoan tk) {

        String sql = "INSERT INTO Account(Username,Pass,Role,Phone,Status)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, tk.getUser());
            ps.setString(2, tk.getPass());
            ps.setString(3, tk.getRole());
            ps.setString(4, tk.getPhone());
            ps.setString(5, "Hoạt động");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Sửa
//        
//    }
    public boolean editTK(TaiKhoan tk) {

        String sql = "UPDATE Account SET  Pass=?, Role=?, Phone=?, Status=? where Username=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, tk.getPass());
            ps.setString(2, tk.getRole());
            ps.setString(3, tk.getPhone());
            ps.setString(4, tk.getStatus());
            ps.setString(5, tk.getUser());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteTK(TaiKhoan tk) {

        String sql = "Delete Account where Username=?";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, tk.getUser());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<TaiKhoan> getTaiKhoan() {
        ArrayList<TaiKhoan> taikhoan = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        fillTableTK(sql, taikhoan);
        return taikhoan;
    }

    public TaiKhoan getTK(String x) {
        TaiKhoan tk = new TaiKhoan();
        String sql = "select * from Account where Username =? ";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, x);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tk.setUser(rs.getString("Username"));
                tk.setPass(rs.getString("Pass"));
                tk.setRole(rs.getString("Role"));
                tk.setPhone(rs.getString("Phone"));
                tk.setStatus(rs.getString("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    public void fillTableTK(String sql, ArrayList<TaiKhoan> taikhoan) {
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setUser(rs.getString("Username"));
                tk.setPass(rs.getString("Pass"));
                tk.setRole(rs.getString("Role"));
                tk.setPhone(rs.getString("Phone"));
                tk.setStatus(rs.getString("Status"));
                taikhoan.add(tk);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TaiKhoan> findByUser(String username) {
        ArrayList<TaiKhoan> taikhoan = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE Username like '%" + username + "%' ";
        fillTableTK(sql, taikhoan);
        return taikhoan;
    }

    public ArrayList<TaiKhoan> findByRole(String role) {
        ArrayList<TaiKhoan> taikhoan = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE Role like N'%" + role + "%' ";
        fillTableTK(sql, taikhoan);
        return taikhoan;
    }

    public ArrayList<TaiKhoan> findByPhone(String phone) {
        ArrayList<TaiKhoan> taikhoan = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE Phone like '%" + phone + "%' ";
        fillTableTK(sql, taikhoan);
        return taikhoan;
    }

    public static void main(String[] args) {
        new DAO();
    }

}
