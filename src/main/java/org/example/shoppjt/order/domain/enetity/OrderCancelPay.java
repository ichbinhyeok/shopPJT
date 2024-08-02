package org.example.shoppjt.order.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;
import org.example.shoppjt.member.domain.enetity.Card;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "order_cancel_pay")
@Entity
public class OrderCancelPay extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_cancel_pay_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_cancel_id")
    private OrderCancel orderCancel;

    @OneToOne
    @JoinColumn(name = "card_id")
    private Card card;

    private int price;
    private String cancelMethod;
}
