package org.example.shoppjt.member.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;
import org.example.shoppjt.goods.domain.enetity.Goods;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "cart")
public class Cart extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;        //상품번호(다대일)

    private int totalAmount;    //장바구니 총 수량
    private int totalPrice;     //장바구니 총 가격

}
