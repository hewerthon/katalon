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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Facebook/Page_Facebook  entre ou cadastre-se/input_email'), 'hewerthon.teste@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook/Page_Facebook  entre ou cadastre-se/input_pass'), 'D/B4/A5fBiyz1PKUBheXaA==')

WebUI.click(findTestObject('Facebook/Page_Facebook  entre ou cadastre-se/input_u_0_2'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl('https://www.facebook.com/profile.php?id=100005698395216')

WebUI.mouseOver(findTestObject('Facebook/Page_Facebook/div__1mf _1mj'))

WebUI.click(findTestObject('Facebook/Page_Facebook/div_Teste mp comentrios'))

WebUI.setText(findTestObject('Facebook/Page_Facebook/div_Teste mp comentrios'), 'Olá mp aqui')

WebUI.mouseOver(findTestObject('Facebook/Page_Facebook/a_Curtir'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/button_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div__1mf _1mj_1'))

WebUI.setText(findTestObject('Object Repository/Facebook/Page_Facebook/div__1mf _1mj_1'), 'Olá mp aqui')

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/button_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div__1mf _1mj_2'))

WebUI.setText(findTestObject('Facebook/Page_Facebook/div__1mf _1mj_2'), 'Olá mp aqui')

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/button_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div__1mf _1mj_3'))

WebUI.setText(findTestObject('Facebook/Page_Facebook/div__1mf _1mj_3'), 'Olá mp aqui')

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/button_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Ol'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/a_Curtir'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Amei'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Haha'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Uau'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Triste'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/div_Grr'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/a_Pgina inicial'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook/span_Hewerthon'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/div__1mf _1mj'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/button_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/div__1mf _1mj_1'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/span_Publicar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/a_Fechar'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/i_img sp_X_Umd23nXEw sx_a9f436'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/a_u_56_b'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/a_u_56_b'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/span_Excluir'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/button_Excluir'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/a_u_fetchstream_9_w'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/span_Excluir'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_Hewerthon Souza/button_Excluir'))

