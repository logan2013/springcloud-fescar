package com.fescar.demo.order.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author crazier.huang
 * @date 2019/1/24
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ORDER_TBL")
public class Order {
    @Id
    private Long id;

    private String userId;

    private String commodityCode;


    private int count;

    private BigDecimal momey;
}
