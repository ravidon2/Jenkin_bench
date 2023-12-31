package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
    public static Properties config_prop  ;
	public static File configFile , dataFile ;
	public static WebDriver driver;
	public static Logger logger;
	public static String filename;
	public static String sheetname;
    static FileInputStream fis1 , fis2;
    
    
        static {
   	 
   	 configFile = new File(System.getProperty("user.dir") +  "\\Configuration\\config.properties");
   	 dataFile = new File(System.getProperty("user.dir") + "\\resources\\test_data.xlsx");
   	 config_prop = new Properties();
   	 filename = System.getProperty("user.dir") + "\\resources\\test_data.xlsx";
   	 sheetname="register";
   	 
   	 
   	 try {
			fis1 = new FileInputStream(configFile);
			fis2 = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
   	 
   	 try {
			config_prop.load(fis1);
			
		
   	 } 
   	 catch (IOException e) {
			
			e.printStackTrace();
		}
   	 
  }
    	
	
    @BeforeSuite
    public static void testSetup() throws Exception {
   	 
    logger = Logger.getLogger("Bench_Selenium");
     PropertyConfigurator.configure("log4j.properties");
   	 logger.info("using browser " + config_prop.get("browser_name"));
   	 if(config_prop.get("browser_name").toString().equals("chrome")) {
   		 
   		WebDriverManager.chromedriver().setup();
	     ChromeOptions options = new ChromeOptions();
	    	 
	    	 Map<String, Object> prefs = new HashMap<String, Object>();
	    	 prefs.put("profile.managed_default_content_settings.javascript", 2);
	    	 options.setExperimentalOption("prefs", prefs); 	    	 
	    	 driver = new ChromeDriver(options);
	    	 logger.info("Initilising Driver");
	    	 driver.manage().timeouts().implicitlyWait(Long.parseLong(config_prop.get("global_wait_time").toString()), TimeUnit.SECONDS);
	    	 logger.info("Managing Timeouts");
	    	 driver.manage().window().maximize();
	    	 logger.info("Initilising Driver");
	    	 logger.info("Maximize browser window");
   	 
   	 }
   	 else  if(config_prop.get("browser_name").toString().equals("firefox")) {
   		 
   		 	 WebDriverManager.firefoxdriver().setup();	    	 
   			 FirefoxOptions options = new FirefoxOptions();
	    	 
	    	 options.addPreference("javascript.enabled", false);	    	 
	    	 driver = new FirefoxDriver(options);
	    	 logger.info("Initilising Driver");
	    	 driver.manage().timeouts().implicitlyWait(Long.parseLong(config_prop.get("global_wait_time").toString()), TimeUnit.SECONDS);
	    	 logger.info("Managing Timeouts");
	    	 driver.manage().window().maximize();
	    	 logger.info("Initilising Driver");
	    	 logger.info("Maximize browser window");
	    	 
   	 }
   	    	 else
   		 throw new Exception("Browser Name is Invalid");
   	 
   	 
    }
    
    @AfterSuite
    public static void tearDown() {

    logger.info("Saving reports");
   	 driver.quit();
   	 logger.info("Quiting");
   	 
    }
    
}
