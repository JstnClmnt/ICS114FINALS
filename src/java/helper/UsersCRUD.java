/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import bean.*;
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.Random;
/**
 *
 * @author Justine Clemente
 */
public class UsersCRUD {
    private static SessionFactory factory;
    public void init(){
        try{
             factory = new AnnotationConfiguration().
                       configure().
                       addPackage("bean"). //add package if used.
                       addAnnotatedClass(Users.class).
                       buildSessionFactory();
        } 
        catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    }
    
        
    
    public void addUser(Users person){
        this.init();
        /**try {
            Class.forName(JDBC_Driver);
            Connection connect = DriverManager.getConnection(dbURL, "sa", "8888");
            String create = "INSERT INTO UsersPrelimsLab VALUES(?,?,?,?,?,?)";
            PreparedStatement createStm = connect.prepareStatement(create);
            createStm.setString(1, person.getFirstName());
            createStm.setString(2, person.getLastName());
            createStm.setString(3, person.getUserName());
            createStm.setString(4, person.getPassword());
            createStm.setString(5, person.getUserType());
            createStm.setInt(6, 0);
            createStm.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session = factory.openSession();
        Transaction tx = null;
        Random random=new Random(); 
        person.setReferencenumber(random.nextInt(1000000)+1);
        try {
            tx = session.beginTransaction();
            session.save(person); 
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
    
    public Users readUser(int ReferenceNumber){
        this.init();
        Users person= new Users();
        /**try{
            Class.forName(JDBC_Driver);
            test=DriverManager.getConnection(dbURL,"sa","8888");
            pstmt=test.prepareStatement("SELECT * FROM UsersPrelimsLab WHERE Username=?");
            pstmt.setString(1, username);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                String FirstName=rs.getString("FirstName");
                String LastName=rs.getString("LastName");
                String userName=rs.getString("UserName");
                String password=rs.getString("Password");
                String usertype=rs.getString("UserType");
                int price=rs.getInt("Price");
                person =new Person(FirstName,LastName,userName,password,usertype,price);
            }
            return person;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session=factory.openSession();
        Transaction tx=null;
        try{
            tx=session.beginTransaction();
            String hql="FROM Users WHERE ReferenceNumber=:u";
            Query query=(Query)session.createQuery(hql);
            query.setParameter("u",ReferenceNumber);
            List users=query.list();
            Iterator iterator=users.iterator();
            while(iterator.hasNext()){
                person=(Users)iterator.next();
            }
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }
        finally {
           session.close(); 
           return person;
        }
        
        
    }
    
    public void updateUser(int price,Users user){
        init();
        /**try {
            Class.forName(JDBC_Driver);
            Connection connect = DriverManager.getConnection(dbURL, "sa", "8888");
            String update = "UPDATE UsersPrelimsLab SET PRICE=? WHERE Username=?";
            PreparedStatement createStm = connect.prepareStatement(update);
            createStm.setInt(1, price);
            createStm.setString(2, person.getUserName());
            createStm.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        Session session=factory.openSession();
        Transaction tx=null;
            
        try{
            tx=session.beginTransaction();
            String hql="UPDATE Users SET PRICE=:p WHERE FirstName=:u AND LastName=:q";
            Query query=(Query)session.createQuery(hql);
            query.setParameter("p", price);
            query.setParameter("u", user.getFirstname());
            query.setParameter("q", user.getLastname());
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
    
}
