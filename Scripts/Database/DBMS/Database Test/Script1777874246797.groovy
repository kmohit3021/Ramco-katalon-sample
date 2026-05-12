import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.Connection
import java.sql.ResultSet

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Connection globalConnection
ResultSet rs

// Get DB connection
globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

// Execute query
rs = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(
	globalConnection, 
	'select * from katalontesttable'
)

println('Result Set ----->> ' + rs)

// Row & Column count
int rowno = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(rs)
int colno = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount'(rs)

println('Row count ----->> ' + rowno)
println('Column count ----->> ' + colno)

// Get single row value
String rowValue = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue'(rs, 2)
println('Row value ----->> ' + rowValue)

// Loop through DB values
for (int i = 1; i <= rowno; i++) {
	for (int j = 1; j <= colno; j++) {

		String valDB = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(rs, i, j)

		KeywordUtil.logInfo('DB Value is:- ' + valDB)
	}
}
