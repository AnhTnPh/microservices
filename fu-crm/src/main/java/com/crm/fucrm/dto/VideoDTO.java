package com.crm.fucrm.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VideoDTO {
    private Long id;
    private String title;
    private String url;
    private String description;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
}
