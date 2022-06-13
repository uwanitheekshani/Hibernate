package lk.ijse.hibernate2.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {

//    @Id
//    private String id;

    @ManyToOne@Id
    private Orders order;

    @ManyToOne@Id
    private Item item;


    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(Orders order, Item item, int qty) {
        //this.id = id;
        this.order = order;
        this.item = item;
        this.qty = qty;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
