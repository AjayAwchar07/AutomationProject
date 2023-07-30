package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotGeneralMethod 
{
	public static void ScreenShot(WebDriver driver, String s) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File destination = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Screensho Of Silenium"+s+".png");
		
		FileHandler.copy(source, destination);
	}

}
