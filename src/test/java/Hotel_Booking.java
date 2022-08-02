import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\TestMavenApp\\driverchrome\\chromeNew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("durgakumar");

		// password
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("durgakumar2244");

		// login
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		//Location
		WebElement location=driver.findElement(By.id("location"));
		location.click();
		Select s=new Select(location);
		s.selectByValue("London");
		
		//Hotel
		WebElement hotel=driver.findElement(By.id("hotels"));
		hotel.click();
		Select sh=new Select(hotel);
		sh.selectByValue("Hotel Sunshine");
		
		//Room Type
		WebElement room=driver.findElement(By.id("room_type"));
		room.click();
		Select sr=new Select(room);
		sr.selectByValue("Standard");
		
		//Number of Room
	
		WebElement roomno=driver.findElement(By.id("room_nos"));
		roomno.click();
		Select snr=new Select(roomno);
		snr.selectByValue("2");
		
		//Check in Date
		WebElement ci=driver.findElement(By.id("datepick_in"));
		ci.clear();
		ci.sendKeys("17/06/2022");
		
		//Checkout
		WebElement co=driver.findElement(By.id("datepick_out"));
		co.clear();
		co.sendKeys("18/06/2022");
		
		//Adults children
		WebElement adults=driver.findElement(By.id("adult_room"));
		adults.click();
		Select sa=new Select(adults);
		sa.selectByValue("2");
		
		//Adults  room
		WebElement aroom=driver.findElement(By.id("child_room"));
		aroom.click();
		Select sar=new Select(aroom);
		
		//Search
		WebElement search=driver.findElement(By.id("Submit"));
		search.click();
		
		//Radio Button
		WebElement radio=driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		//Continue
		WebElement c=driver.findElement(By.id("continue"));
		c.click();
		
		//First name
		WebElement fn=driver.findElement(By.id("first_name"));
		fn.sendKeys("Durga");
		
		//Last name
		WebElement ln=driver.findElement(By.id("last_name"));
		ln.sendKeys("kumar");
		
		//Address
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("mgr nagar,Vellore");
		
		//credit card no
		WebElement cr=driver.findElement(By.id("cc_num"));
		cr.sendKeys("2233 4455 6677 8899");
		
		//payment
		WebElement payment=driver.findElement(By.id("cc_type"));
		payment.click();
		Select pay=new Select(payment);
		pay.selectByValue("VISA");
		
		//Expire Date
		WebElement expire=driver.findElement(By.id("cc_exp_month"));
		expire.click();
		Select exd=new Select(expire);
		exd.selectByValue("7");
		
		//Expire year
		WebElement expireyear=driver.findElement(By.id("cc_exp_year"));
		expireyear.click();
		Select exy=new Select(expireyear);
		exy.selectByValue("2022");
		
		//CVV number
		WebElement cvv=driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1234");
		
		//Book Now
		WebElement book=driver.findElement(By.id("book_now"));
		book.click();
		
		//Scroll up
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,-1000)");
				
		
		//TakesScreenshot
//		TakesScreenshot tscreen=(TakesScreenshot) driver;
//		File source=tscreen.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:/Users/ADMIN/eclipse-workspace/TestMaven/screenshot/complete3.png");
//		FileUtils.copyFile(source,destination);
//	
		//Scroll done
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,-1000)");
		
		//logout
		WebElement logout=driver.findElement(By.id("logout"));
		logout.click();
				
		
		
		
		
		
		
		
	}
}



