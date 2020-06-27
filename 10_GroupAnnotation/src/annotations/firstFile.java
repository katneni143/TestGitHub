package annotations;

import org.testng.annotations.*;

public class firstFile {
	
	@BeforeTest
	public void bTest1() {
		System.out.println("\nThis Is @BeforeTest  - F1");
	}
	
	@BeforeClass
	public void bClass1() {
		System.out.println("\nThis Is @BeforeClass - F1");
	}
	
	@Test
	public void test1() {
		System.out.println("\nThis is Class1 - F1");
	}
	  
	  @Test
	  public void test2() {
		  System.out.println("\nThis is Class2 - F1");
	  }
	  
	@AfterClass
	public void aClass1() {
		System.out.println("\nThis Is @AfterClass - F1");
	}

	@AfterTest
	public void aTest() {
		System.out.println("\nThis is @AfterTest - F1");
	}
}
