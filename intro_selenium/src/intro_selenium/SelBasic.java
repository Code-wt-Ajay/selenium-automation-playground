package intro_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome driver scripts
//		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver1 =new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","D:\\WORK\\JAVA WORKSPACE\\chrome driver for selenium\\chrome-win64\\chromeddriver.exe");
//		driver1.get("https://forkandfeast-res.netlify.app/");
//		System.out.println(driver1.getTitle());
//		System.out.println(driver1.getCurrentUrl());
//		driver1.close();
//		
		//firefox driver scripts
		
//		WebDriver driver2 =new FirefoxDriver();
//		//System.setProperty("webdriver.gecko.driver","D:\\WORK\\JAVA WORKSPACE\\firefox web driver package\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
//		driver2.get("https://forkandfeast-res.netlify.app/");
//		System.out.println(driver2.getTitle());
//		System.out.println(driver2.getCurrentUrl());
//		driver2.close();

		//edge driver 
		WebDriver driver3 = new EdgeDriver();
		System.setProperty("webdriver.edge.driver","D:\\WORK\\JAVA WORKSPACE\\Edge driver\\edgedriver_win64\\msedgedriver.exe");
		driver3.get("https://forkandfeast-res.netlify.app/");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.close();

	}

}
