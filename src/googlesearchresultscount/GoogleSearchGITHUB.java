package googlesearchresultscount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchGITHUB {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserExeFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,30);
	driver.get("http://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("GITHUB");
	driver.findElement(By.id("lst-ib")).submit();
	wait.until(ExpectedConditions.titleContains("GITHUB"));
	String txt=driver.findElement(By.id("resultStats")).getText();
	String[] str=txt.split(" ");
	System.out.println("GoogleSearch result count for GITHUB is "+str[1]);
	driver.quit();

	}

}
