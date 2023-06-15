package com.crm.fucrm.dto;

import lombok.Data;

import java.util.Date;

@Data
public class NewsDTO {
    private Long id;
    private String title;
    private String img;
    private String content;
    private String url;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
}
