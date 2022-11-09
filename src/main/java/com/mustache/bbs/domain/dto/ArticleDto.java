package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.Article;
import lombok.*;

@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String contents;

    public ArticleDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public Article toEntity() {
        return new Article(title, contents);
    }

    public Article toEntity(Long id) {
        return new Article(id, title, contents);
    }
}
