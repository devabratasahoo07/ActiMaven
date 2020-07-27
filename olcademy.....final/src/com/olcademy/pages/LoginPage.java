package com.olcademy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olcademy.generic.BaseTest;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(Idriver, this);
	}
	@FindBy(id="emailin")
	WebElement txtUserName;
 
	@FindBy(id="passin")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id="captcha_code1")
	@CacheLookup
	WebElement txtCaptcha;

	@FindBy(name="submit1")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(xpath="//img[contains(@class,'profile-pic')]")
	@CacheLookup
    WebElement Prof;
//Click on profile
	@FindBy(xpath="(//a[@class='profileList'])[1]")
	@CacheLookup
    WebElement Prof1;
	
	@FindBy(xpath="(//i[@class='far fa-edit'])[1]")
	@CacheLookup
	WebElement Personaledit;
	
	@FindBy(id="mbNumber")
	@CacheLookup
	WebElement entnum;
	
	@FindBy(id="place")
	@CacheLookup
	WebElement Address;
	
	@FindBy(id="country")
	@CacheLookup
	WebElement country;
	
	@FindBy(id="saveOverview")
	@CacheLookup
	WebElement Save1;
	
	@FindBy(id="shortBio")
	@CacheLookup
	WebElement shortbio;
	
	@FindBy(id="summaryCon")
	@CacheLookup
	WebElement shortbiowrite;
	
	@FindBy(id="summaryEdit")
	@CacheLookup
	WebElement shortbioedit;
	
	@FindBy(id="summarySave")
	@CacheLookup
	WebElement save;

	@FindBy(xpath="//button[@id='interest']")
	@CacheLookup
	WebElement inshort;
	
	@FindBy(id="addInterest")
	@CacheLookup
	WebElement tpte;
	
	@FindBy(xpath="(//i[@class='far fa-edit'])[1]")
	@CacheLookup
    WebElement aboutedit;
	/*
	 * Social Profile
	 */
	@FindBy(id="socialProfile")
	@CacheLookup
	WebElement social;
	
	@FindBy(name="ffirstname2")
	@CacheLookup
	WebElement sociallink;
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void txtCaptcha() {
		txtCaptcha.click();
	}

	public void txtSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
	public WebElement getProf() {
		return Prof;
	}
	public void setProf() {
		 Prof.click();
	}
	public WebElement getProf1() {
		return Prof1;
	}
	public void setProf1() {
		 Prof1.click();;
	}
	
	
	public WebElement getPersonaledit() {
		return Personaledit;
	}
	public void setPersonaledit() {
		Personaledit.click();;
	}
	public WebElement getEntnum() {
		return entnum;
	}
	public void setEntnum() {
		entnum.clear();;
	}
	public void setEntnum(String num) {
		entnum.sendKeys(num);
	}
	public WebElement getAddress() {
		return Address;
	}
	public void setAddress() {
		Address.clear();
	}
	public void setAddress(String Place) {
		Address.sendKeys(Place);
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry() {
		country.click();
	}
	public WebElement getSave1() {
		return Save1;
	}
	public void setSave1() {
		Save1.click();;
	}
	public WebElement getShortbio() {
		return shortbio;
	}
	public void setShortbio() {
		shortbio.click();
	}
	public WebElement getShortbiowrite() {
		return shortbiowrite;
	}
	public void setShortbiowrite(WebElement shortbiowrite) {
		this.shortbiowrite = shortbiowrite;
	}
	public WebElement getShortbioedit() {
		return shortbioedit;
	}
	public void setShortbioedit(String string) {
		 shortbioedit.sendKeys(string);;
	}
	public WebElement getSave() {
		return save;
	}
	public void setSave(WebElement save) {
		this.save = save;
	}
	public WebElement getInshort() {
		return inshort;
	}
	public void setInshort(WebElement inshort) {
		this.inshort = inshort;
	}
	public WebElement getTpte() {
		return tpte;
	}
	public void setTpte(WebElement tpte) {
		this.tpte = tpte;
	}
	public WebElement getSocial() {
		return social;
	}
	public void setSocial() {
	social.click();
	}
	public WebElement getSociallink() {
		return sociallink;
	}
	public void setSociallink() {
		sociallink.clear();
	}
	public void setSociallink(String link) {
		sociallink.sendKeys(link);;
	}
	/*
	 * Digital Signature
	 */
	@FindBy(id="credential")
	@CacheLookup
	WebElement Digital;
	@FindBy(xpath="(//button[.='Digital Signature'])[2]")
	@CacheLookup
	WebElement signbutton;
	public WebElement getDigital() {
		return Digital;
}
	public void setDigital() {
		Digital.click();;
	}
	public WebElement getsignbutton() {
		return signbutton;
	}
	public void setSignbutton() {
		signbutton.click();;
	}
	/*
	 * skills
	 */
	@FindBy(xpath="//div[contains(@id,'skillsTab')]")
	@CacheLookup
	WebElement skill;
	public WebElement getSkill() {
		return skill;
	}
	public void setSkill() {
		skill.click();;
	}
	@FindBy(id="enterSkill")
	@CacheLookup
	WebElement enterskill;
	public WebElement getEnterskill() {
		return enterskill;
	}
	public void setEnterskill() {
		enterskill.clear();
	}
	public void setEnterskill(String Course) {
		enterskill.sendKeys(Course);
	}
	
	/*
	 * Add Rateing
	 */
	@FindBy(id="selfRating")
	@CacheLookup
	WebElement rateing;
	public WebElement getRateing() {
		return rateing;
	}
	public void setRateing() {
		rateing.click();;
	}
	/*
	 * Add
	 */
	@FindBy(id="skillAdd")
	@CacheLookup
	WebElement skilladd;
	public WebElement getSkilladd() {
		return skilladd;
	}
	public void setSkilladd() {
		skilladd.click();
	}
	/*
	 * Eduction
	 * Click on it 
	 */
	@FindBy(id="educationTab")
	@CacheLookup
	WebElement eduction;
	public WebElement getEduction() {
		return eduction;
	}
	public void setEduction() {
		 eduction.click();;
	}
	/*
	 * click on plus button
	 */
	@FindBy(xpath="(//i[@class='fas fa-plus-circle ourAdd'])[1]")
	@CacheLookup
	WebElement plus;
	public WebElement getPlus() {
		return plus;
	}
	public void setPlus() {
		 plus.click();;
	}
	/*
	 * institute
	 */
	@FindBy(id="modalInsAddEdu")
	@CacheLookup
	WebElement institute;
	public WebElement getInstitute() {
		return institute;
	}
	public void setInstitute() {
		institute.clear();;
	}
	public void setInstitute(String clgname ) {
		institute.sendKeys(clgname);;
	}
	/*
	 * Course
	 */
	@FindBy(xpath="//input[@id='modalCourseAddEdu']")
	@CacheLookup
	WebElement course;
	public WebElement getCourse() {
		return course;
	}
	public void setCourse() {
		course.clear();
	}
	public void setCourse(String sub) {
		course.sendKeys(sub);
	}
	/*
	 * Grade
	 */
	@FindBy(id="modalGradeAddEdu")
	@CacheLookup
	WebElement grade;
	public WebElement getGrade() {
		return grade;
	}
	public void setGrade() {
		grade.click();
	}
	/*
	 * From
	 */
	@FindBy(xpath="//input[@id='modalFromAddEdu']")
	@CacheLookup
	WebElement from;
	public WebElement getFrom() {
		return from;
	}
	public void setFrom() {
		from.click();
	}
	public void setTextDate(String Date) {
		from.sendKeys(Date);
	}
	/*
	 * to
	 */
	@FindBy(xpath="//input[@id='modalToAddEdu']")
	@CacheLookup
	WebElement to;
	public WebElement getTo() {
		return to;
	}
	public void setTo() {
		to.click();
	}
	
	public void setText2(String Date1) {
		to.sendKeys(Date1);
	}
	/*
	 * Add edu
	 */
	@FindBy(xpath="//button[@id='addEdu']")
	@CacheLookup
	WebElement addedu;
	public WebElement getAddedu() {
		return addedu;
	}
	public void setAddedu() {
		addedu.click();;
	}
	/*
	 * Exprience
	 */
	@FindBy(id="experienceTab")
	@CacheLookup
	WebElement exprienc;
	public WebElement getExprienc() {
		return exprienc;
	}
	public void setExprienc() {
		 exprienc.click();;
	}
	/*
	 * Exprience plus
	 */
	@FindBy(xpath="(//i[@class='fas fa-plus-circle ourAdd'])[2]")
	@CacheLookup
	WebElement expplus;
	public WebElement getExpplus() {
		return expplus;
	}
	public void setExpplus() {
		expplus.click();;
	}
	/*
	 * Designation
	 */
	@FindBy(id="modalAddDesigExp")
	@CacheLookup
	WebElement designation;
	public WebElement getDesignation() {
		return designation ;
	}
	public void setDesignation() {
		designation.clear();;
	}
	public void setDesignation(String job ) {
		designation.sendKeys(job);;
	}
	/*
	 * Company
	 */
	@FindBy(id="modalAddCompanyExp")
	@CacheLookup
	WebElement company;
	public WebElement getCompany() {
		return company;
	}
	public void setCompany() {
		company.click();
	}
	public void setCompany(String company1) {
		company.sendKeys(company1);
	}
	/*
	 * From1
	 */
	@FindBy(id="modalFromAddExp")
	@CacheLookup
	WebElement from1;

	public WebElement getFrom1() {
		return from1;
	}
	public void setFrom1() {
		 from1.click();
	}
	public void setTextDate2(String Date) {
		from.sendKeys(Date);
	}
	/*
	 * to2
	 */
	@FindBy(id="modalAddExpCheck")
	@CacheLookup
	WebElement to2;
	
	public WebElement getTo2() {
		return to2;
	}
	public void setTo2() {
		 to2.click();;
	}
	/*
	 * addexp
	 */
	@FindBy(id="addExp")
	@CacheLookup
	WebElement add2;
	public WebElement getAdd2() {
		return add2;
	}
	public void setAdd2() {
		add2.click();;
	}
	
	/*
	 * 
	 * accomplishment
	 */
	@FindBy(xpath="//div[@id='accomplishmentTab']")
	@CacheLookup
	WebElement acc;
	public WebElement getAcc() {
		return acc;
	}
	public void setAcc() {
		acc.click();;
	}
	/*
	 * accplush
	 */
	@FindBy(xpath="(//i[@class='fas fa-plus-circle ourAdd'])[3]")
	@CacheLookup
	WebElement accplush;
	public WebElement getAccplush() {
		return accplush;
	}
	public void setAccplush() {
		 accplush.click();;
	}
	/*
	 * Certification Name
	 */
	@FindBy(id="modalCertName")
	@CacheLookup
	WebElement certiname;
	
	public WebElement getCertiname() {
		return certiname;
	}
	public void setCertiname() {
		certiname.clear();;
	}
	public void setCertiname(String certificat) {
		certiname.sendKeys(certificat);;
	}
	/*
	 * Certification Authority
	 */
	@FindBy(id="modalCertAuth")
	@CacheLookup
	WebElement authority;
	
	public WebElement getAuthority() {
		return authority;
	}
	public void setAuthority() {
		authority.clear();;
	}
	public void setAuthority(String inst) {
		authority.sendKeys(inst);
	}
	/*
	 * Certificate Link
	 */
	@FindBy(id="modalCertUrl")
	@CacheLookup
	WebElement link;
	
	public WebElement getLink() {
		return link;
	}
	public void setLink() {
		link.clear();
	}
	public void setLink(String applink) {
		link.sendKeys(applink);
	}
	/*
	 * place
	 */
	@FindBy(id="modalCertPlace")
	@CacheLookup
	WebElement place;
	public WebElement getPlace() {
		return place;
	}
	public void setPlace() {
		place.clear();;
	}
	public void setPlace(String Town) {
		place.sendKeys(Town);
	}
	/*
	 * From
	 */
	@FindBy(id="modalCertFrom")
	@CacheLookup
	WebElement from3;
	public WebElement getFrom3() {
		return from3;
	}
	public void setFrom3() {
		from3.clear();
	}
	public void setFrom3(String date3) {
		from3.sendKeys(date3);
	}
	/*
	 * to
	 */
	@FindBy(id="modalCertTo")
	@CacheLookup
	WebElement to3;

	public WebElement getTo3() {
		return to3;
	}
	public void setTo3() {
		to3.clear();;
	}
	public void setTo3(String to1 ) {
		to3.sendKeys(to1);
	}
	/*
	 * add
	 */
	@FindBy(id="saveCert")
	@CacheLookup
	WebElement add4;
	
	public WebElement getAdd4() {
		return add4;
	}
	public void setAdd4() {
		add4.click();;
	}
	/*
	 * Project
	 */
	@FindBy(id="proj")
	@CacheLookup
	WebElement pro;
	public WebElement getPro() {
		return pro;
	}
	public void setPro() {
		 pro.click();;
	}
	/*
	 * proplus
	 */
	@FindBy(xpath="(//i[@class='fas fa-plus-circle ourAdd'])[4]")
	@CacheLookup
	WebElement proplus;
	public WebElement getProplus() {
		return proplus;
	}
	public void setProplus() {
		proplus.click();;
	}
	/*
	 * Project Name
	 */
	@FindBy(id="modalProjName")
	@CacheLookup
	WebElement proname;
	
	public WebElement getProname() {
		return proname;
	}
	public void setProname() {
		proname.click();;
	}
	public void setProname(String pro1) {
		proname.sendKeys(pro1);
	}
	/*
	 * Team
	 */
	@FindBy(id="modalProjTeam")
	@CacheLookup
	WebElement team;
	public WebElement getTeam() {
		return team;
	}
	public void setTeam() {
	team.click();;
	}
	/*
	 * From
	 */
	@FindBy(id="modalProjFrom")
	@CacheLookup
	WebElement from5;
	public WebElement getFrom5() {
		return from5;
	}
	public void setFrom5() {
	from5.click();;
	}
	public void setFrom5(String day) {
		from5.sendKeys(day);
		}
	/*
	 * to5
	 */
	@FindBy(id="modalProjTo")
	@CacheLookup
	WebElement to5;
	
	public WebElement getTo5() {
		return to5;
	}
	public void setTo5() {
	to5.click();;
	}
	public void setTo5(String select) {
		to5.sendKeys(select);
		}
	/*
	 * Description
	 */
	@FindBy(id="modalProjDesc")
	@CacheLookup
	WebElement des;
	public WebElement getDes() {
		return des;
	}
	public void setDes() {
		des.click();
	}
	public void setDes(String story) {
		des.sendKeys(story);
	}
	/*
	 * add pro
	 */
	@FindBy(id="addProj")
	@CacheLookup
	WebElement addpro;
	public WebElement getAddpro() {
		return addpro;
	}
	public void setAddpro() {
		addpro.click();;
	}
	/*
	 * Studnt Certification
	 */
	@FindBy(id="olc")
	@CacheLookup
	WebElement studentCer;
	public WebElement getStudentCer() {
		return studentCer;
	}
	public void setStudentCer() {
		studentCer.click();;
	}
	/*
	 * click Download
	 */
	@FindBy(xpath="(//i[@class='fa fa-download'])[1]")
	@CacheLookup
	WebElement down;
	public WebElement getDown() {
		return down;
	}
	public void setDown() {
		down.click();;
	}
	/*
	 * course Tab
	 */
	@FindBy(id="courseTab")
	@CacheLookup
	WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	public void setCoursetab() {
		coursetab.click();;
	}
	/*
	 * instructor
	 */
	@FindBy(id="teacher")
	@CacheLookup
	WebElement inst;
	public WebElement getInst() {
		return inst;
	}
	public void setInst() {
		inst.click();;
	}
	public void login(String uname, String pwd ) throws InterruptedException {
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		txtCaptcha.click();
		Thread.sleep(10000);
		btnSubmit.click();
		Thread.sleep(7000);
	
		
	}

}



