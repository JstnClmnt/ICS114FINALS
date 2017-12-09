
import java.util.ArrayList;
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
public class CheckoutAction implements SessionAware{
    private Map<String, Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }
    
    private String firstname;
    private String lastname;
    private String contactnum;
    private String address;
    private String emailaddress;
    private String comments;
    
    public String execute(){
        ArrayList<Orders> orders=(ArrayList<Orders>)sessionMap.get("orders");
        Users user=new Users(firstname,lastname,address,contactnum,emailaddress,comments);
        user.setPrice(new OrdersCRUD().checkout(user, orders));
        new UsersCRUD().addUser(user);
        sessionMap.put("user",user);
        return "success";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
}
