package com.crm.fucrm.mapper;

import com.crm.fucrm.dto.NewsDTO;
import com.crm.fucrm.entity.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {News.class})
public interface NewsMapper extends EntityMapper<News, NewsDTO>{
}
