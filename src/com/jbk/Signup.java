package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	   driver.get("https://www.qa.jbktest.com/online-exam#Testing");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Actions actions=new Actions(driver);
	   driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();
	   driver.findElement(By.id("countbtn")).click();
	   driver.findElement(By.id("loginmobile")).sendKeys("1111122222");
	   driver.findElement(By.id("loginbtn")).click();
       String errtext=driver.findElement(By.id("loginerr")).getText();
//if(errtext.contains("You have not registered with us.please click signup tab to get registerd")){
//    System.out.println(11);
//}
//	System.out.println(22);
	   driver.findElement(By.id("signup-tab")).click();
	   driver.findElement(By.id("name")).sendKeys("225sel");
	   driver.findElement(By.id("emailid")).sendKeys("225@gmail.com");
	   driver.findElement(By.id("mobile")).sendKeys("1111111111");

	   actions.sendKeys(Keys.TAB).perform();
	   driver.findElement(By.id("agree")).click();
	   driver.findElement(By.id("emailbtn")).click();
	   

}

}