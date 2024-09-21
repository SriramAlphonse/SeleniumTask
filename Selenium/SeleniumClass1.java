package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {
	
	public static void main(String[] args) {	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String Title = driver.getTitle();
	System.out.println(Title);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	String Title2 = driver.getTitle();
	System.out.println("Current Title is " + Title2);
	String currenturl2 = driver.getCurrentUrl();
	System.out.println("Current URL is " + currenturl2);
	driver.navigate().back();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("qwerty@facebook.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Qwerty@123");
	String text = password.getText();
	System.out.println(text);
	boolean selected = password.isSelected();
	System.out.println(selected);
	boolean displayed = password.isDisplayed();
	System.out.println(displayed);
	boolean enabled = password.isEnabled();
	System.out.println(enabled);
	String Attribute = password.getAttribute("name"); //get attribute value
	System.out.println(Attribute);	
	//String Attribute1 = password.getAttribute("pass"); //there is two pass in Attribute name
	//System.out.println(Attribute1);
	WebElement login = driver.findElement(By.name("login"));
	String Attribute2 = login.getAttribute("name");
	System.out.println(Attribute2);
	login.click();
	//driver.close();
	
	}

}
