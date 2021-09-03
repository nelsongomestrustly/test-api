package cucumber.api.tests.common.suppliers;

import cucumber.api.tests.common.constants.env.Ports;

import static cucumber.api.tests.common.constants.env.Hosts.MAIN_HOST;

public class UrlSuppliers {


    public static String getEnvUrl(String url, String port) {
        return MAIN_HOST + port + "/" + url;
    }


}
