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

import java.nio.file.Path
import java.nio.file.Paths

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor

import com.kazurayam.ks.reporting.ReportUtilHacked
import com.kazurayam.ks.reporting.ReportsDirUtil
import com.kms.katalon.core.logging.TestSuiteXMLLogParser
import com.kms.katalon.core.logging.model.TestSuiteLogRecord
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

ReportsDirUtil rdu = new ReportsDirUtil(Paths.get("./Reports"))

// find the directory where the report of latest execution of Test Suite "TS1"
Path reportDir = rdu.getLatestTestSuiteReportDirOf("TS2_Test Cloud")

IProgressMonitor monitor = new NullProgressMonitor()

TestSuiteXMLLogParser logParser = new TestSuiteXMLLogParser()

// parse the "execution0.log" file to consume as input of the report
TestSuiteLogRecord suiteLogEntity = logParser.readTestSuiteLogFromXMLFiles(reportDir.toString(), monitor)

File outFolder = new File("19June WebReports-TestCloud")

/*
 * compile a Test Suite report in the format slightly modified
 */
ReportUtilHacked.writeHtmlReport(suiteLogEntity, outFolder)
//ReportUtil.writeHtmlReport(suiteLogEntity, outFolder)

WebUI.comment("output ${outFolder.toString()}")