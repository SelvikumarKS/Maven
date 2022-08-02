import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Incognito_Browser {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\TestMavenApp\\driverchrome\\chromeNew\\Google Chrome.lnk");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
}
