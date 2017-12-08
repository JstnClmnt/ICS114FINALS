
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import bean.*;
import helper.*;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine Clemente
 */
public class DeleteAction implements SessionAware{
    private String delete;
    private Map<String, Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    
    public String execute(){
        ArrayList<Orders> orders=new ArrayList<Orders>();
        orders=(ArrayList)sessionMap.get("orders");
        Iterator it=orders.iterator();
        while(it.hasNext()){
            Orders a=(Orders)it.next();
            if(a.getProductname().equals(delete)){
                orders.remove(a);
                break;
            }
        }
        sessionMap.put("orders", orders);
        return "success";
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }
    
    
    
}
