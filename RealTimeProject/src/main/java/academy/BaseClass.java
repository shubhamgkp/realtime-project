package academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException{

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("E:/STUDY_STUFF/SQA/Workplace/RealTimeProject/src/main/java/academy/data.properties");
		
		prop.load(fs);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();	
			driver.navigate().to(url);
			driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();	
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		else if(browserName.equals("opera")){
			System.setProperty("webdriver.chrome.driver", "Resource/operadriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:/Users/Shubham Verma/AppData/Local/Programs/Opera/56.0.3051.116/opera.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
	}
}
