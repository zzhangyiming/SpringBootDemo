package com.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Date;
@AllArgsConstructor//有参构造函数
@NoArgsConstructor//无参构造函数
@Data//get() set()
@Builder
public class Article {

    private long id;

    private String author;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<Reader> reader;
}
