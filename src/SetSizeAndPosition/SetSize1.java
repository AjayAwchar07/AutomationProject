package SetSizeAndPosition;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		// to identify Default size of Browser
		 Dimension defaultsize = driver.manage().window().getSize();
		 System.out.println("Default Size is "+defaultsize);
		 
		 // To set Current size of Browser
		 Dimension d=new Dimension(300,1000);
		 Thread.sleep(3000);
		 driver.manage().window().setSize(d);
		 
		 // To identify Current Size of Browser
		 Dimension currentsize = driver.manage().window().getSize();
		 System.out.println("Current Size is "+currentsize);
		 
		 
		 // To set Maximize size of Browser
		 driver.manage().window().maximize();
		 Dimension maximise = driver.manage().window().getSize();
		 System.out.println("Maximize size is "+maximise);
		 
		 
		 
		

	}

}
