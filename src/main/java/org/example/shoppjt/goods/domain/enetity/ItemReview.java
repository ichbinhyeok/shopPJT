package org.example.shoppjt.goods.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;
import org.example.shoppjt.member.domain.enetity.Member;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "item_review")
@Entity
public class ItemReview extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;//회원(다대일)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;        //상품(다대일)

    @Column(nullable = false)
    private String comment;

    private String img1;        //상품이미지1
    private String img2;        //상품이미지2
    private String img3;        //상품이미지3
}
