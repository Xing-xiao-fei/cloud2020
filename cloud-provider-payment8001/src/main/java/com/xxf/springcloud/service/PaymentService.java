package com.xxf.springcloud.service;

import com.xxf.springcloud.entities.Payment;

import org.apache.ibatis.annotations.Param;

/**
 * @author xxf
 * @create 2021-08-10 14:30
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
