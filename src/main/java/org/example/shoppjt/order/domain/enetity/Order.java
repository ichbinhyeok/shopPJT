package org.example.shoppjt.order.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;
import org.example.shoppjt.member.domain.enetity.Member;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "orders")
public class Order extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;            //주문번호(PK)

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;      //회원(다대일)

    @Column(nullable = false, length = 20)
    private String name;        //수취인 이름

    @Column(nullable = false, length = 20)
    private String phone;       //수취인 전화번호

    @Column(nullable = false, length = 20)
    private String zipcode;     //수취인 우편번호

    @Column(nullable = false, length = 50)
    private String address;     //수취인 상세주소

    private String requirement; //요청사항
    private int totalPrice;     //결제금액
}
