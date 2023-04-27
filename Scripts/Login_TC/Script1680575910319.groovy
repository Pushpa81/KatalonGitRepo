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

Windows.setText(findWindowsObject('VIMP/UN Edit'), 'Administrator')

Windows.click(findWindowsObject('VIMP/EditPW '))

Windows.setText(findWindowsObject('VIMP/EditPW '), '123456')

Windows.click(findWindowsObject('VIMP/Edit Host'))

Windows.clearText(findWindowsObject('VIMP/Edit Host'))

Windows.setText(findWindowsObject('VIMP/Edit Host'), '192.168.22.15')

Windows.click(findWindowsObject('VIMP/Edit Port'))

Windows.clearText(findWindowsObject('VIMP/Edit Port'))

Windows.setText(findWindowsObject('VIMP/Edit Port'), '4011')

Windows.click(findWindowsObject('VIMP/Login Button '))

Windows.switchToWindowTitle('VI MonitorPlus')

Windows.click(findWindowsObject('Object Repository/VIMP/Close Button Main screen'))


