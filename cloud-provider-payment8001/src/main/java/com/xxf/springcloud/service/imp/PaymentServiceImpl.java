package com.xxf.springcloud.service.imp;

import com.xxf.springcloud.entities.Payment;
import com.xxf.springcloud.dao.PaymentDao;

import com.xxf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xxf
 * @create 2021-08-10 14:31
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
