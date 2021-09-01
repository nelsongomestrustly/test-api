package cucumber.api.tests.test.merchantdemo.data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * {
 *  active: true
 *  createdAt: 1629303857338
 *  description: "V4 default (system)"
 *  isDeleted: false
 *  lightboxCompletes: 0
 *  lightboxInitiates: 0
 *  merchantId: "110005514"
 *  paymentFlow:
 *          {
 *              deprecated: false
 *              description: "v79 - UI V4"
 *              number: 79
 *              uiParams: "{\"dynamicWidget\":{\"name\":\"bank_tiles\",\"text1\":\"ux.dynamicWidget.text1\",\"text1Color\":\"#000000\",\"text2\":\"ux.dynamicWidget.text2\",\"text2Color\":\"#6e6e6e\",\"text3Color\":\"#6e6e6e\",\"selectBankLabel\":\"ux.selectBank.title\",\"showTextForMobileAndDesktop\":false,\"selectYourBankColor\":\"#dc4c34\",\"learnMore\":{\"showLearnMore\":false,\"learnMoreColor\":\"#249dd6\",\"learnMoreDescription\":\"ux.learnMore.description\",\"learnMoreIconColor\":\"#249dd6\"},\"bankTilesConfiguration\":{\"numberOfHorizontalBanks\":3,\"numberOfVerticalBanks\":2,\"numberOfMobileBanks\":\"sameAsDesktop\"},\"bankButtonStyle\":\"squareEdges\",\"otherBanksType\":\"allOtherBanks\",\"otherBanksSubtitle\":\"ux.selectBank.thousandsAvailable\",\"bankButtonBackgroundColor\":\"#ffffff\",\"bankButtonHighlightColor\":\"#5c9dce\",\"bankButtonOutlineColor\":\"#e2e2e2\",\"bankButtonOutlineHover\":\"#a8a8a8\",\"bankButtonBorderWidth\":\"1px\",\"actionButton\":{\"showButton\":false,\"text\":\"Continue\",\"bgColor\":\"#dc4c34\",\"fgColor\":\"#ffffff\"},\"font\":{\"source\":\"none\",\"size\":\"14px\"},\"topBanksList\":\"PayWithMyBank\",\"footer\":{\"footerStyle\":\"BrandLogoInLightBackground\",\"footerText\":\"ux.dynamicWidget.footer\",\"footerTextColor\":\"#959292\"}},\"staticWidget\":[{\"countryCode\":\"FR\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/fr/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/fr/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"IT\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/it/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/it/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"ES\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/es/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/es/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"GB\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/gb/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/gb/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"}],\"page\":{\"closeButtonBehavior\":\"cancelAndClose\",\"colorOption\":\"fiColor\",\"fastSwitchLinks\":false,\"institutionBrand\":{\"type\":\"bankLogo\"},\"productBrand\":\"Trustly\"},\"header\":{\"transactionDetails\":{\"position\":\"amountOnly\"}},\"button\":{\"style\":\"littleRounded\",\"position\":\"fit\",\"transformation\":\"none\"},\"primaryButton\":{\"bgColor\":\"#1173c7\",\"fgColor\":\"#ffffff\"},\"input\":{\"borderRadius\":\"littleRounded\",\"appearance\":\"floating\",\"colorOption\":\"fiColor\"},\"eCheck\":{\"validationsOnExit\":false},\"selectBank\":{\"bankList\":{\"type\":\"bankIcon\",\"removeBankIconWithUrls\":true,\"smallIcons\":false,\"numberOfTopBanks\":7},\"bankNotOnTheList\":{\"position\":\"list-item\"},\"searchInputHint\":\"ux.selectBank.thousandsAvailable\",\"searchInputStyle\":\"searchStyleV4\"},\"login\":{\"title\":\"ux.login.signIntoYourBank\",\"securityWarningPosition\":\"bottom\",\"securityWarningMessage\":\"cannotBeSeen\",\"passwordVisibility\":true,\"welcomeSlider\":{\"enabled\":true,\"sliderType\":\"RightSideSlider\",\"backgroundColor\":\"#0098d0\",\"textColor\":\"#ffffff\",\"backgroundGradient\":false,\"accentColor\":\"#ffffff\",\"title\":\"ux.welcomeSlider.title\",\"line1\":\"ux.welcomeSlider.line1\",\"line2\":\"ux.welcomeSlider.line2B\",\"buttonText\":\"ux.welcomeSlider.ok\"}},\"accounts\":{\"finishButtonKey\":\"ux.finishButtonLabel.payNowContinueWithdrawDeposit\",\"hideAuthorizationText\":false,\"amountOnButton\":false},\"footer\":{\"slider\":true}}"
 *              uiTheme: "v4"
 *          }
 *  paymentFlowMerchantId: "1001000128"
 *  percentage: 100
 *  uiParams: "{\"dynamicWidget\":{\"name\":\"bank_tiles\",\"text1\":\"ux.dynamicWidget.text1\",\"text1Color\":\"#000000\",\"text2\":\"ux.dynamicWidget.text2\",\"text2Color\":\"#6e6e6e\",\"text3Color\":\"#6e6e6e\",\"selectBankLabel\":\"ux.selectBank.title\",\"showTextForMobileAndDesktop\":false,\"selectYourBankColor\":\"#dc4c34\",\"learnMore\":{\"showLearnMore\":false,\"learnMoreColor\":\"#249dd6\",\"learnMoreDescription\":\"ux.learnMore.description\",\"learnMoreIconColor\":\"#249dd6\"},\"bankTilesConfiguration\":{\"numberOfHorizontalBanks\":3,\"numberOfVerticalBanks\":2,\"numberOfMobileBanks\":\"sameAsDesktop\"},\"bankButtonStyle\":\"squareEdges\",\"otherBanksType\":\"allOtherBanks\",\"otherBanksSubtitle\":\"ux.selectBank.thousandsAvailable\",\"bankButtonBackgroundColor\":\"#ffffff\",\"bankButtonHighlightColor\":\"#5c9dce\",\"bankButtonOutlineColor\":\"#e2e2e2\",\"bankButtonOutlineHover\":\"#a8a8a8\",\"bankButtonBorderWidth\":\"1px\",\"actionButton\":{\"showButton\":false,\"text\":\"Continue\",\"bgColor\":\"#dc4c34\",\"fgColor\":\"#ffffff\"},\"font\":{\"source\":\"none\",\"size\":\"14px\"},\"topBanksList\":\"PayWithMyBank\",\"footer\":{\"footerStyle\":\"BrandLogoInLightBackground\",\"footerText\":\"ux.dynamicWidget.footer\",\"footerTextColor\":\"#959292\"}},\"staticWidget\":[{\"countryCode\":\"FR\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/fr/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/fr/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"IT\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/it/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/it/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"ES\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/es/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/es/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"},{\"countryCode\":\"GB\",\"enableStaticWidget\":true,\"staticWidgetVersion\":\"twoButtons\",\"staticLogosDesktopSrc\":\"{0}/start/assets/images/widget/gb/desktop.png\",\"staticLogosMobileSrc\":\"{0}/start/assets/images/widget/gb/mobile.png\",\"clickableLogos\":false,\"buttonsColor\":\"#3665f3\",\"buttonsHoverColor\":\"#3665f3\",\"buttonsStyle\":\"default\"}],\"page\":{\"closeButtonBehavior\":\"cancelAndClose\",\"colorOption\":\"fiColor\",\"fastSwitchLinks\":false,\"institutionBrand\":{\"type\":\"bankLogo\"},\"productBrand\":\"Trustly\"},\"header\":{\"transactionDetails\":{\"position\":\"amountOnly\"}},\"button\":{\"style\":\"littleRounded\",\"position\":\"fit\",\"transformation\":\"none\"},\"primaryButton\":{\"bgColor\":\"#1173c7\",\"fgColor\":\"#ffffff\"},\"input\":{\"borderRadius\":\"littleRounded\",\"appearance\":\"floating\",\"colorOption\":\"fiColor\"},\"eCheck\":{\"validationsOnExit\":false},\"selectBank\":{\"bankList\":{\"type\":\"bankIcon\",\"removeBankIconWithUrls\":true,\"smallIcons\":false,\"numberOfTopBanks\":7},\"bankNotOnTheList\":{\"position\":\"list-item\"},\"searchInputHint\":\"ux.selectBank.thousandsAvailable\",\"searchInputStyle\":\"searchStyleV4\"},\"login\":{\"title\":\"ux.login.signIntoYourBank\",\"securityWarningPosition\":\"bottom\",\"securityWarningMessage\":\"cannotBeSeen\",\"passwordVisibility\":true,\"welcomeSlider\":{\"enabled\":true,\"sliderType\":\"RightSideSlider\",\"backgroundColor\":\"#0098d0\",\"textColor\":\"#ffffff\",\"backgroundGradient\":false,\"accentColor\":\"#ffffff\",\"title\":\"ux.welcomeSlider.title\",\"line1\":\"ux.welcomeSlider.line1\",\"line2\":\"ux.welcomeSlider.line2B\",\"buttonText\":\"ux.welcomeSlider.ok\"}},\"accounts\":{\"finishButtonKey\":\"ux.finishButtonLabel.payNowContinueWithdrawDeposit\",\"hideAuthorizationText\":false,\"amountOnButton\":false},\"footer\":{\"slider\":true}}"
 *  widgetImpressions: 0
 * }
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentFlowsDTO {

    private boolean active;
    private QueryParametersEnum activeKey = QueryParametersEnum.ACTIVE;

    private long createdAt;
    private QueryParametersEnum createdAtKey = QueryParametersEnum.CREATE_AT;

    private String description;
    private QueryParametersEnum descriptionKey = QueryParametersEnum.DESCRIPTION;

    @JsonProperty("isDeleted")
    private boolean isDeleted;
    private QueryParametersEnum isDeletedKey = QueryParametersEnum.IS_DELETED;

    private int lightboxCompletes;
    private QueryParametersEnum lightboxCompletesKey = QueryParametersEnum.LIGHT_BOX_COMPLETES;

    private int lightboxInitiates;
    private QueryParametersEnum lightboxInitiatesKey = QueryParametersEnum.LIGHT_BOX_INITIATES;

    private int merchantId;
    private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

    private PaymentFlowDTO paymentFlow;
    private QueryParametersEnum paymentFlowKey = QueryParametersEnum.PAYMENT_FLOW;

    private String paymentFlowMerchantId;
    private QueryParametersEnum paymentFlowMerchantIdKey = QueryParametersEnum.PAYMENT_FLOW_MERCHANT_ID;

    private int percentage;
    private QueryParametersEnum percentageKey = QueryParametersEnum.PERCENTAGE;

    private String uiParams;
    private QueryParametersEnum uiParamsKey = QueryParametersEnum.UI_PARAMS;

    private int widgetImpressions;
    private QueryParametersEnum widgetImpressionsKey = QueryParametersEnum.WIDGET_IMPRESSIONS;

}
