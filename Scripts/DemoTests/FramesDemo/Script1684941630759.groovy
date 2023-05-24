import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html')

WebUI.click(findTestObject('Object Repository/Page_Overview/a_AbstractDriverOptions'))

WebUI.click(findTestObject('Object Repository/Page_AbstractDriverOptions/a_AbstractHttpResponseCodec'))

WebUI.click(findTestObject('Object Repository/Page_AbstractHttpResponseCodec/a_AddHasCdp'))

WebUI.click(findTestObject('Object Repository/Page_AddHasCdp/li_AddSecretFilter'))

WebUI.click(findTestObject('Object Repository/Page_AddHasCdp/a_AddSecretFilter'))

WebUI.click(findTestObject('Object Repository/Page_AddSecretFilter/a_AddWebStorage'))

WebUI.closeBrowser()

