package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	static ChromeDriver driver;

	static void Browserlaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}

	static void Screenshot() throws IOException {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\srira\\eclipse-workspace\\Example Projects\\src\\Screenshot\\Image1.png");
		FileHandler.copy(source, destination);
		System.out.println("Imgae 1 taken Successfully");
		WebElement search = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("dress for kids");
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File(
				"C:\\Users\\srira\\eclipse-workspace\\Example Projects\\src\\Screenshot\\Image2.png");
		FileHandler.copy(source2, destination2);
		System.out.println("Imgae 2 taken Successfully");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Browserlaunch();
		Screenshot();
	}
}
