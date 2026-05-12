package webKeywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject


public class ApplicationFunction {
	
	@Keyword
	def static TestObject GetTableValue(int rowIndex, int colIndex) {
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, ".//*[@class='w3-example']//table//tr["+rowIndex+"]/td["+colIndex+"]")
		return to
	}
}
