package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sample {
@Test
public void amazon() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	driver.findElement(By.xpath("//span[text()='Apple']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'13 (128GB) - Midnight')]")).click();
    driver.findElement(By.xpath("//input[@class='a-button-input' and @value='Add to Cart']")).click();
	driver.findElement(By.xpath("//span[@aria-hidden='true' and @class='nav-line-2']")).click();
	WebElement quantity = driver.findElement(By.id("a-autoid-0-announce"));
	Select sel=new Select(quantity);
	sel.selectByValue("5");
	driver.findElement(By.xpath("//input[@value='Delete' and @aria-label='Delete Apple iPhone 13 (128GB) - Blue']")).click();
}

}
