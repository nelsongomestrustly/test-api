package cucumber.api.tests.test.merchantdemo.common.suppliers;

import cucumber.api.tests.common.enums.TokenEnv;
import cucumber.api.tests.data.dto.token.TokenDTO;
import cucumber.api.tests.common.suppliers.StringSuppliers;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MerchantDemoFrontEndTokenManagerSupplier {

    private static final String HTML_START = "Content-Type:\"text/html\", Location:\"";
    private static final String HTML_END = "\", Content-Length:\"0\", Server:\"Jetty";

    private static final String TOKEN_START = "token=";
    private static final String TOKEN_END = "&cancelUrl";



    /**
     *
     * <302,[Date:"Thu, 02 Sep 2021 22:39:36 GMT", Access-Control-Allow-Origin:"http://192.168.1.49:9000", Cache-Control:"no-cache, max-age=0",
     * Last-Modified:"Thu, 02 Sep 2021 22:39:36 GMT", Content-Type:"text/html", Location:"http://192.168.1.49:10000/frontend/build/index.html?
     * token=O2z4XFIEfj35QNJXMpra57tRlw4xOIPev387Sy%2BupZyT8XExEH%2Bk3oJXaIvDfWR8H7ljuZsifviB5LVVEyd6tMordZhACfQT%2F12CenmahzDSJmznToH0FJc%2BM
     * nhEJJdLc0vk53I899jsdRfxVJMafJHp%2BbU%2FinOjckK3oPfvEHbPkAHmhEOG0Th8S%2FMSNrVsFhFNAnwxXsC1%2FnrDtG749RaZmsQqIJuN67W4AwFKkGM%3D&
     * cancelUrl=http%3A%2F%2F192.168.1.49%3A7000%2Fmerchant-demo%2Fglobex%2F%3Fcancel%253Dtrue", Content-Length:"0", Server:"Jetty(9.4.12.v20180830)"]>
     *
     * http://192.168.1.49:10000/frontend/build/index.html?token=O2z4XFIEfj35QNJXMpra57tRlw4xOIPev387Sy%2BupZyT8XExEH%2Bk3oJXaIvDfWR8H7ljuZsifviB5LVVEyd6tMordZhACfQT%2F12CenmahzDSJmznToH0FJc%2BMnhEJJdLc0vk53I899jsdRfxVJMafJHp%2BbU%2FinOjckK3oPfvEHbPkAHmhEOG0Th8S%2FMSNrVsFhFNAnwxXsC1%2FnrDtG749RaZmsQqIJuN67W4AwFKkGM%3D&cancelUrl=http%3A%2F%2F192.168.1.49%3A7000%2Fmerchant-demo%2Fglobex%2F%3Fcancel%253Dtrue
     *
     */
    public static TokenDTO getMerchantDemoFrontEndTokenManager(String html) {

        String http = StringSuppliers.getBetweenStrings(html, HTML_START, HTML_END);
        //http.replace(HTML_START, "");
        log.info("http : " + http);

        String token = StringSuppliers.getBetweenStrings(html, TOKEN_START, TOKEN_END);
        log.info("token : " + token);

        return TokenDTO.builder()
                .tokenEnv(TokenEnv.MERCHANT_DEMO_FRONT_END_SETUP)
                .token(token)
                .http(html)
                .build();

    }

}
