
import java.util.Map;
import helper.*;
import bean.*;
import java.util.ArrayList;
import org.apache.struts2.interceptor.SessionAware;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine Clemente
 */
public class OrdersAction implements SessionAware{
    private Map<String, Object> sessionMap;
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    
    public String execute(){
        ArrayList<Users> users=new ArrayList<Users>();
        UsersCRUD crud=new UsersCRUD();
        users=crud.readAll();
        sessionMap.put("all", users);
        return "success";
    }
}
