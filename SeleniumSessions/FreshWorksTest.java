package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshWorksTest {
	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl("freshworks");
		String title = br.getPageTitle();
		System.out.println(title);

		By header = By.tagName("h1");
		By platform_link = By.linkText("Platform");
		By getStarted_button = By.xpath("get absolute xpath");
		By header_h2 = By.tagName("h2");
		By contactUs_link = By.linkText("Contact us");

		ElementUtil ele = new ElementUtil(driver);
//		String headerText = ele.doGetText(header_h1);
//		System.out.println(headerText);
		
		

	}
}
