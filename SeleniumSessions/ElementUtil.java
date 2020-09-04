package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
			
	}
	public WebElement getElement(By locator) {
	      return driver.findElement(locator);

		}
		public void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
				
		}
		public void doClick(By locator) {
			getElement(locator).click();
		}
		public By doGetText(By header_h1) {
			return doGetText(header_h1);
		}
}
