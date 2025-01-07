import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.proceedToCheckoutAndEnterEmail
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Hover over item object2.png')

"Step 3: Click on link Apple -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link Apple - Navigate to page category pagecategory.png')

"Step 4: Click on button addToCart (AddToCartUpdate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button addToCart AddToCartUpdate.png')

"Step 5: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on label storageColorOptions 512GB.png')

"Step 6: Click on label storageColorOptions (Storage256GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on label storageColorOptions Storage256GB2.png')

"Step 7: Click on label storageColorOptions (512GB3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_2, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on label storageColorOptions 512GB3.png')

"Step 8: Click on label storageColorOptions (BlueUpdate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_3, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on label storageColorOptions BlueUpdate.png')

"Step 9: Click on button Buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button Buy2.png')

"Step 10: Click on link iPhone15Updated -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_iPhone15Updated'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on link iPhone15Updated - Navigate to page productproduct.png')

"Step 11: Click on label colorVariant (GBUpdate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorVariant"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorVariant', ['label_colorVariant_for': label_colorVariant_for, 'label_colorVariant_internalText': label_colorVariant_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on label colorVariant GBUpdate.png')

"Step 12: Click on label colorVariant (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorVariant"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorVariant', ['label_colorVariant_for': label_colorVariant_for_1, 'label_colorVariant_internalText': label_colorVariant_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on label colorVariant Blue.png')

"Step 13: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on button Buy.png')

"Step 14: Click on link PlaceOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on link PlaceOrder.png')

"Step 15: Proceed to checkout and enter email information"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Hover over div object.png')

"Step 17: Click on input FirstName5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on input FirstName5.png')

"Step 18: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Hover over div object2.png')

"Step 19: Enter input value in input FirstName5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_FirstName5'), input_FirstName5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Enter input value in input FirstName5.png')

"Step 20: Click on input LastName5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_LastName5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on input LastName5.png')

"Step 21: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Hover over div object3.png')

"Step 22: Enter input value in input LastName5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_LastName5'), input_LastName5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Enter input value in input LastName5.png')

"Step 23: Click on input ZipCode5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on input ZipCode5.png')

"Step 24: Hover over div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Hover over div object4.png')

"Step 25: Enter input value in input ZipCode6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode5'), input_ZipCode6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Enter input value in input ZipCode6.png')

"Step 26: Click on input Address5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Address5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on input Address5.png')

"Step 27: Hover over div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Hover over div object5.png')

"Step 28: Enter input value in input Address6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Address5'), input_Address6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Enter input value in input Address6.png')

"Step 29: Click on input City3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_City3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on input City3.png')

"Step 30: Hover over div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Hover over div object6.png')

"Step 31: Enter input value in input City4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_City3'), input_City4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Enter input value in input City4.png')

"Step 32: Click on input ShippingState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ShippingState'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on input ShippingState.png')

"Step 33: Hover over div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Hover over div object7.png')

"Step 34: Enter input value in input State3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ShippingState'), input_State3)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Enter input value in input State3.png')

"Step 35: Click on input Phone3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Phone3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on input Phone3.png')

"Step 36: Enter input value in input Phone4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Phone3'), input_Phone4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Enter input value in input Phone4.png')

"Step 37: Click on button ContinueToFinalPayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_ContinueToFinalPayment'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on button ContinueToFinalPayment.png')

"Step 38: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Hover over div object.png')

"Step 39: Click on input FirstName6 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on input FirstName6 - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Checkout Process for iPhone with Multiple Color Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}