package com.wh.service.starter;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wh.service.starter"
		//,"com.project.base.web"
		, "com.project.base.mybatis"
		})
@MapperScan("com.wh.service.starter.dao.db.table")
//@DubboComponentScan({ "com.wh.service.starter.svc"})
public class App {
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("logger ing....");
        SpringApplication.run(App.class, args);
    }
}
