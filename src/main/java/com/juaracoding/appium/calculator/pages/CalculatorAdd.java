package com.juaracoding.appium.calculator.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorAdd {
	
	private AndroidDriver<MobileElement> driver;
	
	public CalculatorAdd(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"1\"]")
	private MobileElement btnSatu;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"2\"]")
	private MobileElement btnDua;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Plus\"]")
	private MobileElement btnAdd;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Setara\"]")
	private MobileElement btnSamaDengan;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"3 Hasil penghitungan\"]")
	private MobileElement txtHasilTambah;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Backspace Tombol\"]")
	private MobileElement btnHapus;
	
	//method
	public void clickCalculatorAdd() {
		btnSatu.click();
		btnAdd.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public String getTxtResultAdd() {
		return txtHasilTambah.getText();
	}
	
	public void clickBtnHapus() {
		btnHapus.click();
	}
	
}
