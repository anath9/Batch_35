package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC003 {
	public static void main(String args[]) {
		// Test Steps
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}
}


