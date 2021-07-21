package AutomateBrowser;
import org.openqa.selenium.chrome.ChromeDriver;//Ctrl+Shift_O to add all classes
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://weather.com/");
		WebElement a= driver.findElement(By.xpath("//input[@id='LocationSearch_input']"));
		a.click();
		a.sendKeys("Delhi");
	} 
}