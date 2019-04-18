/*
 * Created by gh on 2019/4/18.
 * desc:
 */
package com.gh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ***********************************************************
 *
 * @CopyrightBy: 四川复兴教育科技有限公司
 * ***********************************************************
 * @Version: v0.0.1
 * @Function: 启动类
 * ***********************************************************
 * @CreatedBy: gh on 2019/4/18 10:41
 * ***********************************************************
 * @ModifiedBy: [name] on [time]
 * @Description: ***********************************************************
 */
@Configuration
@SpringBootApplication(scanBasePackages = "com.gh")
@MapperScan(basePackages = "com.gh.user.dao")
@EnableSwagger2
@EnableAsync
public class GHApplication {

    public static void main(String[] args) {
        SpringApplication.run(GHApplication.class, args);
    }
}
