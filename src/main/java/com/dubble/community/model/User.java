package com.dubble.community.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author dubble
 * @Date 2023/3/1 14:34
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;

}
