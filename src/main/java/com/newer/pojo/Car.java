package com.newer.pojo;
import java.io.Serializable;
import java.sql.Date;

public class Car  implements Serializable{
   private Integer id;
   private String  name;
   private Double price;
   private Date create_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Car() {
    }

    public Car(Integer id, String name, Double price, Date create_date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", create_date=" + create_date +
                '}';
    }
}

