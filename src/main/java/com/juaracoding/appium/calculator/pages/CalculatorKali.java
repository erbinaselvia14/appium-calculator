package com.juaracoding.appium.calculator.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorKali {
	
	private AndroidDriver<MobileElement> driver;
	
	public CalculatorKali(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"8\"]")
	private MobileElement btnDelapan;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"4\"]")
	private MobileElement btnEmpat;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Perkalian\"]")
	private MobileElement btnKali;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Setara\"]")
	private MobileElement btnSamaDengan;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"32 Hasil penghitungan\"]")
	private MobileElement txtHasilKali;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Backspace Tombol\"]")
	private MobileElement btnHapus;
	
	//method
	public void clickCalculatorKali() {
		btnDelapan.click();
		btnKali.click();
		btnEmpat.click();
		btnSamaDengan.click();
	}

	public String getTxtResultKali() {
		return txtHasilKali.getText();
	}
	
	public void clickBtnHapus() {
		btnHapus.click();
	}
}
