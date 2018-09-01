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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://admin.meupatrocinio.com/admin/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Page_Admin Panel/input_username'), 'hewerthon')

WebUI.setEncryptedText(findTestObject('Admin/Page_Admin Panel/input_password'), 'Q17sLWflGo8VFhyBsAU7eFSbZm6eo8kN')

WebUI.click(findTestObject('Admin/Page_Admin Panel/input_login'))

for (def row = 1; row <= findTestData('ProfileID').getRowNumbers(); row++) {
    WebUI.navigateToUrl(findTestData('ProfileID').getValue('Profile', row))

    WebUI.click(findTestObject('Admin/Page_Admin Panel/Jump'))

    WebUI.navigateToUrl('https://admin.meupatrocinio.com/member/new_members_list.php')

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_1'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_2'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_3'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_4'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_5'))

    WebUI.navigateToUrl('https://admin.meupatrocinio.com/member/new_members_list.php?page=2')

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_6'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_7'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_8'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_9'))

    WebUI.navigateToUrl('https://admin.meupatrocinio.com/member/location_list.php?mode=state&distance=1')

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_10'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_11'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_12'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_13'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_14'))

    WebUI.navigateToUrl('https://admin.meupatrocinio.com/member/location_list.php?mode=state&distance=1&page=2')

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_15'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_16'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_17'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_18'))

    WebUI.back(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Profile Hoppings/Page_Membros Novos/img_profile_thumb_19'))
}

WebUI.closeBrowser()

