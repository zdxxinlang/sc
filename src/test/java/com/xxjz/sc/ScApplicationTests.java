package com.xxjz.sc;

import com.xxjz.sc.bean.Poem;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ScApplicationTests {

	@Autowired
	Poem poem;
	@Test
	void contextLoads() {
		System.out.println(poem);
	}

}
