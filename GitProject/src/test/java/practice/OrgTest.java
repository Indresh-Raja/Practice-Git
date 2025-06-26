package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgTest{
	@Test
	public void createOrgTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("execute createOrgTest");
	}
}
