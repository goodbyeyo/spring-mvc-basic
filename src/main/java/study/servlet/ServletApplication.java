package study.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import study.servlet.web.springmvc.v1.SpringMemberFormControllerV1;

@ServletComponentScan	// 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	// component scan 대신 @Bean 등록 방법
//	@Bean
//	SpringMemberFormControllerV1 springMemberFormControllerV1(){
//		return new SpringMemberFormControllerV1();
//	}

}
