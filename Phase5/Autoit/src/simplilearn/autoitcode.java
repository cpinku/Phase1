package simplilearn;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoitcode {
	
	public static void main(String[] args) throws IOException,InterruptedException {
		String path= "D:\\Phase5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("C.Pinku");
		
		
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9980774545");
		
		
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("rinkuc@gmail.com");
		
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("pinkuS#123");
		
		
		WebElement element= driver.findElement(By.id("id_file"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Screenshot\\upload.exe");
		 
	}
}
