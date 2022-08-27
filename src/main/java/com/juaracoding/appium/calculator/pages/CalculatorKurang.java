package com.juaracoding.appium.calculator.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorKurang {
	
	private AndroidDriver<MobileElement> driver;
	
	public CalculatorKurang(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"9\"]")
	private MobileElement btnSembilan;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"3\"]")
	private MobileElement btnTiga;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Minus\"]")
	private MobileElement btnKurang;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Setara\"]")
	private MobileElement btnSamaDengan;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"6 Hasil penghitungan\"]")
	private MobileElement txtHasilKurang;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Backspace Tombol\"]")
	private MobileElement btnHapus;
	
	//method
	public void clickCalculatorKurang() {
		btnSembilan.click();
		btnKurang.click();
		btnTiga.click();
		btnSamaDengan.click();
	}

	public String getTxtResultKurang() {
		return txtHasilKurang.getText();
	}
	
	public void clickBtnHapus() {
		btnHapus.click();
	}
}
