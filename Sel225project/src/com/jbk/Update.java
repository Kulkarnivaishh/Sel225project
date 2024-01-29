package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
   driver.get("https://www.qa.jbktest.com/online-exam#Testing");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();

   driver.findElement(By.id("countbtn")).click();
   driver.findElement(By.id("loginmobile")).sendKeys("1111122222");
   driver.findElement(By.id("loginbtn")).click();
   
   driver.findElement(By.xpath("//* [@id='myaccount']/a[1]")).click();
   driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/a")).click();
   driver.findElement(By.id("name")).clear();
   driver.findElement(By.id("emailid")).clear();
   driver.findElement(By.id("mobile")).clear();

   driver.findElement(By.id("name")).sendKeys("Vaishnavi kulkarn");
   driver.findElement(By.id("emailid")).sendKeys("vk1317720@gmail.com");
   driver.findElement(By.id("mobile")).sendKeys("9766546731");
   driver.findElement(By.id("updatebtn")).click();

}
}
