package com.xxf.springcloud.controller;

import com.xxf.springcloud.entities.CommonResult;
import com.xxf.springcloud.entities.Payment;
import com.xxf.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xxf
 * @create 2021-08-10 14:34
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;//添加serverPort

    @Resource
    private PaymentService paymentService;
    @PostMapping(value ="/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*********插入结果：" + result);
        if (result > 0){
            return new CommonResult(200,"插入数据库成功"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败");
        }

    }

    @GetMapping(value ="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("*********查询成功：" + result);
        if (result != null){
            return new CommonResult(200,"查询数据库成功"+serverPort,result);
        }else {
            return new CommonResult(444,"查询数据库失败"+serverPort);
        }

    }
    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
