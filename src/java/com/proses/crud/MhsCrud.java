/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proses.crud;

import com.hibernate.table.Mahasiswa;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sem00t
 */
public class MhsCrud {
    Session session = com.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
    public void insert(String x, String y){
    
    
    try {
            Transaction tr = session.beginTransaction();
            Mahasiswa mhs = new Mahasiswa();

            mhs.setNim(x);
            mhs.setNama(y);

            session.save(mhs);
            tr.commit();

        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void update(int x, String y, String z){
        try {
            Transaction tr = session.beginTransaction();
            Mahasiswa mhs = (Mahasiswa) session.load(Mahasiswa.class, x);        
            mhs.setNim(y);
            mhs.setNama(z);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void delete(int x){
        try {
            Transaction tr = session.beginTransaction();
            Mahasiswa mhs = (Mahasiswa) session.load(Mahasiswa.class, x);        
            session.delete(mhs);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
}
