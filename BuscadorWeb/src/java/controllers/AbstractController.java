/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javax.servlet.http.HttpServletRequest;
import controllers.Controller;

/**
 *
 * @author 31649033
 */
public abstract class AbstractController implements Controller{
    private HttpServletRequest request;
    protected String returnPage;

    @Override
    public void init(HttpServletRequest request) {
        this.setRequest (request);
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getReturnPage() {
        return returnPage;
    }

    public void setReturnPage(String page) {
        returnPage = page;
    }
    
    
}
