package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	static WebDriver driver;

	public static void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/");
		System.out.println("Browser Launched Successfully");
		login();
	}

	public static void login() {
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("SriramAlphonse");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Merit@123");
		driver.findElement(By.id("login")).click();
		System.out.println("Login Successfully");
	}

	public static void BookingStage1() {
		WebElement location = driver.findElement(By.id("location"));
		Select se1 = new Select(location);
		se1.selectByIndex(4); // select By Index
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select se2 = new Select(hotel);
		se2.selectByValue("Hotel Sunshine"); // select by Value
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select se3 = new Select(roomtype);
		se3.selectByVisibleText("Super Deluxe"); // select by visible test
		WebElement room = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select se4 = new Select(room);
		se4.selectByIndex(5);
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("20/08/2024");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("25/08/2024");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select se5 = new Select(adultroom);
		se5.selectByIndex(2);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select se6 = new Select(childroom);
		se6.selectByIndex(3);
		driver.findElement(By.id("Submit")).click();
		System.out.println("BookingStage1 Completed Successfully");
	}

	public static void BookingStage2() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		System.out.println("BookingStage2 Completed Successfully");
	}

	public static void BookingStage3() throws AWTException, InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys("Sriram");
		driver.findElement(By.id("last_name")).sendKeys("Alphonse");
		driver.findElement(By.xpath("//textarea[@class='txtarea']")).sendKeys("XYZ Street, XYZ, Pincode - 654321");
		driver.findElement(By.id("cc_num")).sendKeys("9876543219876543");
		WebElement CardType = driver.findElement(By.id("cc_type"));
		Select se1 = new Select(CardType);
		se1.selectByIndex(2);
		WebElement CardMonth = driver.findElement(By.id("cc_exp_month"));
		Select se2 = new Select(CardMonth);
		se2.selectByValue("5");
		WebElement CardYear = driver.findElement(By.id("cc_exp_year"));
		Select se3 = new Select(CardYear);
		se3.selectByVisibleText("2025");
		WebElement CVV = driver.findElement(By.id("cc_cvv"));
		CVV.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_4);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_0);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);
		String OrderNumber = driver.findElement(By.id("order_no")).getAttribute("Value");
		System.out.println("Hotel Booking Order Number is - " + OrderNumber);
		driver.findElement(By.id("my_itinerary")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("order_id_text")).sendKeys(OrderNumber);
		driver.findElement(By.id("search_hotel_id")).click();
		Thread.sleep(10000);
		System.out.println("BookingStage3 Completed Successfully");
	}
	
	public static void Screenshot() throws IOException {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\srira\\eclipse-workspace\\Example Projects\\src\\Screenshot\\MiniProjectOutput.png");
		FileHandler.copy(source, destination);
		System.out.println("Screenshot taken Successfully");
		
	}
	
	public static void logout() throws InterruptedException {
		driver.findElement(By.id("logout")).click();
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Browser Closed Successfully");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		BrowserLaunch();
		BookingStage1();
		BookingStage2();
		BookingStage3();
		Screenshot();
		logout();
		
	}

}
