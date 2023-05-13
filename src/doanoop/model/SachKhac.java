/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop.model;
import java.io.Serializable;

/**
 *
 * @author donam
 */
public class SachKhac extends Book implements Serializable{
    String loai;
    
    public SachKhac(String loai) {
        super();
        this.loai = loai;
    }
    
    public SachKhac() {
        
    }
    public String getLoai() {
        return loai;
    }
    
    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public static void main (String[] args) {
        
    }
}
