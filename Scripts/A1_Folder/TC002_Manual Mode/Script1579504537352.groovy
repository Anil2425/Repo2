import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_Password_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/span_Assign Leave'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/span_Leave List'), 3)

not_run: WebUI.uploadFile(findTestObject(null), '')

not_run: WebUI.sendKeys(findTestObject(null), '')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/span_Assign Leave'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input__assignleavetxtEmployeeempName'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/select_--Select--FMLA USMaternity USPaternity USVacation US'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input__assignleavetxtEmployeeempName'), 'joh')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/li_John Smith'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/img__ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_22'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input__assignBtn'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_OrangeHRM - Confirm Leave Assignment_confirmOkButton'))

WebUI.closeBrowser()

