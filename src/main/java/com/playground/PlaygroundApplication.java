package com.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 기본적으로 선언되어 있는 어노테이션, 최상단에 위치
public class PlaygroundApplication {

	public static void main(String[] args) {
		// SpringApplication.run() 내부 was를 실행시키는 메서드
		SpringApplication.run(PlaygroundApplication.class, args);
	}

}
