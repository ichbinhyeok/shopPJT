package org.example.shoppjt.goods.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "item_category")
@Entity
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_category_id")
    private Long id;    //카테고리번호(PK)

    private String mainCategory;
}
