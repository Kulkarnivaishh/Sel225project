package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
@Test
  public void checkExamFunct() {
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
	   String hn=driver.findElement(By.xpath("//h3[text ()=Your Result']")).getText();
	  System.out.println(hn);
	   
String expres="Your Result";
String Actres=driver.findElement(By.xpath("//*[text ()='Your Result']")).getText();
 Assert.assertEquals(Actres, expres);
	}
  //pass 
  @Test
  public void checkUpdateFun() {
	  {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		   driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();

		   driver.findElement(By.id("countbtn")).click();
		   driver.findElement(By.id("loginmobile")).sendKeys("2222211111");
		   driver.findElement(By.id("loginbtn")).click();
		   
		   driver.findElement(By.xpath("//* [@id='myaccount']/a[1]")).click();
		   driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/a")).click();
		   driver.findElement(By.id("name")).clear();
		   driver.findElement(By.id("emailid")).clear();
		   driver.findElement(By.id("mobile")).clear();

		   driver.findElement(By.id("name")).sendKeys("Vaishnavi kulkarni");
		   driver.findElement(By.id("emailid")).sendKeys("kulkarnivaishnvi2496@gmail.com");
		   driver.findElement(By.id("mobile")).sendKeys("2222211111");
		   driver.findElement(By.id("updatebtn")).click();
	  }
	 
	  }
  //pass 
  @Test
  public void checkloginfun1() {

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
	   driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[1]/a[2]")).click();
  }


	  @Test
	  public void checklogoutfun1() {

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
		   driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[1]/a[2]")).click();
		   
		 // String expres="Enter Your Mobile Number";
		//  String actres=driver.findElement(By.xpath("")).getText();
	  // Assert.assertEquals(actres,expres );
	  

	  }
	  //pass 3fail
	  @Test
	  public void checktestattemptedfun() {

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
	  String expres="Test Attempted";
	 String actres=driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[1]/h4")).getText();
Assert.assertEquals(actres, expres);
	  }
	  //pass  
	  @Test
	  public void checktestfailfun() {

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
 String expr="Failed Attempt";
			  String actr=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/h4")).getText();
		Assert.assertEquals(actr, expr);
			  }
	  //pass 
	  @Test
	  public void checkgoodscorefun1() {

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
	  String expresult="Good Score";
	  String actresult=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/h4")).getText();
Assert.assertEquals(actresult, expresult);


}
	  //pass 3fail

	  @Test
	  public void checktimelinefun() {

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
	  String expresult="";
	 String actresult=driver.findElement(By.xpath("")).getText();
Assert.assertEquals(actresult, expresult);


}
	  //pass 
	  @Test
	  public void checktesttopiccoveredlinefun() {

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
		   driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[1]/a[2]")).click();
		   
		   String expres="Our Test Topics";
		   String actres=driver.findElement(By.xpath("/hml/body/div/div[1]/div[1]/div[2]/div/h1")).getText();
		   Assert.assertEquals(expres, actres);


	  }
	  //pass 
	  @Test
	  public void checkexamheadingfun() {

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
		   
		   String expre="Manual Testing(ISTQB) Quiz";
		   String actre=driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
		   Assert.assertEquals(actre, expre);
		   
	  }
	  // pass 

@Test
public void dashboardfun() {

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
	   
	   String expre="Manual Testing(ISTQB) Quiz";
	 String actre=driver.findElement(By.xpath("")).getText();
	  Assert.assertEquals(actre, expre);
	   
}

@Test
public void Profilefun() {

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
}
	   String expre="Manual Testing(ISTQB) Quiz";
@Test
public void performanceFun() {
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
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/h4")).click();
}
@Test
public void Syllabusfun() {
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
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/h4")).click();
}
@Test
public void InterviewQuestionsfun() {
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

}
@Test
public void TutorialsFun() {
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

}
@Test
public void ContactUsFun() {
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

}
@Test
public void HomeFun() {
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
}
@Test
public void LiveVideoFun() {
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

}
@Test
public void ContributeFun() {
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

}
@Test
public void MyAccountFun() {
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
}
}