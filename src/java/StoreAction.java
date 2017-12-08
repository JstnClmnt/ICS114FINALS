
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import helper.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine Clemente
 */
public class StoreAction implements SessionAware{
        private Map<String, Object> sessionMap;

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    
    public String execute(){
        sessionMap.put("products", new ProductCRUD().readProducts());
        return "success";
    }
}
