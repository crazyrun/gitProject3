package com.huawei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @CLassName: SLF4JDemo
 * @Author： 46433
 * @Date： 2021/8/18 23:16
 * @Description SLF4J 通常和logback绑定一起使用
 */
public class SLF4JDemo {
    public static void main(String[] args) {
        String name = "shengcai";
        String nation = "Canada";
        Logger logger = LoggerFactory.getLogger(SLF4JDemo.class);
        logger.info("这是info.....");
        logger.warn("这是warn.....");
        logger.error("这是error...");
        logger.info("hello world");

        logger.info("Hello {}, welcome to {}", name, nation); // 接变量
    }
}
