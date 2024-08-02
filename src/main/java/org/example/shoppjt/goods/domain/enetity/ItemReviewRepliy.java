package org.example.shoppjt.goods.domain.enetity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "item_review_repliy")
public class ItemReviewRepliy extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_review_repliy_id")
    private Long Id;

//    @ManyToOne
//    @JoinColumn(name = "item_review_id")
//    private ItemReview itemReview;          //상품리뷰(다대일)

    private String comment;                 //리뷰댓글내용
}
