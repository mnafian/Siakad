/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.action;

import com.form.bean.LoginForm;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class LoginAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "berhasil";
    private static final String GAGAL = "gagal";

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
        LoginForm lf = (LoginForm) form;
        Session sesi = com.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
        Query kueri;

        try {
            sesi.beginTransaction();
            kueri = sesi.createQuery("from Users where idusers='" + lf.getId() + "' and password='" + lf.getPass() + "'");
            List list = kueri.list();
            
            if (list.size() == 1) {
                HttpSession sesion = request.getSession();
                sesion.setAttribute("user", lf.getId());
                return mapping.findForward(SUCCESS);
            } else {
                return mapping.findForward(GAGAL);
            }
        } catch (HibernateException ex) {
            request.setAttribute("pesanError", ex);
        }
        return mapping.findForward(SUCCESS);
    }
}
