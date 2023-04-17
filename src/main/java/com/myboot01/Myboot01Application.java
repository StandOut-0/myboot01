package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Myboot01Application {

	//프로젝트이름 + Application 형태로 메인클래스가 자동작성됨.
	//일반자바 어플리케이션, 웹애플리케이션으로 실행가능.
	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
