package com.crm.fucrm.service;

import com.crm.fucrm.dto.VideoDTO;
import com.crm.fucrm.entity.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    VideoDTO create(VideoDTO request);
    VideoDTO update(VideoDTO request);
    Optional<Video> findById(Long id);
    void delete(Long id);
    List<VideoDTO> findAll();
}
