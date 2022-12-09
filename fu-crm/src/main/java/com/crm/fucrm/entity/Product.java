package com.crm.fucrm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    private Integer id;

    private String name;

    private int price;
}
