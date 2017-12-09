/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Justine Clemente
 */
public class OrdersCRUD {
    private static SessionFactory factory;
    public void init(){
        try{
             factory = new AnnotationConfiguration().
                       configure().
                       addPackage("bean"). //add package if used.
                       addAnnotatedClass(Orders.class).
                       buildSessionFactory();
        } 
        catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    }
   public void addOrder(Users user,ArrayList<Orders> order){
        init();
        /**try {
            Class.forName(JDBC_Driver);
            Connection connect = DriverManager.getConnection(dbURL, "sa", "8888");
            String create = "INSERT INTO Orders VALUES(?,?,?,?,?,?);";
            PreparedStatement createStm = connect.prepareStatement(create);
            createStm.setString(1, user.getUserName());
            createStm.setString(2, order.getAlbumpic());
            createStm.setString(3, order.getProductname());
            createStm.setInt(4, order.getPrice());
            createStm.setInt(5, order.getQuantity());
            createStm.setInt(6, order.getTotalprice());
            createStm.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session = factory.openSession();
        Transaction tx = null;   
        try {
            Iterator it=order.iterator();
            while(it.hasNext()){
                Orders orders=(Orders)it.next();
                orders.setFirstname(user.getFirstname());
                orders.setLastname(user.getLastname());
                tx = session.beginTransaction();
                session.save(orders); 
                tx.commit();
            }
        } catch (Exception e) {
            if (tx!=null){ 
               tx.rollback();
               e.printStackTrace(); 
            }
        } finally {
            session.close(); 
      }
    
    }
   
   public ArrayList<Orders> readOrders(int referenceNumber){
        this.init();
        ArrayList<Orders> orders=new ArrayList<Orders>();
        int sumprice=0;
        Session session=factory.openSession();
        Transaction tx=null;
        Users user=new UsersCRUD().readUser(referenceNumber);
        try{
            tx=session.beginTransaction();
            //Query query=(Query)session.createQuery("FROM Person");
            String hql="FROM Orders WHERE FirstName=:u AND LastName=:s";
            Query query=(Query) session.createQuery(hql);
            query.setParameter("u", user.getFirstname());
            query.setParameter("s",user.getLastname());
            List order=query.list();
            Iterator e=order.iterator();
            while(e.hasNext()){
                Orders a=(Orders)e.next();
                //int price=a.getPrice();
                //int quantity=a.getQuantity();
                //sumprice+=quantity*price;
                orders.add(a);
            }
            //user.setPrice(sumprice);
            //new UsersCRUD().updateUser(sumprice, user);
            //INSERT UPDATE PERSON DATABASE HERE WITH PRICE;
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }
        finally {
           session.close(); 
           return orders;
        }
    }
      public void deliverProduct(Users person){
       init();
        /**try {
            Class.forName(JDBC_Driver);
            Connection connect = DriverManager.getConnection(dbURL, "sa", "8888");
            String delete = "DELETE FROM Orders WHERE Username=?";
            PreparedStatement createStm = connect.prepareStatement(delete);
            createStm.setString(1, person.getUserName());
            createStm.executeUpdate();
            new Update().updateUser(0, person);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session=factory.openSession();
        Transaction tx=null;
            
        try{
            tx=session.beginTransaction();
            String hql="DELETE FROM Orders WHERE FirstName=:f AND LastName=:l";
            Query query=(Query)session.createQuery(hql);
            query.setParameter("f", person.getFirstname());
            query.setParameter("l", person.getLastname());
            query.executeUpdate();
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }
        finally {
           session.close();
        }
    }
   public int checkout(Users user,ArrayList<Orders> orders){
       this.init();
        Session session=factory.openSession();
        Transaction tx=null;
        int totalprice=0;
        try {
            tx = session.beginTransaction();
            Iterator it=orders.iterator();
            while(it.hasNext()){
                Orders order=(Orders)it.next();
                order.setFirstname(user.getFirstname());
                order.setLastname(user.getLastname());
                order.setTotalprice(order.getQuantity()*order.getPrice());
                totalprice+=order.getTotalprice();
                session.save(order);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx!=null){ 
               tx.rollback();
               e.printStackTrace(); 
            }
        } finally {
            session.close(); 
      }
        return totalprice;
   }
  
}
