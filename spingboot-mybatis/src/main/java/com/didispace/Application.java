package com.didispace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chenyun
 * @version 1.0.0
 * @blog https://blog.csdn.net/sss996
 *
 */


// @MapperScan 允许我们通过扫描加载Mybatis的mapper
// 如果SpringBoot中不存在多个sqlSessionFactory，完全可以不配置sqlSessionFactoryRef
@MapperScan(
		//指定包扫描
		basePackages = "com.didispace.*",
		// 指定SqlSessionFactory,如果sqlSessionTemplate被指定则作废
		//sqlSessionFactoryRef = "sqlSessionFactory",
		// 指定sqlSessionTemplateRef 将忽略sqlSessionFactory的配置
		//sqlSessionTemplateRef = "sqlSessionTemplate",
		annotationClass = Repository.class
)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
