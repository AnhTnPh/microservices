package com.crm.fucrm.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class CrawlNewsLOL {
    private RestTemplate restTemplate = new RestTemplate();

    private String url = "https://www.leagueoflegends.com/page-data/vi-vn/news/game-updates/page-data.json";
//    @Scheduled(fixedDelay = 6000)
    public void newsLol() {
        String news = restTemplate.getForObject(url, String.class);
    }
}
