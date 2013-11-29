/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tampungdata;

/**
 *
 * @author sem00t
 */
public class TampungDataMhs {
    private int id;
    private String nim;
    private String nama;

    public TampungDataMhs(int id, String nim, String nama) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
