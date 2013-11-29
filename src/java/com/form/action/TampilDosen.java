/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.action;

import com.hibernate.table.Dosen;
import com.tampungdata.TampungDataDsn;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author wx-eth0
 */
public class TampilDosen extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "sukses";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Session session = com.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
        
        ArrayList<TampungDataDsn> list1 = new ArrayList<TampungDataDsn>();
        try {
            session.beginTransaction();
            Query q = session.createQuery("from Dosen");
            List list = q.list();
            for (int i = 0; i < list.size(); i++) {
                Dosen ds = (Dosen) list.get(i);
                list1.add(new TampungDataDsn(ds.getNo(), ds.getNip(), ds.getNama(), ds.getStatus()));
            }

        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        request.setAttribute("list1", list1);
        return mapping.findForward(SUCCESS);
    }
}
