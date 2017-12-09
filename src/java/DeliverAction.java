
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import helper.*;
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
public class DeliverAction implements SessionAware{
        private Map<String, Object> sessionMap;
        private int deliver;
    public String execute(){
        Users user=new UsersCRUD().readUser(deliver);
        new OrdersCRUD().deliverProduct(user);
        sessionMap.put("all",new UsersCRUD().readAll());
        return "success";
    }

    public int getDeliver() {
        return deliver;
    }

    public void setDeliver(int deliver) {
        this.deliver = deliver;
    }
    
    
        @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
}
