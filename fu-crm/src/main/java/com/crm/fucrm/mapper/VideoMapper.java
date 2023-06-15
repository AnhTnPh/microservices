package com.crm.fucrm.mapper;

import com.crm.fucrm.dto.VideoDTO;
import com.crm.fucrm.entity.Video;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {Video.class})
public interface VideoMapper extends EntityMapper<Video, VideoDTO> {
}
