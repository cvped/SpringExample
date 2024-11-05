package com.cvped.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 해당 클래스의 모든 메소드에 @ResponseBody 가 적용된다
@RestController // @Controller + ResponseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {
	
	@ResponseBody
	@RequestMapping("/3")
	// 직접 만든 클래스 객체 리턴
	//@ResponseBody
	public Person objectResponse() {
	Person me =	new Person("김인규",31);
	
			return me;
	}
	
	// status code 적용
	// 요청에 대한 상태를 코드로 처리
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse() {
		
		Person me =	new Person("김인규",31);
		
		ResponseEntity<Person> entity =  new ResponseEntity<>(me, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
		
	}
	
	
}
