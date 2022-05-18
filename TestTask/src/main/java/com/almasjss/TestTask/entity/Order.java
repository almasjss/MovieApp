package com.almasjss.TestTask.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="orders")
@Getter
@Setter
@NoArgsConstructor
public class Order extends Info{
    //содерижмое объекта в произвольной форме, например [товар, кол-во, адрес доставки, номер телефона:
    private String orderName;
    private Integer orderN;
    private String addressTo;
    private String phoneNumber;

@OneToOne(targetEntity =User.class,cascade = CascadeType.ALL)
private User user;

    public Order(String orderName, Integer orderN, String addressTo, String phoneNumber) {
        this.orderName = orderName;
        this.orderN = orderN;
        this.addressTo = addressTo;
        this.phoneNumber = phoneNumber;
    }

}