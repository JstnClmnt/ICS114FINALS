/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author Justine Clemente
 */

@Entity
@Table(name="Users")
public class Users {
    @Id @GeneratedValue
    @Column(name="ID")
    private int id;
    
    @Column(name="FirstName")
    private String firstname;
    
    @Column(name="LastName")
    private String lastname;
    
    @Column(name="Address")
    private String address;
    
    @Column(name="MobileNumber")
    private int mobilenumber;
    
    @Column(name="EmailAdd")
    private String emailadd;
    
    @Column(name="Comments")
    private String comments;
    
    @Column(name="Price")
    private int price;
    
    @Column(name="ReferenceNumber")
    private int referencenumber;
    
    @Transient
    private ArrayList<Orders> orders;

    public Users() {
    }

    public Users(String firstname, String lastname, String address, int mobilenumber, String emailadd, String comments, int price, int referencenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.emailadd = emailadd;
        this.comments = comments;
        this.price = price;
        this.referencenumber = referencenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReferencenumber() {
        return referencenumber;
    }

    public void setReferencenumber(int referencenumber) {
        this.referencenumber = referencenumber;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
    
    
}
