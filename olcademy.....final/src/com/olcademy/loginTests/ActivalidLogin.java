package com.olcademy.loginTests;import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.olcademy.generic.BaseTest;
import com.olcademy.generic.FileLib;
import com.olcademy.generic.IAutoConsts;
import com.olcademy.generic.WebdriverCommonLib;
import com.olcademy.pages.LoginPage;

public class ActivalidLogin extends BaseTest implements IAutoConsts   {
	@Test
	public void logintest() throws Throwable  {
		LoginPage lp = new LoginPage(driver);
		FileLib flib = new FileLib();
		WebdriverCommonLib wlib = new WebdriverCommonLib();
		String url = flib.getPropkeyValue(PROP_PATH,"url");
		String username = flib.getPropkeyValue(PROP_PATH, "username");
		String password = flib.getPropkeyValue(PROP_PATH,"password");
		lp.login(username, password);
		Thread.sleep(10000);
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Olcademy | best online courses - online learning and teaching."));
		if(driver.getTitle().equals("Olcademy | best online courses - online learning and teaching.")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(15000);
		WebElement target=lp.getProf();
		wlib.mouseHover(target);
		Thread.sleep(4000);
		lp.setProf1();
		Thread.sleep(25000);	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		lp.setPersonaledit();
		Thread.sleep(2000);
		lp.setEntnum();
		String mob = flib.getPropkeyValue(PROP_PATH, "Mobno");
		lp.setEntnum(mob);
		Thread.sleep(2000);
		lp.setAddress();
		Thread.sleep(2000);
		String add = flib.getPropkeyValue(PROP_PATH, "Address");
		Thread.sleep(2000);
		lp.setAddress(add);
		Thread.sleep(2000);
		WebElement element=lp.getCountry();
		wlib.selectOption(element,"Hong Kong" );
		element.click();
		Thread.sleep(2000);
		lp.setSave1();
		Thread.sleep(2000);
		lp.setShortbio();
		Thread.sleep(2000);
		lp.getShortbioedit().click();
		Thread.sleep(2000);
		lp.getShortbiowrite().click();
		Thread.sleep(2000);
		lp.getSave().click();
		Thread.sleep(7000);
		lp.getInshort().click();
		lp.getTpte().click();
		Thread.sleep(2000);
		lp.setSocial();
		Thread.sleep(2000);
		lp.setSociallink();
		Thread.sleep(2000);
		String link1 = flib.getPropkeyValue(PROP_PATH, "link");
		Thread.sleep(2000);
		lp.setSociallink(link1);
		Thread.sleep(2000);
		Thread.sleep(2000);
		lp.setDigital();
		Thread.sleep(2000);
		lp.setSignbutton();
		Thread.sleep(2000);
		lp.setSkill();
		lp.setEnterskill();
		String addskill = flib.getPropkeyValue(PROP_PATH, "course");
		lp.setEnterskill(addskill);
		Thread.sleep(2000);
		lp.setRateing();
		Thread.sleep(2000);
		lp.setSkilladd();
		lp.setEduction();
		lp.setPlus();
		String name = flib.getPropkeyValue(PROP_PATH,"clgname");
		lp.setInstitute(name);
		lp.setCourse();
		String cor = flib.getPropkeyValue(PROP_PATH,"sub");
		lp.setCourse(cor);
		lp.setGrade();
		Thread.sleep(2000);
		lp.setFrom();
		Thread.sleep(2000);
		String date = flib.getPropkeyValue(PROP_PATH, "Date");
		Thread.sleep(2000);
		lp.setTextDate(date);
		Thread.sleep(2000);
		lp.setTo();
		Thread.sleep(2000);
		String d1 = flib.getPropkeyValue(PROP_PATH, "Date1");
		Thread.sleep(2000);
		lp.setText2(d1);
		Thread.sleep(2000);
		lp.setAddedu();
		Thread.sleep(2000);
		lp.setExprienc();
		Thread.sleep(2000);
		lp.setExpplus();
		Thread.sleep(2000);
		lp.setDesignation();
		Thread.sleep(2000);
		String jo = flib.getPropkeyValue(PROP_PATH, "job");
		Thread.sleep(2000);
		lp.setDesignation(jo);
		Thread.sleep(2000);
		lp.setCompany();
		Thread.sleep(2000);
		String co = flib.getPropkeyValue(PROP_PATH, "company1");
		Thread.sleep(2000);
		lp.setCompany(co);
		Thread.sleep(2000);
		lp.setFrom1();
		Thread.sleep(2000);
		lp.setAdd2();
		Thread.sleep(2000);
		String date2 = flib.getPropkeyValue(PROP_PATH, "Date");
		Thread.sleep(2000);
		lp.setTextDate2(date2);
		Thread.sleep(2000);
		lp.setTo2();
		Thread.sleep(2000);
		lp.setAdd2();
		Thread.sleep(2000);
		lp.setAcc();
		Thread.sleep(2000);
		lp.setAccplush();
		Thread.sleep(2000);
		lp.setCertiname();
		Thread.sleep(2000);
		String cer = flib.getPropkeyValue(PROP_PATH, "certificat");
		Thread.sleep(2000);
		lp.setCertiname(cer);
		Thread.sleep(2000);
		lp.setAuthority();
		Thread.sleep(2000);
		String auth = flib.getPropkeyValue(PROP_PATH, "inst");
		Thread.sleep(2000);
		lp.setAuthority(auth);
		Thread.sleep(2000);
		lp.setLink();
		Thread.sleep(2000);
		String al = flib.getPropkeyValue(PROP_PATH, "applink");
		Thread.sleep(2000);
		lp.setLink(al);
		Thread.sleep(2000);
		lp.setPlace();
		Thread.sleep(2000);
		String city = flib.getPropkeyValue(PROP_PATH, "Town");
		Thread.sleep(2000);
		lp.setPlace(city);
		Thread.sleep(2000);
		lp.setFrom3();
		Thread.sleep(2000);
		String da = flib.getPropkeyValue(PROP_PATH, "to1");
		Thread.sleep(2000);
		lp.setFrom3(da);
		Thread.sleep(2000);
		lp.setAdd4();
		lp.setPro();
		lp.setProplus();
		String pro = flib.getPropkeyValue(PROP_PATH, "pro1");
		lp.setProname(pro);
		WebElement member = lp.getTeam();
		wlib.selectOption(member, "4");
		member.click();
		lp.setFrom5();
		String dt = flib.getPropkeyValue(PROP_PATH, "day");
		lp.setFrom5(dt);
		lp.setTo5();
		String sel = flib.getPropkeyValue(PROP_PATH, "select");
		lp.setTo5(sel);
		lp.setDes();
		String st = flib.getPropkeyValue(PROP_PATH, "story");
		lp.setDes(st);
		lp.setAddpro();
//		lp.setStudentCer();
//	    org.openqa.selenium.Alert al1=driver.switchTo().alert();
//		al1.accept();
		lp.setCoursetab();
		lp.setInst();
	}

}	