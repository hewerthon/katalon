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

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/a_Visibilidade'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/label_Perfil visvel (painel e '))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/p_Seu perfil est oculto na pes'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/main_NotificaesUsurios bloquea'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Desativar conta'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/p_Olse apertar este boto o seu'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/select_Informe o motivo para d'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/small_OBS os membros Premium c'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/small_Ao desativar a conta o p'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Desativar conta'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/h1_Login'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/p_Sua conta estava cancelada e'))

WebUI.setText(findTestObject('Configuracao/Page_Meu Patrocnio/input_form-control ng-untouche (1)'), 'HWSDMV2')

WebUI.setText(findTestObject('Configuracao/Page_Meu Patrocnio/input_form-control ng-pristine'), 'mp2016')

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Entrar'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_Fechar'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/button_dropdownaccount'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/a_Configuraes'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/a_Visibilidade'))

WebUI.click(findTestObject('Object Repository/Configuracao/Page_Meu Patrocnio/label_Perfil visvel (painel e '))

WebUI.closeBrowser()

