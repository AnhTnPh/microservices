package com.crm.fucrm.service.impl;

import com.crm.fucrm.dto.VideoDTO;
import com.crm.fucrm.entity.Video;
import com.crm.fucrm.mapper.VideoMapper;
import com.crm.fucrm.repository.VideoRepository;
import com.crm.fucrm.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public VideoDTO create(VideoDTO request) {
        return null;
    }

    @Override
    public VideoDTO update(VideoDTO request) {
        return null;
    }

    @Override
    public Optional<Video> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<VideoDTO> findAll() {
        return null;
    }
}
