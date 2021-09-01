package cucumber.api.tests.test.paymentpanel.connectors;

import cucumber.api.tests.common.enums.DeviceInfoEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.WidgetIdEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.paymentpanel.common.enums.html.CreatePaymentPanelWidgetSupplier;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.ACCESS_ID;
import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.DEVICE_CATEGORY;
import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.DEVICE_OS;
import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.DEVICE_TYPE;
import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.MERCHANT_ID;
import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.REQUEST_SIGNATURE;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT;

public class PaymentPanelConnector {


    public static ResponseEntity<String> getSelectBankRedirectUrl(
            PaymentProviderEnum paymentProviderEnum,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPostForObject(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                Map.of(paymentProviderEnum.getKey(), paymentProviderEnum.getId()),
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanelWidget(
            PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreatePaymentPanelWidgetSupplier.getLoginMultiValueMapForHttpRequest(paymentPanelCreateWidgetDTO);

        return RestTemplateHttpConnector.httpPostForObject(
                PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanel(
            String requestSignature,
            PaymentProviderEnum paymentProviderEnum,
            DeviceInfoEnum deviceInfoEnum,
            List<MerchantInfoDTO> merchantInfoDTOList,
            WidgetIdEnum widgetIdEnum,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        RestTemplateHttpConnector.httpPostForObject(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                Map.of(
                        paymentProviderEnum.getKey(), paymentProviderEnum.getId(),
                        widgetIdEnum.getKey(), widgetIdEnum.getWidgetId(),
                        ACCESS_ID, merchantInfoDTOList.get(0).getAccessId(),
                        MERCHANT_ID, merchantInfoDTOList.get(0).getId().toString(),
                        REQUEST_SIGNATURE, requestSignature,
                        DEVICE_CATEGORY, deviceInfoEnum.getDeviceCategory(),
                        DEVICE_OS, deviceInfoEnum.getDeviceOs(),
                        DEVICE_TYPE, deviceInfoEnum.getDeviceType()),
                statefulRestTemplateInterceptorKeyEnums);

        return RestTemplateHttpConnector.httpPostForObject(
                PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT.getEndpoint(),
                Map.of(
                        paymentProviderEnum.getKey(), paymentProviderEnum.getId(),
                        widgetIdEnum.getKey(), widgetIdEnum.getWidgetId(),
                        ACCESS_ID, merchantInfoDTOList.get(0).getAccessId(),
                        MERCHANT_ID, merchantInfoDTOList.get(0).getId().toString(),
                        REQUEST_SIGNATURE, requestSignature,
                        DEVICE_CATEGORY, deviceInfoEnum.getDeviceCategory(),
                        DEVICE_OS, deviceInfoEnum.getDeviceOs(),
                        DEVICE_TYPE, deviceInfoEnum.getDeviceType()),
                statefulRestTemplateInterceptorKeyEnums);

    }
}