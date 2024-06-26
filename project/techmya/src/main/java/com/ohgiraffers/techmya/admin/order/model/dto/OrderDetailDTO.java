package com.ohgiraffers.techmya.admin.order.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailDTO {


    private int productNo;
    private int productOptionNo;
    private int detailOrderAmount;
    private int totalPrice;
}
