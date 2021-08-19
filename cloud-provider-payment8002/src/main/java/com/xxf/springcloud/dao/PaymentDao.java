package com.xxf.springcloud.dao;

/**
 * @author xxf
 * @create 2021-08-10 14:16
 */

import com.xxf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
