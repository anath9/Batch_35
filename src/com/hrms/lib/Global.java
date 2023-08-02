package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
//stdrule: To provide TestData & Objects relate to whole application
//********************TestData
	// DT Var VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String EFN = "selenium";
	public String ELN = "suresh";
//********************Objects/elements
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frame_empinfo = "rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_efn = "txtEmpFirstName";
	public String txt_eln = "txtEmpLastName";
	public String btn_save = "btnEdit";
	
}
