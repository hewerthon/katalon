import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'login.login.LoginConfig'(findTestData('Login').getValue(1, 2), findTestData('Login').getValue(3, 2))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/a_Mudar e-mail'))

WebUI.setText(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/input_email01'), 'hewerthon.teste+HWSDMV2@outlook.com')

WebUI.setText(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/input_email02'), 'hewerthon.teste+HWSDMV2@outlook.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/input_password'), '5KoopPb8DV4=')

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Atualizar e-mail'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Fechar'))

WebUI.closeBrowser()

