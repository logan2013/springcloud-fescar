package com.fescar.demo.store.entity;

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
@Table(name = "STORAGE_TBL")
public class Storage {
    @Id
    private Long id;

    private String commodityCode;


    private int count;

}
