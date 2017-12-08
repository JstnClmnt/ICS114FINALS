
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import helper.*;
import bean.*;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine Clemente
 */
public class ReferenceAction implements SessionAware{
    private int referencenumber;
    private Map<String, Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    public String execute(){
        //Users user=new UsersCRUD().readUser(referencenumber);
        ArrayList<Orders> orders=new ArrayList<Orders>();
        orders=new OrdersCRUD().readOrders(referencenumber);
        sessionMap.put("orders", orders);
        return "success";
    
    }

    public int getReferencenumber() {
        return referencenumber;
    }

    public void setReferencenumber(int referencenumber) {
        this.referencenumber = referencenumber;
    }
    
    
}
