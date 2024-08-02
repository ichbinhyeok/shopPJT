package org.example.shoppjt.member.domain.enetity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.shoppjt.global.common.BaseEntityTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "card")
@Entity
public class Card extends BaseEntityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;      //회원번호 다대일

    private String cardCompany; //카드회사

    @Column(unique = true)
    private String cardNumber;  //카드일련번호
    private String cardExpire;  //카드만료일
}
