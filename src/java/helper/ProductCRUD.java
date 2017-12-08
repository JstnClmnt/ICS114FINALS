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
public class ProductCRUD {
        private static SessionFactory factory;

      public void init(){
        try{
             factory = new AnnotationConfiguration().
                       configure().
                       addPackage("bean"). //add package if used.
                       addAnnotatedClass(Products.class).
                       buildSessionFactory();
        } 
        catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    
    }
        public ArrayList<Products> readProducts(){
        this.init();
        ArrayList<Products> products=new ArrayList<Products>();
        /**try{
            Class.forName(JDBC_Driver);
            test=DriverManager.getConnection(dbURL,"sa","8888");
            pstmt=test.prepareStatement("SELECT * FROM ProductsPrelimsLab");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                String ProductName=rs.getString("ProductName");
                int Price=rs.getInt("Price");
                String Band=rs.getString("Band");
                String ImagePic=rs.getString("ImagePic");
                String Category=rs.getString("Category");
                if(category.equals(Category)){
                    Product read=new Product(ProductName,Category,Band,ImagePic,Price);
                    products.add(read);
                }
            }
            return products;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        
        Session session=factory.openSession();
        Transaction tx=null;
            
        try{
            tx=session.beginTransaction();
            //Query query=(Query)session.createQuery("FROM Person");
            String hql="FROM Products";
            Query query=session.createQuery(hql);
            List order=query.list();
            products=(ArrayList<Products>)order;
            if(products.isEmpty())
                throw new Exception();
            //INSERT UPDATE PERSON DATABASE HERE WITH PRICE;
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }
        finally {
           session.close(); 
           return products;
        }
    }
        
        public Products readProduct(String productName){
        this.init();
        Products product=new Products();
        /**try{
            Class.forName(JDBC_Driver);
            test=DriverManager.getConnection(dbURL,"sa","8888");
            pstmt=test.prepareStatement("SELECT * FROM ProductsPrelimsLab WHERE ProductName=?");
            pstmt.setString(1, productName);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                String ProductName=rs.getString("ProductName");
                int Price=rs.getInt("Price");
                String Band=rs.getString("Band");
                String ImagePic=rs.getString("ImagePic");
                String Category=rs.getString("Category");
                product.setProductName(ProductName);
                product.setPrice(Price);
                product.setCategory(Category);
                product.setBand(Band);
                product.setImagePic(ImagePic);
            }
            test.close();
            return product;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session=factory.openSession();
        Transaction tx=null;
            
        try{
            tx=session.beginTransaction();
            String hql="FROM Products WHERE ProductName=:name";
            Query query=(Query)session.createQuery(hql);
            query.setParameter("name", productName);
            List users=query.list();
            Iterator iterator=users.iterator();
            while(iterator.hasNext()){
                product=(Products)iterator.next();
            }
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }
        finally {
           session.close();
           return product;
        }
        
    }
        
    public void addProduct(Products product){
        this.init();
        Session session = factory.openSession();
        Transaction tx = null;   
        try {
                tx = session.beginTransaction();
                session.save(product); 
                tx.commit();
            
        } catch (Exception e) {
            if (tx!=null){ 
               tx.rollback();
               e.printStackTrace(); 
            }
        } finally {
            session.close(); 
      }
    
    }
}