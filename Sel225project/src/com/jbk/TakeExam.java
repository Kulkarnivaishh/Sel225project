package com.jbk;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeExam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	   driver.get("https://www.qa.jbktest.com/online-exam#Testing");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Actions actions=new Actions(driver);
	   driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();
	  String val= driver.findElement(By.name("count")).getAttribute("value");
	  System.out.println(val);
	   driver.findElement(By.id("countbtn")).click();
	   driver.findElement(By.id("loginmobile")).sendKeys("2222211111");
	   //thread.sleep(2000);
	   driver.findElement(By.id("loginbtn")).click();
	   int num=Integer.parseInt(val);
	   for(int i=1;i<=num+1;i++) {
		WebElement nextbutton=   driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));
		   //jvacript executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",nextbutton );
		driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");
	   }
	   driver.findElement(By.id("qsubmit")).click();
	  // String hh=driver.findElement(By.xpath("//h3[text ()_'Your Result']")).getText();
	   

	}
}
