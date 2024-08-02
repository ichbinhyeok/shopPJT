package org.example.shoppjt.global.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntityTime {

    @CreatedDate // 데이터 생성날짜 자동 주입
    @Column(updatable = false) // 업데이트 ㄴㄴ함 불변
    private LocalDateTime createAt;

    @LastModifiedDate// 데이터 수정날짜 자동주입
    private LocalDateTime updateAt;
}
