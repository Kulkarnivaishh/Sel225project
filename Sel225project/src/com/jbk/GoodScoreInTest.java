package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodScoreInTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.get("https://www.qa.jbktest.com/online-exam#Testing");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();
   String val=driver.findElement(By.name("count")).getAttribute("value");
   System.out.println(val);

   driver.findElement(By.id("countbtn")).click();
   driver.findElement(By.id("loginmobile")).sendKeys("2222211111");
   driver.findElement(By.id("loginbtn")).click();
   driver.findElement(By.xpath("//* [@id='myaccount']/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a")).click();

}
}
