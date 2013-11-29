/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proses.crud;

import com.hibernate.table.Dosen;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sem00t
 */
public class DsnCrud {
    Session session = com.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
    public void insert(String x, String y, String z){
    
    try {
            Transaction tr = session.beginTransaction();
            Dosen dsn = new Dosen();

            dsn.setNip(x);
            dsn.setNama(y);
            dsn.setStatus(z);

            session.save(dsn);
            tr.commit();

        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void update(int v, String x, String y, String z){
        try {
            Transaction tr = session.beginTransaction();
            Dosen dsn = (Dosen) session.load(Dosen.class, v);        
            dsn.setNip(x);
            dsn.setNama(y);
            dsn.setStatus(z);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void delete(int x){
        try {
            Transaction tr = session.beginTransaction();
            Dosen dsn = (Dosen) session.load(Dosen.class, x);        
            session.delete(dsn);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
}
