/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author 31649033
 */
public interface Controller {
    public void execute();
    public void init(HttpServletRequest request);
    public String getReturnPage();
}
