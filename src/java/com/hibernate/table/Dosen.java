package com.hibernate.table;
// Generated Nov 27, 2013 9:08:41 AM by Hibernate Tools 3.2.1.GA



/**
 * Dosen generated by hbm2java
 */
public class Dosen  implements java.io.Serializable {


     private Integer no;
     private String nip;
     private String nama;
     private String status;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String status) {
       this.nip = nip;
       this.nama = nama;
       this.status = status;
    }
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


