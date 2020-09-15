package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups = "Sanity")
public class TestNG1 {
	@Test(groups = { "Linux.Sanity","Regression"})
	public void m1() {
		System.out.println("m1 Method case");		
	}
	@Test(invocationTimeOut = 10000)
	public void m2() {
		System.out.println("m2 Method case");
	}
	@Test(groups ="Windows.Sanity")
	public void m3() {
		System.out.println("m3 Method case");
	}
	@Test(dependsOnMethods = {"m1"})
	public void m4() {
		System.out.println("m4 Method case");
	}
	@Test(groups = {"Windows.Sanity"})
	public void m5() {
		System.out.println("m5 Method case");
		
	}

}
