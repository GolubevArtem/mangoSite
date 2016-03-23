package forMangoSite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSite {

	public static boolean testResult = true;
	public static Properties props = new Properties();
	public static ChromeDriver driver;
	public TestSite() {
		setCurrPath();
	}

	public static void main(String[] args) throws InterruptedException,
			IOException {
		TestSite ob = new TestSite();

		try {
			ob.loadParams(); 
			ob.startDriver(); 
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}

		try {
			ob.goToPage("(//a[contains(@href, '/products/virtualnaya_ats')])[6]",
					"//a[contains(@href, '/products/virtualnaya_ats/functions')]" ,
					"������� �������� ������� ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/virtualnaya_ats/functions')]",
					"//a[contains(@href, '/application/biznes_resheniya')]", 
					"���������� �������� ����������� ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/application/biznes_resheniya')]",
					"//a[contains(@href, '/tariffs/vpbx')]", 
					"���������� �������� ������� ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/vpbx')]",
					"//a[contains(@href, '/tariffs/vpbx_detail')]", 
					"��������� ����������� ��� MANGO OFFICE");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/vpbx_detail')]",
					"//a[contains(@href, '/tariffs/numbers')]", 
					"��������� ����������� ��� ��������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/numbers')]",
					"//a[contains(@href, '/products/stoimost_nomera_8800')]", 
					"������ ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/stoimost_nomera_8800')]",
					"//a[contains(@href, '/tariffs/connection')]", 
					"������ 8-800");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/connection')]",
					"//a[contains(@href, '/tariffs/8800')]", 
					"������ �� �����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/8800')]",
					"//a[contains(@href, '/tariffs/call-center')]", 
					"������ �� ����� (8-800)");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/call-center')]",
					"//a[contains(@href, '/products/virtualnaya_ats/support_clients')]", 
					"�������������� ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
	
		try {
			ob.goToPage("//a[contains(@href, '/products/virtualnaya_ats/support_clients')]",
					"//a[contains(@href, '/products/CRM')]", 
					"���������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/CRM')]",
					"//a[contains(@href, '/products/CRM/functions')]", 
					"������� CRM");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/CRM/functions')]",
					"//a[contains(@href, '/products/CRM/resheniya/uchet_klientov')]", 
					"����������� CRM");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/CRM/resheniya/uchet_klientov')]",
					"//a[contains(@href, '/tariffs/crm')]", 
					"������� CRM");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/tariffs/crm')]",
					"//a[contains(@href, '/products/CRM/support_clients/settings')]", 
					"��������� CRM");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/CRM/support_clients/settings')]",
					"//a[contains(@href, '/products/call_centre')]", 
					"��������� CRM");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/call_centre')]",
					"//a[contains(@href, '/products/call_centre/functions')]", 
					"������� ���");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/call_centre/functions')]",
					"//a[contains(@href, '/products/call_centre/resheniya')]", 
					"����������� ���");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/call_centre/resheniya')]",
					"//a[contains(@href, '/products/call_centre/tariffs')]", 
					"������� ���");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/call_centre/tariffs')]",
					"//a[contains(@href, '/products/call_centre/support_clients/spravochniki-abonenta')]", 
					"��������� ���");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/products/call_centre/support_clients/spravochniki-abonenta')]",
					"//a[contains(@href, '/about/contact_data/moskva')]", 
					"��������� ���");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/about/contact_data/moskva')]",
					"//a[contains(@href, '/shop/products')]", 
					"��������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		} 
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/products')]",
					"//a[contains(@class, 'btn-enter')]", 
					"��");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.loginIM();
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		} 
		
		try {
			ob.goToPage("(//a[contains(@href, 'https://lk.mango-office.ru/')])[2]",
					 "//a[@id='menu-products']", 
					"������� � ��");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}

		try {
			ob.goToPageOverHover("//a[@id='menu-products']",
					"//a[contains(@href, '/shop')]", 
					"//a[contains(@href, '/shop')]", 
					"������� �� �� � ��");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("(//a[contains(@href, '/')])[3]",
					"//a[contains(@href, 'http://www.youtube.com/watch?v=tjSNYRKyA50&rel=0&controls=1&autoplay=1&width=840&height=515&background=#fff')]", 
					"������� �� ������� �����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, 'http://www.youtube.com/watch?v=tjSNYRKyA50&rel=0&controls=1&autoplay=1&width=840&height=515&background=#fff')]",
					"//a[@id='SLB-CloseButton']", 
					"�������� ����� �� �������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
			
		try {
			Thread.sleep(5000);	
			ob.goToPage("//a[@id='SLB-CloseButton']",
					"//a[contains(@href, '/shop/products')]", 
					"������� �����, ������� �� �������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.outsideCheck();
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		} 

		ob.printResult();
		driver.quit();

	}

	
	public void startDriver()
			throws InterruptedException, IOException {
		try{			
		if (isWin()) {	
			System.setProperty("webdriver.chrome.driver",
					"F:\\!AUTO\\driver\\chromedriver.exe");
		}else {
				   System.setProperty("webdriver.chrome.driver",
				     "//usr//bin//chromedriver");
				  }	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(props.getProperty("urlBasic")); 
		Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		appendToLog(currentTimestamp.toString());
		appendToLog(System.getProperty("os.name").toLowerCase());
		appendToLog("������� �������� ����� - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
		}	
	}
	
	public static boolean isWin() {
		  String OS = System.getProperty("os.name").toLowerCase();
		  return (OS.indexOf("win") >= 0);
		 }

	public void goToPage(String destination, String waitElement, String pageName)
			throws InterruptedException, IOException {		
		try{
		driver.findElement(By.xpath(destination)).click(); 
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(waitElement))); 
		appendToLog(pageName + " - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen(pageName);
			appendToLog(pageName + " - Fail");
		}	
	}
	
	public void goToPageOverHover (String hoverDestination, String destination, String waitElement, String pageName)
			throws InterruptedException, IOException {		
		try{
					Actions actions = new Actions(driver);
					actions.moveToElement( driver.findElement(By.xpath(hoverDestination)));
					actions.build().perform();
		driver.findElement(By.xpath(destination)).click(); 
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(waitElement))); 
		appendToLog(pageName + " - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen(pageName);
			appendToLog(pageName + " - Fail");
		}	
	}
	
	
	public void loginIM()
			throws InterruptedException, IOException {
		
		try{
		driver.findElementByXPath("//a[contains(@class, 'btn-enter')]").click();
		
		driver.findElementByXPath("//input[@name='USER_LOGIN']").sendKeys(props.getProperty("login"));

		driver.findElementByXPath("//input[@name='USER_PASSWORD']").sendKeys(props.getProperty("password"));

		driver.findElementByXPath("//input[@value='�����']").click();

		waitForElementAppear(By.xpath("//a[contains(@href, '?logout=yes')]"));
		appendToLog("����� �� - OK");
		}catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen("����� ��");
			appendToLog("����� �� - Fail");
		}		
	}

	public void outsideCheck() throws InterruptedException, IOException{
		try{
		driver.get(props.getProperty("urlServiceCheck")); 
		driver.findElementByXPath("//input[@name='url']").sendKeys(props.getProperty("urlCheck"));
		driver.findElementByXPath("//a[contains(text(),'������� 15 ���������')]").click(); // "//a[contains(text(),'������� ���')]"    // "//input[@id='ru20']"
		driver.findElementByXPath("//input[@name='free_test_but']").click();
		(new WebDriverWait(driver, 120))
		.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//td[@id='free_test_png']/img")));		
			if(isElementPresent("//img[@alt='������������� �� ������ ����� �����������']")){
				testResult = false;
				takeScreen("�������� ping");
				appendToLog("�������� ping - Fail");
			}
	
		}catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen("�������� ping");
			appendToLog("�������� ping - Fail");
		}		
	}
	
	
	public static boolean isElementPresent(String elem) { 		 
		  try { 			  
			  driver.findElementByXPath(elem);
		   
		   return true; } 
		  catch (NoSuchElementException e) { 		  
		   return false; } 
		 }
	

	public void printResult() throws IOException {
		if (testResult) {
			appendToLog("���� ������ �������");
		} else {
			appendToLog("���� ����������. ��������� ��������� � ��� ����");
		}

	}

	public void waitForElementAppear(By locator) {
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			testResult = false;
		}
	}


	private static void appendToLog(String logMessage) throws IOException {
		File log = new File("log.txt");
		FileWriter fw = new FileWriter(log, true);
		PrintWriter pw = new PrintWriter(fw, true);
		pw.println(logMessage);

		pw.close();
		fw.close();
	}

	

	public void loadParams() {

		InputStream is = null;

		try {
			File f = new File("res/config.properties");

			is = new FileInputStream(f);
		} catch (Exception e) {
			is = null;
		}

		try {

			props.load(is);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	protected void takeScreen(String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = getDestinationFile(filename);
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	private File getDestinationFile(String filename) {
		File f = new File(".");

		String absoluteFileName = f.getAbsolutePath() + "/ScreenShots/"
				+ filename + ".png";

		return new File(absoluteFileName);
	}

	private static void setCurrPath() {
		File dir = new File("");
		dir.getAbsolutePath();

	}


}
