package filedownload;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ruchi {
	public static void main(String[] args) throws InterruptedException {
		
		Logger logger = Logger.getLogger("Ruchi");
		//PropertyConfigurator.configure("log4j.properties");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id='login_Layer']/span")).click();
		logger.info("login clicked");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='eLogin']")).sendKeys("gottapupshn@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("naidutejaswi@123");
		logger.info("password writtened");
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[1][@class='blueBut']/button[@class='w205']/div/b")).click();
		
		driver.findElement(By.xpath("//*[@id='links1']/a[1]")).click();
	}

}
