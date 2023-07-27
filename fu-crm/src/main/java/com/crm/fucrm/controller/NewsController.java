package com.crm.fucrm.controller;

import com.crm.fucrm.config.AppConstant;
import com.crm.fucrm.dto.NewsDTO;
import com.crm.fucrm.entity.News;
import com.crm.fucrm.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(AppConstant.NEWS_API)
@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping(AppConstant.News.CREATE)
    public ResponseEntity<NewsDTO> create(@RequestBody NewsDTO request) {
        return ResponseEntity.ok(newsService.create(request));
    }

    @PostMapping(AppConstant.News.UPDATE)
    public ResponseEntity<NewsDTO> update(@RequestBody NewsDTO request) {
        return ResponseEntity.ok(newsService.update(request));
    }

    @PostMapping(AppConstant.News.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        newsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(AppConstant.News.FIND_BY_ID)
    public ResponseEntity<News> findById(@PathVariable Long id) {
        return ResponseEntity.ok(newsService.findById(id).get());
    }

    @GetMapping(AppConstant.News.FIND_ALL)
    public ResponseEntity<List<NewsDTO>> findAll() {
        return ResponseEntity.ok(newsService.findAll());
    }

    @PostMapping(AppConstant.News.CONVERT)
    public ResponseEntity<Integer> convertUSDToVND(@RequestBody int usd) {
        return ResponseEntity.ok(newsService.convertUSDToVND(usd));
    }
}
