package automationTest;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase_ECommerce {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
		 System.out.println("Website name is : "+ driver.getCurrentUrl());
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 11");	
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 System.out.println("Product name is : "+ driver.getTitle());
		 driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();
		 System.out.println("Product link is : "+ driver.getCurrentUrl());
		
		 
		 Set<String> allWindowHandles = driver.getWindowHandles();	 
		 for(String handle : allWindowHandles){
		 System.out.println("Switching to the next website -> "+ handle);
		 System.out.println("Navigating to E-Bay's website...");
		 driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		 driver.get("https://www.ebay.com.my/");
		 System.out.println("Website name is : "+ driver.getCurrentUrl());
		 driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div/div/input[1]")).click();
		 driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div/div/input[1]")).sendKeys("iPhone 11");
		 driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		 System.out.println("Product name is : "+ driver.getTitle());
		 System.out.println("Product link is : "+ driver.getCurrentUrl());
		 driver.quit(); 
		 }	
	}

}
