
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "login.login.CheckDropDownListElementExist"(
    	TestObject object	
     , 	String option	) {
    (new login.login()).CheckDropDownListElementExist(
        	object
         , 	option)
}

def static "login.login.LoginConfig"(
    	Object userName	
     , 	Object password	) {
    (new login.login()).LoginConfig(
        	userName
         , 	password)
}

def static "login.login.refreshBrowser"() {
    (new login.login()).refreshBrowser()
}

def static "login.login.clickElement"(
    	TestObject to	) {
    (new login.login()).clickElement(
        	to)
}

def static "login.login.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new login.login()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "login.login.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new login.login()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

def static "login.login.getCurrentSessionMobileDriver"() {
    (new login.login()).getCurrentSessionMobileDriver()
}

def static "login.login.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new login.login()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

def static "login.login.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new login.login()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}
