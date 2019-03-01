package TestJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class TestingJenkins {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("http://52.14.181.171:8080/qaenv/");
		System.out.println(driver.getCurrentUrl());
		String expmsg="Hello, World!";
		String actmsg=driver.findElement(By.xpath("html/body")).getText();
		System.out.println("Expected Message : "+expmsg);
		System.out.println("Actual Message   : "+actmsg);
		if(expmsg.equals(actmsg))
		{
			System.out.println("Testing has Passed");
		}
		else
		{
			System.out.println("Testing has Failed");
		}
		//driver.close();
	}
}
