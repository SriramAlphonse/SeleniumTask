package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	static ChromeDriver driver;

	static void Browserlaunch() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // get
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl(); // getCurrentUrl
		System.out.println(currentUrl);
		String Title = driver.getTitle(); // getTitle
		System.out.println(Title);
		// String pageSource = driver.getPageSource();
		// System.out.println(pageSource);
	}

	static void Navigate() throws InterruptedException {

		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browserlaunch();
		Navigate();
	}

}
