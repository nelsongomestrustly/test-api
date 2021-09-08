package cucumber.api.tests.conectors.bankpanel.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum BankPanelEndpoint {

    BANK_PANEL_ENDPOINT_STEP(MainEndpoints.BANK_PANEL_ENDPOINT + "/step");

    private final String endpoint;

}


/**
 * AUTHORIZE
 *
 * lang: en
 * ppTransactionId: ptx-fuERsM96pmSsMrmy7dXigpF0-NAG
 * state: ydyVpbwWOyIfIiwYr/Ql2b/TJf5sfM+XL2dNnxGQr+KPmHRkVNwuXcoiePTJpkcIYHSNisjpQzw/iXGDXWrTy4FRpPmIAye9c/5IbVBr23leo4StAeJAwKFhYMYZeBpS0EgG9qHrDOpfQKdmDz/3AlBKGztR4JM2Sf3smbuO0AOgj/RyOOKcg2T+rZ4ssL82Csl1PMc2mQVAgvNeluJ7uCZzI4wTWZjXC48tWcPead+0/dJzqwvDPRcR+Q82PQpCl6QAzeSmIYihZnpCpmycH95ElD4/60QWo9Hl6TW8aO02JtAYDgaPTi0mkKHlxeg0YCJ595HzUnrX8Dq8YLmWS0rvdpOZf1e8XWZ/6a5XDAgj5RIJEp6j0mNNhS270Z6BdaRVELQ/faqsPANkol8GFK1WVRW/MT25zk0/y8suXllyXgXZpxW9tXB2MwNIc5BhjnCRG/P1p0LfdA+qLfGjwbxOSjGFtStjb4q1ine+B8/pwtNVNqjhn9RLdiddWbeS9OoDoGjsErWAz4y6+xDoWclkMnlpuHhdwUCGLHTlykYpo2bBgve+OibKp3MxmkcmCG3X/fTx3jyeUU2eGSKwGa5SHTHTuShBp9eN5fPiunVfJWjZrc/fjw6tjj4uWziylANijeNNj/DYskLH6OtA4Lc+Cqc0PE61K5yCCjoyqFfTqVxaJdbrbBbnrCA8lzR/IGEe/sGjGfYsP1sjnWwZ55tMG5feqo1LoWVQGks4Pkox6RXaaHgdtba4Xf9P/SkHqsFiz030bePbPKUcTSjVSwhsETPfe25U1U5G6hM6gASqkrGuaNYworrl3c6fYuoYoftQBDIceoDPfXJz0x2g5cUVav9SEoTg/NyiPjxVcVDBNHdvM2cr+hG/lA3ZP4giD2o2/7Wg82WKuH2YyYGFHOdR/qG192/hDZTra51Jd5Kq7e3OyMDXSEm4Fr4GJKMg
 * accountProfile: Personal
 * selectedAccount: 0
 * principalName: signed:200005501:111
 * principalSignature: Cs7Ofqz4u4XyTF8syrOuZ675xnU=
 * authorizationTimestamp: 1630968049808
 * timezoneAbbr: WEST
 * timezoneOffset: 60
 * lt: U493LIT9ADXTy58bGKxT5w==:login:/authenticate:1630968038716:1630968049955:200005501
 *
 */


