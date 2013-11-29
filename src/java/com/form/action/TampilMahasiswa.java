/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.action;

import com.hibernate.table.Mahasiswa;
import com.tampungdata.TampungDataMhs;
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
public class TampilMahasiswa extends org.apache.struts.action.Action {

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
        ArrayList<TampungDataMhs> list1 = new ArrayList<TampungDataMhs>();
        try {
            session.beginTransaction();
            Query q = session.createQuery("from Mahasiswa");
            List list = q.list();
            for (int i = 0; i < list.size(); i++) {
                Mahasiswa mh = (Mahasiswa) list.get(i);

                list1.add(new TampungDataMhs(mh.getNo(), mh.getNim(), mh.getNama()));
            }

        } catch (HibernateException ex) {
            request.setAttribute("pesanError", ex);
        }
        request.setAttribute("list1", list1);
        return mapping.findForward(SUCCESS);
    }
}
