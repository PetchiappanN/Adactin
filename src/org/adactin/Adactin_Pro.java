package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Pro {
	
	// Mini Project - adactinhotelapp.cpm

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\petch\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://adactinhotelapp.com/");

	driver.findElement(By.name("username")).sendKeys("bala12182");

	driver.findElement(By.id("password")).sendKeys("Bala@1982");

	driver.findElement(By.id("login")).click();

	WebElement location = driver.findElement(By.name("location"));
	Select s = new Select(location);
	s.selectByIndex(1);

	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotels);
	s1.selectByValue("Hotel Sunshine");

	WebElement room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
	Select s2 = new Select(room);
	s2.selectByVisibleText("Deluxe");

	WebElement nrooms = driver.findElement(By.name("room_nos"));
	Select s3 = new Select(nrooms);
	s3.selectByValue("2");

	WebElement adultroom = driver.findElement(By.name("adult_room"));
	Select s4 = new Select(adultroom);
	s4.selectByVisibleText("3 - Three");

	WebElement childroom = driver.findElement(By.id("child_room"));
	Select s5 = new Select(childroom);
	s5.selectByValue("2");

	driver.findElement(By.name("Submit")).click();

	driver.findElement(By.name("radiobutton_0")).click();

	driver.findElement(By.name("continue")).click();

	// driver.findElement(By.id("cancel")).click();
	driver.findElement(By.name("first_name")).sendKeys("Balakrishnan");
	driver.findElement(By.name("last_name")).sendKeys("Gunasekaran");

	driver.findElement(By.name("address")).sendKeys("10, 2nd Main Road, Velacherry, Chennai - 600042");
	driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	WebElement ccType = driver.findElement(By.name("cc_type"));

	Select cc = new Select(ccType);
	cc.selectByIndex(1);

	WebElement month = driver.findElement(By.name("cc_exp_month"));
	Select m = new Select(month);
	m.selectByValue("4");

	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select y = new Select(year);
	y.selectByVisibleText("2019");

	driver.findElement(By.name("cc_cvv")).sendKeys("789");

	driver.findElement(By.name("book_now")).click();
	
	

	// driver.findElement(By.name("cancel")).click();

	}


}
