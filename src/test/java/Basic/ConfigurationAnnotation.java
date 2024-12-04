package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Beforesuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Beforetest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void TestScript1() {
		System.out.println("TestScript1");
	}
	@Test
	public void TestScript2() {
		System.out.println("TestScript2");
	}
	@Test
	public void TestScript3() {
		System.out.println("TestScript3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Aftersuite");
	}
}
