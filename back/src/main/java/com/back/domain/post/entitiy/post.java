package com.back.domain.post.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity //아래 구조대로 DB 테이블 생성
@Getter
@Setter
public class post {
    @Id //PK
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String title;
}
