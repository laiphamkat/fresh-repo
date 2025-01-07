package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectItemAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))
        
        "Step 2: Click on link Apple -> Navigate to page 'category page#category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))
        
        "Step 3: Click on button AddToCart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_AddToCart'))
        
        "Step 4: Click on label colorStorageOption (StorageOption1TB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText']]))
        
        "Step 5: Click on label colorStorageOption (Color)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for_1'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText_1']]))
        
        "Step 6: Click on button Buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_colorStorageOption_for'] = testData.getValue('label_colorStorageOption_for', rowIndex)
        data['label_colorStorageOption_for_1'] = testData.getValue('label_colorStorageOption_for_1', rowIndex)
        data['label_colorStorageOption_internalText'] = testData.getValue('label_colorStorageOption_internalText', rowIndex)
        data['label_colorStorageOption_internalText_1'] = testData.getValue('label_colorStorageOption_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_colorStorageOption_for'] = 'default_data'
        data['label_colorStorageOption_for_1'] = 'default_data'
        data['label_colorStorageOption_internalText'] = 'default_data'
        data['label_colorStorageOption_internalText_1'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

