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

WebUI.navigateToUrl('https://www.meupatrocinio.com/')

WebUI.click(findTestObject('Page_Meu Patrocnio - Maior Rede Soc/span_CADASTRE-SE'))

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/label_Eu Concordo'))

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/a_Aceito os termos e quero me'))

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/input_email'), 'xxxxxxxx1@mailinator.com')

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/input_re_email'), 'xxxxxxxx1@mailinator.com')

WebUI.setEncryptedText(findTestObject('Page_Relacionamento On-Line no Meu/input_password'), '5KoopPb8DV4=')

WebUI.setEncryptedText(findTestObject('Page_Relacionamento On-Line no Meu/input_re_password'), '5KoopPb8DV4=')

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu /a_1'))

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_GneroMasculinoFeminino'), '1', true)

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/input_extendedwhat'))

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/input_match_sex'))

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_-- Como ouviu falar sob'), '4096', true)

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/button_Continuar'))

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/button_Confirmar e avanar'))

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Estado AcreAlagoasAmapa'), 'Sao Paulo', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Cidade So PauloAdamanti'), 'São Paulo', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_A sua AlturaMenor que 1'), '1048576', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Tipo de CorpoMagroMedio'), '32', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Seu Tom de PeleBranco'), '2048', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Cor de Cabelo RuivoCalv'), '256', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Cor dos OlhosNegroAzulC'), '32', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Voc fumaNuncaRaramenteS'), '64', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Voc BebeNuncaRaramenteS'), '64', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Estado CivilSolteiro(a)'), '16', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Tem FilhosNo12345 ou ma'), '32', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Formao Acadmica2o grauT'), '128', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Qual  a sua ProfissoAdm'), '67108864', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Renda MensalR10.000 ou'), '128', true)

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Patrimnio PessoalMenos'), '1024', true)

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/button_Continuar'))

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/input_username'), 'xxxxxxxxxxxx1')

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/input_headline'), 'Olá')

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/textarea_general_description'), 'Olá')

WebUI.selectOptionByValue(findTestObject('Page_Relacionamento On-Line no Meu/select_Expectativa do Estilo d'), '32', true)

WebUI.setText(findTestObject('Page_Relacionamento On-Line no Meu/textarea_extendeddescription'), 'Olá')

WebUI.click(findTestObject('Page_Relacionamento On-Line no Meu/button_Continuar'))

