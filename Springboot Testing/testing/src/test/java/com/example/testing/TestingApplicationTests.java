package com.example.testing;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest(classes = TestingApplicationTests.class)
class TestingApplicationTests {

	private Calculator calc = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		int expectedResult = 11;

		int actualResult = calc.doSum(2,4,5);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct(){
		int expectedResult = 8;

		int actualResult = calc.doProduct(2,4);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	//@Disabled
	void compareNums(){

		Boolean actualResult = calc.compareTwoNum(4,4);

		assertThat(actualResult).isTrue();
	}

}
