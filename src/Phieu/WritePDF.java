/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu;

import Phieu.ChiTietPhieu;
import Phieu.ChiTietPhieuDAO;
import Phieu.Phieu;
import Phieu.PhieuDAO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.TabSettings;
import com.itextpdf.text.log.Level;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import controller.DAO;
import doanoop.model.Book;
import java.awt.FileDialog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

/**
 *
 * @author Tran Nhat Sinh
 */
public class WritePDF {

    DecimalFormat formatter = new DecimalFormat("###,###,###");
    //SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY");
    Document document = new Document();
    FileOutputStream file;
    FileDialog fd = new FileDialog(new JFrame(), "Xuất excel", FileDialog.SAVE);
    Font fontData;
    Font fontTitle;
    Font fontHeader;

    public WritePDF() throws IOException {
        try {
            fontData = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 11, Font.NORMAL);
            fontTitle = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 25, Font.NORMAL);
            fontHeader = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 11, Font.NORMAL);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            //Logger.getLogger(WritePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void chooseURL(String url) {
        try {
            document.close();
            document = new Document();
            file = new FileOutputStream(url);
            PdfWriter writer = PdfWriter.getInstance(document, file);
            document.open();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy đường dẫn " + url);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Không gọi được Document !");
        }
    }

    public void setTitle(String title) {
        try {
            Paragraph pdfTitle = new Paragraph(new Phrase(title, fontTitle));
            pdfTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(pdfTitle);
            document.add(Chunk.NEWLINE);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Không gọi được Document !");
            ex.printStackTrace();
        }
    }

    private String getFile() {
        fd.setFile("ThongTinPhieu");
        fd.setVisible(true);
        String url = fd.getDirectory() + fd.getFile() + ".pdf";
        if (url.equals("")) {
            return null;
        }
        return url;
    }

