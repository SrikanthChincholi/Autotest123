package ashokitmaven.ashokitmaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	static WebDriver d;

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println("Sample Test Class");
		d.quit();
	}

	@Test
	public void test2() {
		d = new FirefoxDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println("Sample Test Class");
		d.quit();
	}

	@Test
	public void test3() {
		d = new EdgeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println("Sample Test Class");
		d.quit();
	}
	
//	@Test
	public void readDataFromExcel() throws Exception
	{
		FileInputStream fis = new FileInputStream(".//DataFiles//LoginData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Login");
		
	}
}
