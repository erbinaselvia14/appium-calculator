package com.juaracoding.appium.calculator.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.calculator.pages.CalculatorAdd;
import com.juaracoding.appium.calculator.pages.CalculatorBagi;
import com.juaracoding.appium.calculator.pages.CalculatorKali;
import com.juaracoding.appium.calculator.pages.CalculatorKurang;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	private AndroidDriver<MobileElement> driver;
	private CalculatorAdd calculatorAdd;
	private CalculatorKurang calculatorKurang;
	private CalculatorBagi calculatorBagi;
	private CalculatorKali calculatorKali;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "samsung SM-A305f");
		capabilities.setCapability("uuid", "RR8M30GTKRY");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platFormVesion", "11.0");
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		//"http://localhost:4723/wd/hub"
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
	
	@BeforeMethod
	public void pageObject() {
		calculatorAdd = new CalculatorAdd(driver);
		calculatorKurang = new CalculatorKurang(driver);
		calculatorBagi = new CalculatorBagi(driver);
		calculatorKali = new CalculatorKali(driver);
	}

	@Test(priority=1)
	public void testAdd() {
		calculatorAdd.clickCalculatorAdd();;
		System.out.println("Hasilnya: " + calculatorAdd.getTxtResultAdd());
		assertEquals(calculatorAdd.getTxtResultAdd(), "3");
		calculatorAdd.clickBtnHapus();
	}
	
	@Test(priority=2)
	public void testKurang() {
		calculatorKurang.clickCalculatorKurang();
		System.out.println("Hasilnya: " + calculatorKurang.getTxtResultKurang());
		assertEquals(calculatorKurang.getTxtResultKurang(), "6");
		calculatorKurang.clickBtnHapus();
	}
	
	@Test(priority=3)
	public void testKali() {
		calculatorKali.clickCalculatorKali();
		System.out.println("Hasilnya: " + calculatorBagi.getTxtResultBagi());
		assertEquals(calculatorBagi.getTxtResultBagi(), "3");
		calculatorBagi.clickBtnHapus();
	}
	
	@Test(priority=4)
	public void testBagi() {
		calculatorBagi.clickCalculatorBagi();;
		System.out.println("Hasilnya: " + calculatorKali.getTxtResultKali());
		assertEquals(calculatorKali.getTxtResultKali(), "32");
		calculatorBagi.clickBtnHapus();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
