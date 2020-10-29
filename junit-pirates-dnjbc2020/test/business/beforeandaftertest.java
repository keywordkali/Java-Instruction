package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class beforeandaftertest {

	@Test
	public void test1() {
		System.out.println("test1");
		assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("test2");
		assertTrue(true);
	}
	@Test
	public void test3() {
		System.out.println("test3");
		assertTrue(true);
	}

	//before test - run before all tests
	@Before
	public void before() {
		System.out.println("before");
		assertTrue(true);
	}
//run after all tests
	@After
	public void after() {
		System.out.println("after");
		assertTrue(true);
	}
	
	
	
	
	
	//before test - run once before all tests
		@BeforeClass
		public static void beforeClassTest() {
			System.out.println("beforeclass");
			assertTrue(true);
		}
	//run once after all tests
		@AfterClass
		public static  void afterClassTest() {
			System.out.println("afterclass");
			assertTrue(true);
		}

}
