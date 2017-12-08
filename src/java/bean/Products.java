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
@Table(name="Products")
public class Products {
    @Id @GeneratedValue
    @Column(name="ID")
    private int id;
    
    @Column(name="ProductName")
    private String productname;
    
    @Column(name="Price")
    private int price;
    
    @Column(name="ImagePic")
    private String imagepic;
    
    @Column(name="Category")
    private String category;

    public Products(String productname, int price, String imagepic, String category) {
        this.productname = productname;
        this.price = price;
        this.imagepic = imagepic;
        this.category = category;
    }

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getImagepic() {
        return imagepic;
    }

    public void setImagepic(String imagepic) {
        this.imagepic = imagepic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
