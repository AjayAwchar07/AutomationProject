package TextBoxOrDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// 1.1.	Identify list box to be handled and store it in reference variable
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		// dropdown is ref varaiable and webelement is stored data
		
		// 2.2.	Create an object of Select class which will accept WebElement as argument
		//Select s= new Select(States);
		
		Select sdropdown=new Select(dropdown);
		
		// 3.3.	By using one of the select class methods we can select values form list box like 
		//1. selectByVisibleText: selectByVisibleText(String arg0) 
		//2. selectByIndex: selectByIndex(int arg0) 
		//3. selectByValue: selectByValue(String arg0)
		
		sdropdown.selectByVisibleText("Option3");
		Thread.sleep(500);
		
		sdropdown.selectByIndex(1);
		Thread.sleep(500);
		
		sdropdown.selectByValue("Option2");


		

	}

}
