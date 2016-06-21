package com.boom.dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by jiangshan on 16/6/7.
 */
public class ServiceApplication {

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:service-provider.xml");
        System.out.println("dubbo service starting...");

        CountDownLatch closeLatch = new CountDownLatch(1);
        closeLatch.await();
    }
}
