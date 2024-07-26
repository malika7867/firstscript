package automate1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ChromeDriver driver=new ChromeDriver();  
	  
	  driver.get("https://demo.nopcommerce.com/");
	String act_title = driver.getTitle();
	if (act_title.equals("nopCommerce demo store"))
	{
		System.out.println("test passed");
	}
		else {
			System.out.println("tes failed");
		}
	
	driver.close();
	}

}
