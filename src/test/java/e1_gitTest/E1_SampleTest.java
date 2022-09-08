package e1_gitTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class E1_SampleTest {
	@Test
	public void test() throws IOException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	File src = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("D:\\surya\\E1_GitTest\\Screenshot\\GitHubTest.png"));
    driver.close();
	}
	@Test(priority=1,enabled=false)
	public void mul()
	{
		System.out.println("mul");
	}
	@Test(priority=0)
	public void add()
	{
		System.out.println("Add");
	}
	@Test(priority=3)
	public void sub()
	{
		System.out.println("sub");
	}
	@Test(priority=-1)
	public void per()
	{
		System.out.println("per");
	}

}


}
