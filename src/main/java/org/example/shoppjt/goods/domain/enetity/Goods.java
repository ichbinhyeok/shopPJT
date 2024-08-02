package org.example.shoppjt.goods.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.shoppjt.global.common.BaseEntityTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "goods")
@Entity
public class Goods extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Long id;

    @Column(nullable = false,length = 20,unique = true)
    private String name;
    @Column(nullable = false)
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_category_id")
    private ItemCategory itemCategory;  //카테고리(다대일)
    private String description;
    private String img1;    //상품이미지1
    private String img2;    //상품이미지2
    private String img3;    //상품이미지3






}