/**
 * AUTHENTICATE
 * CORRECT
 *
 * result = {SimpleHash@7634}  size = 16
 *  "forgotMyPasswordCustomError" -> {String[1]@7654} ["false"]
 *   value = {String[1]@7654} ["false"]
 *   key = "forgotMyPasswordCustomError"
 *  "prompt-username" -> {String[1]@7656} ["333"]
 *   value = {String[1]@7656} ["333"]
 *   key = "prompt-username"
 *  "ppTransactionId" -> {String[1]@7658} ["ptx-EQwQR3cVNEP..."]
 *   value = ptx-EQwQR3cVNEPGMSJNoW-x3-3T-NAG
 *   key = "ppTransactionId"
 *  "fiCode" -> {String[1]@7660} ["200005501"]
 *   value = {String[1]@7660} ["200005501"]
 *   key = "fiCode"
 *  "lt" -> {String[1]@7662} ["eDRHTXaR6iarPiA..."]
 *   value = eDRHTXaR6iarPiAStIC3Iw==:initial_load:/establish:1630947243889:1630947249073
 *   key = "lt"
 *  "principalName" -> {String[1]@7664} [""]
 *   value = {String[1]@7664} [""]
 *   key = "principalName"
 *  "principalSignature" -> {String[1]@7666} [""]
 *   value = {String[1]@7666} [""]
 *   key = "principalSignature"
 *  "gr" -> {String[1]@7668} ["0"]
 *   value = {String[1]@7668} ["0"]
 *   key = "gr"
 *  "loginErrorCount" -> {String[1]@7670} ["0"]
 *   value = {String[1]@7670} ["0"]
 *   key = "loginErrorCount"
 *  "password" -> {String[1]@7672} ["3333"]
 *   value = {String[1]@7672} ["3333"]
 *   key = "password"
 *  "timezoneOffset" -> {String[1]@7674} ["60"]
 *   value = {String[1]@7674} ["60"]
 *   key = "timezoneOffset"
 *  "prompt-password" -> {String[1]@7676} ["3333"]
 *   value = {String[1]@7676} ["3333"]
 *   key = "prompt-password"
 *  "state" -> {String[1]@7678} ["VIGDuk7wooDVJ1L..."]
 *   value = {String[1]@7678} ["VIGDuk7wooDVJ1L..."]
 *   key = "state"
 *  "lang" -> {String[1]@7680} ["en"]
 *   value = {String[1]@7680} ["en"]
 *   key = "lang"
 *  "timezoneAbbr" -> {String[1]@7682} ["WEST"]
 *   value = {String[1]@7682} ["WEST"]
 *   key = "timezoneAbbr"
 *  "username" -> {String[1]@7684} ["333"]
 *   value = {String[1]@7684} ["333"]
 *   key = "username"
 *
 *  NOT WORK
 *  "forgotMyPasswordCustomError" -> {String[1]@7736} ["false"]
 * "lt" -> {String[1]@7738} ["BRg/8dSi4IMNQr ..."]
 * "description" -> {String[1]@7740} ["Globex%20(demo)"]
 * "accessId" -> {String[1]@7742} ["A48B73F694C4C8E..."]
 * "password" -> {String[1]@7744} ["password"]
 * "timezoneOffset" -> {String[1]@7746} ["60"]
 * "merchantId" -> {String[1]@7748} ["110005514"]
 * "state" -> {String[1]@7750} ["CT2OT6rM3lnitc8..."]
 * "id" -> {String[1]@7752} ["110005514"]
 * "timezoneAbbr" -> {String[1]@7754} ["WEST"]
 * "deviceType" -> {String[1]@7756} ["desktop:macinte..."]
 * "prompt-username" -> {String[1]@7758} ["username"]
 * "ppTransactionId" -> {String[1]@7760} ["ptx-tt2LLY2bhuN..."]
 * "grp" -> {String[1]@7762} ["1"]
 * "fiCode" -> {String[1]@7764} ["200005501"]
 * "widgetId" -> {String[1]@7766} ["1"]
 * "en" -> {String[1]@7768} ["english"]
 * "gr" -> {String[1]@7770} ["0"]
 * "logoUrl" -> {String[1]@7772} ["%7B0%7D/images/..."]
 * "loginErrorCount" -> {String[1]@7774} ["0"]
 * "v" -> {String[1]@7776} ["1.122-SNAPSHOT"]
 * "prompt-password" -> {String[1]@7778} ["password"]
 * "name" -> {String[1]@7780} ["Globex%20(demo)"]
 * "username" -> {String[1]@7782} ["username"]
 *
 */