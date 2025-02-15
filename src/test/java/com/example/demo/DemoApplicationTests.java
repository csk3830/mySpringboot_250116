package com.example.demo;

import com.example.demo.domain.BoardVO;
import com.example.demo.repository.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BoardMapper boardMapper;

	@Test
	void contextLoads() {
		for(int i=1; i<=300; i++){
			BoardVO boardVO = BoardVO.builder()
					.title("Test Title "+i)
					.userId(1)
					.content(i+"st Text Content...")
					.build();
			boardMapper.register(boardVO);
		}
	}

}
