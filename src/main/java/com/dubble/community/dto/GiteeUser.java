package com.dubble.community.dto;

import lombok.Data;

/**
 * Created by codedrinker on 2023/4/24.
 */
@Data
public class GiteeUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
