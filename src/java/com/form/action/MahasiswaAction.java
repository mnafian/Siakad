/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.action;

import com.form.bean.MahasiswaForm;
import com.proses.crud.MhsCrud;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author wx-eth0
 */
public class MahasiswaAction extends org.apache.struts.action.Action {

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
        MahasiswaForm fm = (MahasiswaForm) form;
        
        MhsCrud mc = new MhsCrud();
        
        if(fm.getTombol().equals("simpan")){
            mc.insert(fm.getNim(), fm.getNama());
        }else if(fm.getTombol().equals("update")){
            mc.update(fm.getId(), fm.getNim(), fm.getNama());
        }else if(fm.getTombol().equals("delete")){
            mc.delete(fm.getId());
        }
        return mapping.findForward(SUCCESS);
    }
}
