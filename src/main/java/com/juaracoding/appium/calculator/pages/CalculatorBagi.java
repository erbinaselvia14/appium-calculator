package com.juaracoding.appium.calculator.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorBagi {
	
	private AndroidDriver<MobileElement> driver;
	
	public CalculatorBagi(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"6\"]")
	private MobileElement btnEnam;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"2\"]")
	private MobileElement btnDua;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Pembagian\"]")
	private MobileElement btnBagi;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Setara\"]")
	private MobileElement btnSamaDengan;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"3 Hasil penghitungan\"]")
	private MobileElement txtHasilBagi;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Backspace Tombol\"]")
	private MobileElement btnHapus;
	
	//method
	public void clickCalculatorBagi() {
		btnEnam.click();
		btnBagi.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public String getTxtResultBagi() {
		return txtHasilBagi.getText();
	}
	
	public void clickBtnHapus() {
		btnHapus.click();
	}
}
