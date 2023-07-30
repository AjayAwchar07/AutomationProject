package TextBoxOrDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		
		// 1.Identify list box to be handled and store it in reference variable
		WebElement multiselection = driver.findElement(By.name("cars")); // multiselection is ref variable
		
		// 2.2.	Create an object of Select class which will accept WebElement as argument
		Select smultiple=new Select(multiselection);
		
		// 3.	By using one of the select class methods we can select values form list box like 
		// 1. selectByVisibleText: selectByVisibleText(String arg0) 
		// 2. selectByIndex: selectByIndex(int arg0) 
		// 3. selectByValue: selectByValue(String arg0)
		
		System.out.println(smultiple.isMultiple()); // checking if element is multible select or not
		
		
		smultiple.selectByIndex(3); 
		Thread.sleep(100);
		smultiple.selectByIndex(0); 
		Thread.sleep(100);
		smultiple.selectByIndex(1); 
		Thread.sleep(100);
		smultiple.selectByIndex(2); 
		Thread.sleep(100);
		
		// deselect All
		Thread.sleep(500);
		//smultiple.deselectAll();
		
		smultiple.deselectByIndex(2);
		Thread.sleep(500);
		smultiple.deselectByVisibleText("Audi");
		
		
		


	}

}
