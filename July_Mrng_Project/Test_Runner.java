package July_Mrng_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.File_Reader_Manager;

public class Test_Runner extends Base_Class {
	public static WebDriver driver=getBrowser("Chrome");;
	//public static Home_Page2 hp2 = new Home_Page2(driver);
	//public static Login_Page2 login2 = new Login_Page2(driver);

	public static Page_Object_Manager1 pom= new Page_Object_Manager1(driver);
	
	public static void main(String[] args) throws Throwable{
		
		
		 String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();	
		
		url(url);
		
		sleep(2000);
		
		clickOnElement(pom.getIntancehp2().getSignin());
		
		System.out.println("SignInClicked");
		 
		sleep(2000);
		
		//String  email = input_From_Excel("C:\\Users\\Admin\\Downloads\\DataDrivenRead.xlsx", 3, 0);
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		
		inputValueElement(pom.getInstancelogin2().getEmail(), email);
		
		sleep(2000);
		
		
		String password = input_From_Excel("C:\\Users\\Admin\\Downloads\\DataDrivenRead.xlsx", 3, 1);
		
		inputValueElement(pom.getInstancelogin2().getPassword(), password);
		
		sleep(2000);
		
		clickOnElement(pom.getInstancelogin2().getSignin_Btn());
		
}

	
	
}
