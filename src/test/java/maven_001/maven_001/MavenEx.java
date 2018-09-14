package maven_001.maven_001;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class MavenEx {
		public  WebDriver driver;
	   @BeforeMethod
	   public void launchapp()
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver =new ChromeDriver();
		   driver.get("http://newtours.demoaut.com/");
		   
	   }
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	@Test
	public void signon()
	{
	boolean status=	driver.findElement(By.xpath("//a[text()='SIGN-ON']")).isDisplayed();
		Assert.assertEquals(true,status);
	}
	@Test
	public void register()
	{
	boolean status=	driver.findElement(By.xpath("//a[text()='REGISTER']")).isDisplayed();
		Assert.assertEquals(true,status);
	}
	@Test
	public void support()
	{
	boolean status=	driver.findElement(By.xpath("//a[text()='SUPPORT']")).isDisplayed();
		Assert.assertEquals(true,status);
	}
		@Test
		public void contact()
		{
		boolean status=	driver.findElement(By.xpath("//a[text()='CONTACT']")).isDisplayed();
			Assert.assertEquals(true,status);
		}
	}



