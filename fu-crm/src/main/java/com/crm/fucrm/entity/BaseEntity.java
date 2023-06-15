package com.crm.fucrm.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2147670703341649538L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @CreatedDate
    @Column(name = "created_date")
    private Date createdDate;
    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;
    @LastModifiedDate
    @Column(name = "modified_date")
    private Date modifiedDate;
    @LastModifiedBy
    @Column(name = "modified_by")
    private String modifiedBy;
}
