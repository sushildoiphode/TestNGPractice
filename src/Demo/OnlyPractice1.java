package Demo;


import org.junit.After;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlyPractice1{
		@BeforeSuite
		public void m1() {
			System.out.println("Before Suit 1");
		}
		@BeforeTest
		public void m2() {
			System.out.println("Before Test 1");
		}
		@BeforeClass
		public void m3() {
			System.out.println("Before class 1");
		}
		@BeforeMethod
		public void m4() {
			System.out.println("Before Method 1");
		}
		@Test
		public void m5() {
			System.out.println("Test annotation 1");

		}
		@AfterTest
		public void m6() {
			System.out.println("After test 1");
		}
		@AfterClass
		public void m7() {
			System.out.println("After class 1");
		}
		@AfterMethod
		public void m8() {
			System.out.println("After Method 1");
		}
		@AfterSuite
		public void m9() {
			System.out.println("After suite 1");
		}
		
}

