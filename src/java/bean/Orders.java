/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import javax.persistence.*;
/**
 *
 * @author Justine Clemente
 */
@Entity
@Table(name="Orders")
public class Orders {
    @Id @GeneratedValue
    @Column(name="ID")
    private int ID;
    
    @Column(name="FirstName")
    private String firstname;
    
    @Column(name="LastName")
    private String lastname;
    
    @Column(name="Size")
    private String size;
    
    @Column(name="ImagePic")
    private String imagepic;
    
    @Column(name="ProductName")
    private String productname;
    
    @Column(name="Price")
    private int price;
    
    @Column(name="Quantity")
    private int quantity;
    
    @Column(name="TotalPrice")
    private int totalprice;

    public Orders() {
    }

    public Orders(String firstname, String lastname, String size, String imagepic, String productname, int price, int quantity, int totalprice) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.size = size;
        this.imagepic = imagepic;
        this.productname = productname;
        this.price = price;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImagepic() {
        return imagepic;
    }

    public void setImagepic(String imagepic) {
        this.imagepic = imagepic;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    
}
