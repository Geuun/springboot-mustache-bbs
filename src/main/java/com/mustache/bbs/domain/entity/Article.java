package com.mustache.bbs.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "article")
@NoArgsConstructor // Constructor 가 두개이기 때문에 추가
@AllArgsConstructor
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동생성 == Mysql AutoIncrease option
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
