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

Windows.startApplicationWithTitle('C:\\Program Files\\VI Enterprise\\VI MonitorPlus\\VIMonitorPlus.exe', '')

Windows.click(findWindowsObject('VIMP/UN Edit'))

Windows.clearText(findWindowsObject('VIMP/UN Edit'))

Windows.setText(findWindowsObject('VIMP/UN Edit'), 'administrator')

Windows.click(findWindowsObject('Object Repository/VIMP/EditPW '))

Windows.setText(findWindowsObject('Object Repository/VIMP/EditPW '), '123456')

Windows.click(findWindowsObject('Object Repository/VIMP/ConnectionType-ComboBox'))

Windows.click(findWindowsObject('Object Repository/VIMP/Primary-Server'))

Windows.click(findWindowsObject('Object Repository/VIMP/Edit Host'))

Windows.clearText(findWindowsObject('Object Repository/VIMP/Edit Host'))

Windows.setText(findWindowsObject('Object Repository/VIMP/Edit Host'), '192.168.22.15')

Windows.click(findWindowsObject('Object Repository/VIMP/Edit Port'))

Windows.clearText(findWindowsObject('Object Repository/VIMP/Edit Port'))

Windows.setText(findWindowsObject('Object Repository/VIMP/Edit Port'), '4011')

Windows.click(findWindowsObject('Object Repository/VIMP/Login Button '))

Windows.switchToWindowTitle('VI MonitorPlus')

//Windows.click(findWindowsObject('Object Repository/VIMP/Text-Administator'), FailureHandling.STOP_ON_FAILURE)
//Windows.getText(findWindowsObject('VIMP/Text-Administator'), FailureHandling.STOP_ON_FAILURE)
assert Windows.verifyElementAttributeValue(findWindowsObject('Object Repository/VIMP/Text-Administator'), 'Name', 'Administrator', 
    0) : 'element not displayed'

Windows.startApplicationWithTitle('C:\\Program Files\\VI Enterprise\\VI MonitorPlus\\VIMonitorPlus.exe', 'VIMonitorPlus')

