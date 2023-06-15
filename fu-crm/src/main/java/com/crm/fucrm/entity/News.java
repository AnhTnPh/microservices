package com.crm.fucrm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity(name = "news")
@Table
public class News extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "img")
    private String img;

    @Column(name = "content")
    private String content;

    @Column(name = "url")
    private String url;
}
