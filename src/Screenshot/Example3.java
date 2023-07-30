package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example3 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s=RandomString.make(4);
		
		File destination=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\SC//testing"+s+".jpg");
		
		FileHandler.copy(source, destination);
		

	}

}
