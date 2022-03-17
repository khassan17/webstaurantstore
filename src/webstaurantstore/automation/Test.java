package webstaurantstore.automation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
	
		WebDriver driver= Base.getDriver();
		driver.get("https://www.webstaurantstore.com");
		driver.manage().window().maximize();
		
	WebElement	searchbox=driver.findElement(By.xpath("//input[@type='text']"));
			searchbox.sendKeys("stainless work table");
			driver.findElement(By.xpath("//button[@value='Search']")).click();
			
			if(driver.getPageSource().contains("Table")){
				System.out.println("Word Table is present");
				}else{
				System.out.println("Word Table is absent");
				}
			driver.findElement(By.xpath("//*[@id=\"paging\"]/nav/ul/li[8]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"product_listing\"]/div[60]/div[4]/form/div/div/input[2]")).click();
	        
			
	        driver.findElement(By.xpath("//a[@class='btn btn-small btn-primary']")).click();	                                                                                                           
	        // driver.findElement(By.xpath("//svg[@'itemDelete__icon']")) ;
	
	      // WebDriverWait wait = new WebDriverWait(driver,30);
	         //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cartItem ag-item gtm-product-auto']//a[@class='deleteCartItemButton itemDelete__link itemDelete--positioning']//*[name()='svg']")));
	         driver.findElement(By.xpath("//a[@class='emptyCartButton btn btn-mini btn-ui pull-right']")).click();
	       driver.findElement(By.xpath("//*[@id=\"td\"]/div[6]/div/div/div/div[3]/button[1]")).click();
	
	
	}

}
