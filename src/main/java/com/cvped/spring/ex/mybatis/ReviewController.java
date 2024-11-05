package com.cvped.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cvped.spring.ex.mybatis.domain.Review;
import com.cvped.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// id가 5인 리퓨 정보를 json으로 response에 담는다.
	
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
	
		// id가 5인 리뷰정보 얻어오기
		Review review = reviewService.getReview(id);
		
		return review;
		
	}
}
