package com.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.Base_Class;

public class Adactin_Hotel extends Base_Class {
public static WebDriver driver;
	public static void main(String[] args){
		driver= browserLaunch("chrome");
		getUrl(" https://adactinhotelapp.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//1.login page
		WebElement username=driver.findElement(By.id("username"));
		userInput(username,"durgakumar");
		WebElement password=driver.findElement(By.id("password"));
		userInput(password,"durgakumar2244");
		WebElement login=driver.findElement(By.id("login"));
		clickOnElement(login);

		/*//2.Search Page
		
		WebElement location=driver.findElement(By.id("location"));
		location.sendKeys("London");
		
		WebElement hotel=driver.findElement(By.id("hotels"));
		hotel.sendKeys("Sunshine");
		
		WebElement roomtype=driver.findElement(By.id("room_type"));
		roomtype.sendKeys("Double");
		
		WebElement roomno=driver.findElement(By.id("room_nos"));
		roomno.sendKeys("1-One");
		
		WebElement check_in=driver.findElement(By.id("datepick_in"));
		check_in.clear();
		check_in.sendKeys("19/7/22");
		
		WebElement check_out=driver.findElement(By.id("datepick_out"));
		check_out.clear();
		check_out.sendKeys("20/7/22");
		
		WebElement adult_room=driver.findElement(By.id("adult_room"));
		adult_room.sendKeys("One");
		
		WebElement child_room=driver.findElement(By.id("child_room"));
		child_room.sendKeys("2-Two");
		
		WebElement search=driver.findElement(By.id("Submit"));
		search.click();
		
		//3.Select Hotel
		
		WebElement select_hotel=driver.findElement(By.id("radiobutton_4"));
		select_hotel.click();
		
		WebElement cbtn=driver.findElement(By.name("continue"));
		cbtn.click();

		
		//4.Book a Hotel
		
		WebElement fname=driver.findElement(By.id("first_name"));
		fname.sendKeys("selvi");
		
		WebElement lname=driver.findElement(By.id("last_name"));
		lname.sendKeys("k");
		
		WebElement addr=driver.findElement(By.id("address"));
		addr.sendKeys("Anna nagar");
		
		WebElement ccard_no=driver.findElement(By.id("cc_num"));
		ccard_no.sendKeys("2233 4455 6677 8899");
		
		
		WebElement cc_type=driver.findElement(By.id("cc_type"));
		cc_type.sendKeys("VISA");
		
		WebElement cc_exp=driver.findElement(By.id("cc_exp_month"));
		cc_exp.sendKeys("October");
		
		
		WebElement cc_exp_year=driver.findElement(By.id("cc_exp_year"));
		cc_exp_year.sendKeys("2022");
		
		WebElement cc_number=driver.findElement(By.id("cc_cvv"));
		cc_number.sendKeys("2345");
		
		
		WebElement book_now=driver.findElement(By.id("book_now"));
		book_now.click();
		
		//TakesScreenShot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\screenshot\\AdactinHotel.png");
		FileUtils.copyFile(source, destination);
		
		//Scroll Down
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		//5.Logout
		
		WebElement logout=driver.findElement(By.id("logout"));
		logout.click();
				
		
	}*/
	}

}
