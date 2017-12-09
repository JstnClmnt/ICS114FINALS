
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import helper.*;
import java.util.ArrayList;
import bean.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine Clemente
 */
public class SearchAction implements SessionAware{
    public String search;
    private Map<String, Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    
    public String execute(){
        ArrayList<Products> orders=new ArrayList<Products>();
        orders=new ProductCRUD().searchProducts(search);
        sessionMap.put("products", orders);
        return "success";
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    
    
}
