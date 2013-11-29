/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.action;

import com.form.bean.DosenForm;
import com.proses.crud.DsnCrud;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author wx-eth0
 */
public class DosenAction extends org.apache.struts.action.Action {

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
        DosenForm df = (DosenForm) form;
        DsnCrud dc = new DsnCrud();
        
        if(df.getTombol().equals("simpan")){
            dc.insert(df.getNip(), df.getNama(), df.getStatus());
        }else if(df.getTombol().equals("update")){
            dc.update(df.getId(), df.getNip(), df.getNama(), df.getStatus());
        }else if(df.getTombol().equals("delete")){
            dc.delete(df.getId());
        }
        return mapping.findForward(SUCCESS);
    }
}
