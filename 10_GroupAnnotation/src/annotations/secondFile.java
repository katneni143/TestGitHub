package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondFile {
  
	@BeforeTest
	public void bTest() {
		System.out.println("\nThis Is @BeforeTest - F2");
	}
	
	@BeforeClass
	public void bClass1() {
		System.out.println("\nThis Is @BeforeClass - F2");
	}
	  @Test
	  public void test1() {
		  System.out.println("\nThis is Class - F2");
	  }
	  
	@AfterClass
	public void aClass1() {
		System.out.println("\nThis Is @AfterClass - F2");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("\nThis Is @AfterTest - F2");
	}
}
