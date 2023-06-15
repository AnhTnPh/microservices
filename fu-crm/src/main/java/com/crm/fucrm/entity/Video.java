package com.crm.fucrm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "video")
public class Video extends BaseEntity{
    @Column(name = "url")
    private String url;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
}
