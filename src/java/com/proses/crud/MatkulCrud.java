/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proses.crud;

import com.hibernate.table.Matakuliah;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sem00t
 */
public class MatkulCrud {
    Session session = com.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
    public void insert(String x, String y, String z){
    
    
    try {
            Transaction tr = session.beginTransaction();
            Matakuliah mtk = new Matakuliah();

            mtk.setIdmatkul(x);
            mtk.setMatkul(y);
            mtk.setSks(z);

            session.save(mtk);
            tr.commit();

        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void update(int v, String x, String y, String z){
        try {
            Transaction tr = session.beginTransaction();
            Matakuliah mtk = (Matakuliah) session.load(Matakuliah.class, v);        
            mtk.setIdmatkul(x);
            mtk.setMatkul(y);
            mtk.setSks(z);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void delete(int x){
        try {
            Transaction tr = session.beginTransaction();
            Matakuliah mtk = (Matakuliah) session.load(Matakuliah.class, x);        
            session.delete(mtk);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
}