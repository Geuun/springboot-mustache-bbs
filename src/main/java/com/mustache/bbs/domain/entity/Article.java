package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor // Constructor 가 두개이기 때문에 추가
@Getter
public class Article {
    @Id
    @GeneratedValue //자동생성 == Mysql AutoIncrease option
    private Long id;

    @Column
    private String title;
    @Column
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
