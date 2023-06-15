package com.crm.fucrm.service.impl;

import com.crm.fucrm.dto.NewsDTO;
import com.crm.fucrm.entity.News;
import com.crm.fucrm.mapper.NewsMapper;
import com.crm.fucrm.repository.NewsRepository;
import com.crm.fucrm.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public NewsDTO create(NewsDTO request) {
        News news = newsMapper.toEntity(request);
        news = newsRepository.save(news);
        return newsMapper.toDto(news);
    }

    @Override
    public NewsDTO update(NewsDTO request) {
        NewsDTO newsDTO = new NewsDTO();
        try {
            this.findById(request.getId());
            return newsMapper.toDto(newsRepository.save(newsMapper.toEntity(request)));
        } catch (Exception ex) {
            log.error("update news: {}", ex);
        }
        return newsDTO;
    }

    @Override
    public Optional<News> findById(Long id) {
        Optional<News> newsOptional = null;
        try {
            newsOptional = newsRepository.findById(id);
            if (!newsOptional.isPresent()) {
                throw new ClassNotFoundException("news is not found");
            }
        } catch (Exception ex) {
            log.error("News find by id: {}", ex);
        }
        return newsOptional;
    }

    @Override
    public void delete(Long id) {
        News news = this.findById(id).orElse(null);
        newsRepository.delete(news);
    }

    @Override
    public List<NewsDTO> findAll() {
        return newsMapper.toDtoS(newsRepository.findAll());
    }
}
