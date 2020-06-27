package annotations;

import org.testng.annotations.*;

public class thirdFile {
	
	@BeforeClass
	public void bClass() {
		System.out.println("\nThis is @BeforeClass - F3");
	}
	
	
  @Test
  public void test1() {
	  System.out.println("\nTest 1 - F3");
  }
  
	@AfterClass
	public void aClass() {
		System.out.println("\nThis is @AfterClass - F3");
	}
	
}