//    public void writePhieuNhap(String mapn) {
//        String url = "";
//        try {
//            fd.setTitle("In phiếu nhập");
//            fd.setLocationRelativeTo(null);
//            url = getFile();
//            if (url == null) {
//                return;
//            }
//            file = new FileOutputStream(url);
//            document = new Document();
//            PdfWriter writer = PdfWriter.getInstance(document, file);
//            document.open();
//
//            setTitle("THÔNG TIN PHIẾU NHẬP");
//
//            Phieu pn = PhieuDAO.getInstance().selectByMaphieu(mapn);
//
//            Chunk glue = new Chunk(new VerticalPositionMark());// Khoang trong giua hang
//           Paragraph para1 = new Paragraph();
//            para1.setFont(fontData);
//            para1.setTabSettings(new TabSettings(25f));
//            para1.add(Chunk.TABBING);
//            para1.add("Mã phiếu: " + pn.getMaPhieu());
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(" Ngày tạo: " + pn.getNgayTao());
//            Paragraph para2 = new Paragraph();
//            para2.setTabSettings(new TabSettings(35f));
//            para2.add(Chunk.TABBING);
//            para2.setPaddingTop(30);
//            para2.setFont(fontData);
//            para2.add("Người tạo phiếu: " + String.valueOf(DAO.getInstance().getTK(pn.getNguoiTao()).getUser()));
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add("Thời gian tạo: " + pn.getGioTao());
//            document.add(para1);
//            document.add(para2);
//            document.add(Chunk.NEWLINE);//add hang trong de tao khoang cach
//
//            //Tao table cho cac chi tiet cua hoa don
//            PdfPTable pdfTable = new PdfPTable(5);
//            pdfTable.setWidths(new float[]{10f, 30f, 15f, 10f, 15f});
//            PdfPCell cell;
//
//            //Set headers cho table chi tiet
//            pdfTable.addCell(new PdfPCell(new Phrase("Mã sách", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Tên sách", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Đơn giá", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Số lượng", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Tổng tiền", fontHeader)));
//
//            for (int i = 0; i < 5; i++) {
//                cell = new PdfPCell(new Phrase(""));
//                pdfTable.addCell(cell);
//            }
//
//            //Truyen thong tin tung chi tiet vao table
//            for (ChiTietPhieu ctpn : ChiTietPhieuDAO.getInstance().selectByMaphieu(mapn)) {
//                Book book = DAO.getInstance().getBook(ctpn.getMaSach());
//                pdfTable.addCell(new PdfPCell(new Phrase(book.getMasach(), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(book.getTensach(), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(formatter.format(book.getGia()) + "đ", fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(String.valueOf(ctpn.getSoLuong()), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(formatter.format(ctpn.getSoLuong() * book.getGia()) + "đ", fontData)));
//            }
//
//            document.add(pdfTable);
//            document.add(Chunk.NEWLINE);
//
//            Paragraph paraTotal = new Paragraph(new Phrase("Tổng số tiền: " + formatter.format(pn.getTotal()) + "đ", fontData));
//            paraTotal.setIndentationLeft(300);
//            document.add(paraTotal);
//            document.close();
//
//            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + url);
//
//        } catch (DocumentException | FileNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi khi ghi file " + url);
//        }
//
//    }
//
//    public void writePhieuXuat(String mapx) {
//        String url = "";
//        try {
//            fd.setTitle("In phiếu Xuất");
//            fd.setLocationRelativeTo(null);
//            url = getFile();
//            if (url == null) {
//                return;
//            }
//            file = new FileOutputStream(url);
//            document = new Document();
//            PdfWriter writer = PdfWriter.getInstance(document, file);
//            document.open();
//
//            setTitle("THÔNG TIN PHIẾU XUẤT");
//
//            Phieu p = PhieuDAO.getInstance().selectByMaphieu(mapx);
//            Chunk glue = new Chunk(new VerticalPositionMark());// Khoang trong giua hang
//            Paragraph para1 = new Paragraph();
//            para1.setFont(fontData);
//            para1.setTabSettings(new TabSettings(25f));
//            para1.add(Chunk.TABBING);
//            para1.add("Mã phiếu: " + p.getMaPhieu());
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(Chunk.TABBING);
//            para1.add(" Ngày tạo: " + p.getNgayTao());
//            Paragraph para2 = new Paragraph();
//            para2.setTabSettings(new TabSettings(35f));
//            para2.add(Chunk.TABBING);
//            para2.setPaddingTop(30);
//            para2.setFont(fontData);
//            para2.add("Người tạo phiếu: " + String.valueOf(DAO.getInstance().getTK(p.getNguoiTao()).getUser()));
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add(Chunk.TABBING);
//            para2.add("Thời gian tạo: " + p.getGioTao());
//            document.add(para1);
//            document.add(para2);
//            document.add(Chunk.NEWLINE);//add hang trong de tao khoang cach
//
//            //Tao table cho cac chi tiet cua hoa don
//            PdfPTable pdfTable = new PdfPTable(5);
//            pdfTable.setWidths(new float[]{10f, 30f, 15f, 10f, 15f});
//            PdfPCell cell;
//
//            //Set headers cho table chi tiet
//            pdfTable.addCell(new PdfPCell(new Phrase("Mã sách", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Tên sách", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Đơn giá", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Số Lượng", fontHeader)));
//            pdfTable.addCell(new PdfPCell(new Phrase("Tổng tiền", fontHeader)));
//
//            for (int i = 0; i < 5; i++) {
//                cell = new PdfPCell(new Phrase(""));
//                pdfTable.addCell(cell);
//            }
//
//            //Truyen thong tin tung chi tiet vao table
//            for (ChiTietPhieu ctpx : ChiTietPhieuDAO.getInstance().selectByMaphieu(mapx)) {
//                Book book = DAO.getInstance().getBook(ctpx.getMaSach());
//                pdfTable.addCell(new PdfPCell(new Phrase(ctpx.getMaSach(), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(book.getTensach(), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(formatter.format(book.getGia()) + "đ", fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(String.valueOf(ctpx.getSoLuong()), fontData)));
//                pdfTable.addCell(new PdfPCell(new Phrase(formatter.format(ctpx.getSoLuong() * book.getGia()) + "đ", fontData)));
//            }
//
//            document.add(pdfTable);
//            document.add(Chunk.NEWLINE);
//
//            Paragraph paraTotal = new Paragraph(new Phrase("Tổng số tiền: " + formatter.format(p.getTotal()) + "đ", fontData));
//            paraTotal.setIndentationLeft(300);
//            document.add(paraTotal);
//            document.close();
//
//            JOptionPane.showMessageDialog(null, "Ghi file thành công: " + url);
//
//        } catch (DocumentException | FileNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi khi ghi file " + url);
//        }
//
//    }
}
