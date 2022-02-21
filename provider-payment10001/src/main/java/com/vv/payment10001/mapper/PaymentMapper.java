package com.vv.payment10001.mapper;

import com.vv.common.entity.Payment;

/**
* Created by Mybatis Generator on 2022-02-19 17:57:57
*/
public interface PaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}