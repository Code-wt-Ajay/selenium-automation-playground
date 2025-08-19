////positive test case 1
//package intro_selenium;
//
//import java.util.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Locators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//			    "D:\\WORK\\JAVA WORKSPACE\\chrome driver for selenium\\chromedriver-win64\\chromedriver.exe");
//
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");// accessing url 
//		driver.findElement(By.name("username")).sendKeys("student");//outer html code <input type="text" name="username" id="username">
//		driver.findElement(By.name("password")).sendKeys("Password123");//<input type="password" name="password" id="password">
//		driver.findElement(By.className("btn")).click();//<button id="submit" class="btn">Submit</button>
//		driver.findElement(By.)
//		
//
//	}
//
//}
// 
////			Negative test case 
//// test case 1 //invalid user name 
//package intro_selenium;
//
//import java.util.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Locators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//			    "D:\\WORK\\JAVA WORKSPACE\\chrome driver for selenium\\chromedriver-win64\\chromedriver.exe");
//
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");// accessing url 
//		driver.findElement(By.name("username")).sendKeys("macroos");//outer html code <input type="text" name="username" id="username">
//		driver.findElement(By.name("password")).sendKeys("Password123");//<input type="password" name="password" id="password">
//		driver.findElement(By.className("btn")).click();//<button id="submit" class="btn">Submit</button>
//		
//		
//
//	}
//
//}

////Negative test case 
//// test case 2 //invalid password
//package intro_selenium;
//
//import java.util.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Locators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//			    "D:\\WORK\\JAVA WORKSPACE\\chrome driver for selenium\\chromedriver-win64\\chromedriver.exe");
//
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");// accessing url 
//		driver.findElement(By.name("username")).sendKeys("student");//outer html code <input type="text" name="username" id="username">
//		driver.findElement(By.name("password")).sendKeys("123@student");//<input type="password" name="password" id="password">
//		driver.findElement(By.className("btn")).click();//<button id="submit" class="btn">Submit</button>
//		
//		
//
//	}
//
//}


//Negative test case 
// test case 3//invalid username and password
package intro_selenium;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
			    "D:\\WORK\\JAVA WORKSPACE\\chrome driver for selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");// accessing url 
		driver.findElement(By.name("username")).sendKeys("vetri");//outer html code <input type="text" name="username" id="username">
		driver.findElement(By.name("password")).sendKeys("123@student");//<input type="password" name="password" id="password">
		driver.findElement(By.className("btn")).click();//<button id="submit" class="btn">Submit</button>
		
		

	}

}
