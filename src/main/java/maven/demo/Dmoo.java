package maven.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dmoo{


	
	
		
		public static void main(String[] args) {
			
			
			{
			
			System.setProperty("webdriver.chrome.driver", "D:\\soft garden\\chromedriver_win32_2\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String URL="https://www.facebook.com/";
			
			driver.get(URL);
			
			System.out.println("hi");
			System.out.println("hello");
			
			driver.close();
			}
		}

	}



