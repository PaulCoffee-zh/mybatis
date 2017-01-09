package com.akcomejf.cube;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.akcomejf.cube.framework.MyMapper;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement // 启用事务
@MapperScan(basePackages = "com.akcomejf.cube.mapper", markerInterface = MyMapper.class)
@ImportResource({"classpath:uranus-consumer.xml"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
