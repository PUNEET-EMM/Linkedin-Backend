package com.puneet.linkedin.posts_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDto {
    private Long id;
    private String content;
//    private String imageURL;
    private Long userId;
    private LocalDateTime createdAt;
}