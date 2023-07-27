package com.crm.fucrm.service;

import com.crm.fucrm.dto.NewsDTO;
import com.crm.fucrm.entity.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    NewsDTO create(NewsDTO request);
    NewsDTO update(NewsDTO request);
    Optional<News> findById(Long id);
    void delete(Long id);
    List<NewsDTO> findAll();

    Integer convertUSDToVND(int usd);
}
