/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tampungdata;

/**
 *
 * @author sem00t
 */
public class TampungDataDsn {
    private int id;
    private String nip;
    private String nama;
    private String status;

    public TampungDataDsn(int id, String nip, String nama, String status) {
        this.id = id;
        this.nip = nip;
        this.nama = nama;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
