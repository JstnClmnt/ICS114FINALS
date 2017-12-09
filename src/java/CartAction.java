
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import helper.*;
import bean.*;
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
public class CartAction implements SessionAware{
    private String productchoice;
    private Map<String, Object> sessionMap;
    private int quantity;
    private String size;
    public String execute(){
        ProductCRUD b=new ProductCRUD();
        Products prodorder=b.readProduct(productchoice);
        Orders order=new Orders(size,prodorder.getImagepic(),prodorder.getProductname(),prodorder.getPrice(),quantity,quantity*prodorder.getPrice());
        ArrayList<Orders> orders=new ArrayList<Orders>();
        orders=(ArrayList<Orders>)sessionMap.get("orders");
        Iterator it;
        int total=0;
        if(orders==null){
            orders=new ArrayList<Orders>();
            order.setQuantity(quantity);
            orders.add(order);
            sessionMap.put("orders", orders);
             System.out.println("HELLO!");
            return "success";
        }
        else{
            System.out.println("Henlo");
            it=orders.iterator();
        }
               while(it.hasNext()){
                   Orders p=(Orders)it.next();
                   if(p.getProductname().equals(order.getProductname())){
                        System.out.println("panget");
                        it.remove();
                        orders.remove(p);
                        order.setQuantity(quantity+order.getQuantity());
                        order.setTotalprice(order.getQuantity()*order.getPrice());
                        orders.add(order);
                        sessionMap.put("orders", orders);
                        sessionMap.put("total",this.computetotal(orders));
                       return "success";
                   }
               }
            order.setQuantity(quantity);
            orders.add(order);
            sessionMap.put("total",this.computetotal(orders));
            sessionMap.put("orders", orders);
            return "success";
            
    }
    
    public int computetotal(ArrayList<Orders> orders){
        int totalp=0;
        Iterator it=orders.iterator();
        while(it.hasNext()){
            Orders p=(Orders)it.next();
            totalp+=p.getTotalprice();
        }
        return totalp;
    }
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }

    public String getProductchoice() {
        return productchoice;
    }

    public void setProductchoice(String productchoice) {
        this.productchoice = productchoice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
}
