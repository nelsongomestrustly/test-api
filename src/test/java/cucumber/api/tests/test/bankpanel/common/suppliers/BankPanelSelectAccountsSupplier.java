package cucumber.api.tests.test.bankpanel.common.suppliers;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.data.dto.bankpanel.accounts.BankPanelAccountLoginDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import io.cucumber.java.sl.In;

import java.util.HashMap;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.addMapEntryIfNecessary;

public class BankPanelSelectAccountsSupplier {

    //Accept: application/json; app=react
    public static HashMap<QueryParametersEnum, String> getMultiValueMapForHttpRequest(
            Integer selectedAccount,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            BankPanelAccountLoginDTO bankPanelAccountLoginDTO,
            FrontEndSetupDTO frontEndSetupDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        //From FrontEndSetupTransactionDTO
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getSupportedLanguages().getEn(), frontEndSetupDTO.getTransaction().getSupportedLanguages().getEnKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPpId(), frontEndSetupDTO.getTransaction().getPpIdKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getToken(), QueryParametersEnum.LT, map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getBankId(), QueryParametersEnum.FI_CODE, map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPaymentType().getValue(), frontEndSetupDTO.getTransaction().getPaymentTypeKey(), map));

        //From BankPanelAccountLoginDTO
        map = (addMapEntryIfNecessary(bankPanelAccountLoginDTO.getTransaction().getPrincipalName(), QueryParametersEnum.PRINCIPAL_NAME, map));
        map = (addMapEntryIfNecessary(bankPanelAccountLoginDTO.getTransaction().getPrincipalSignature(), QueryParametersEnum.PRINCIPAL_SIGNATURE, map));
        map = (addMapEntryIfNecessary(bankPanelAccountLoginDTO.getTransaction().getAuthorizationTimestamp(), QueryParametersEnum.AUTHORIZATION_TIME_STAMP, map));

        //FROM Bank BankPanelLoginInfoDTO
        map = (addMapEntryIfNecessary(bankPanelLoginInfoDTO.getTransaction().getState(), bankPanelLoginInfoDTO.getTransaction().getStateKey(), map));

        //ACCESS Details
        map = (addMapEntryIfNecessary(selectedAccount, QueryParametersEnum.SELECTED_ACCOUNT, map));

        //Default Details
        map = (addMapEntryIfNecessary("WEST", QueryParametersEnum.TIMEZONE_ABBR, map));
        map = (addMapEntryIfNecessary("60", QueryParametersEnum.TIMEZONE_OFFSET, map));
        map = (addMapEntryIfNecessary("accountProfile", QueryParametersEnum.ACCOUNT_PROFILE, map));

        return map;

    }


    /**
     *
     * Missing
     *
     * authorizationTimestamp: 1630968049808
     * principalSignature: Cs7Ofqz4u4XyTF8syrOuZ675xnU=
     *
     *
     *
     * principalName: signed:200005501:111
     *
     *
     * lang: en
     * ppTransactionId: ptx-fuERsM96pmSsMrmy7dXigpF0-NAG
     * state: ydyVpbwWOyIfIiwYr/Ql2b/TJf5sfM+XL2dNnxGQr+KPmHRkVNwuXcoiePTJpkcIYHSNisjpQzw/iXGDXWrTy4FRpPmIAye9c/5IbVBr23leo4StAeJAwKFhYMYZeBpS0EgG9qHrDOpfQKdmDz/3AlBKGztR4JM2Sf3smbuO0AOgj/RyOOKcg2T+rZ4ssL82Csl1PMc2mQVAgvNeluJ7uCZzI4wTWZjXC48tWcPead+0/dJzqwvDPRcR+Q82PQpCl6QAzeSmIYihZnpCpmycH95ElD4/60QWo9Hl6TW8aO02JtAYDgaPTi0mkKHlxeg0YCJ595HzUnrX8Dq8YLmWS0rvdpOZf1e8XWZ/6a5XDAgj5RIJEp6j0mNNhS270Z6BdaRVELQ/faqsPANkol8GFK1WVRW/MT25zk0/y8suXllyXgXZpxW9tXB2MwNIc5BhjnCRG/P1p0LfdA+qLfGjwbxOSjGFtStjb4q1ine+B8/pwtNVNqjhn9RLdiddWbeS9OoDoGjsErWAz4y6+xDoWclkMnlpuHhdwUCGLHTlykYpo2bBgve+OibKp3MxmkcmCG3X/fTx3jyeUU2eGSKwGa5SHTHTuShBp9eN5fPiunVfJWjZrc/fjw6tjj4uWziylANijeNNj/DYskLH6OtA4Lc+Cqc0PE61K5yCCjoyqFfTqVxaJdbrbBbnrCA8lzR/IGEe/sGjGfYsP1sjnWwZ55tMG5feqo1LoWVQGks4Pkox6RXaaHgdtba4Xf9P/SkHqsFiz030bePbPKUcTSjVSwhsETPfe25U1U5G6hM6gASqkrGuaNYworrl3c6fYuoYoftQBDIceoDPfXJz0x2g5cUVav9SEoTg/NyiPjxVcVDBNHdvM2cr+hG/lA3ZP4giD2o2/7Wg82WKuH2YyYGFHOdR/qG192/hDZTra51Jd5Kq7e3OyMDXSEm4Fr4GJKMg
     * lt: U493LIT9ADXTy58bGKxT5w==:login:/authenticate:1630968038716:1630968049955:200005501
     *
     *
     * selectedAccount: 0
     *
     *
     * timezoneAbbr: WEST
     * timezoneOffset: 60
     * accountProfile: Personal
     *
     *
     * --------------------------
     *
     * lang: en
     * ppTransactionId: ptx-DZSXelhipU4E3_Y3lNs5T-U2-NAG
     * state: 9OTEzl6JSz7FJMG40u8ze/VKoDkJrv1Wgi6/KsiYkxAuQ/equ8sKZTw9yDycRvucKxkOZGdbHMgMwT4jthsCHWJNtbfVGpqY4X8ZTGd9xujfCrINW+KOq0jByyxojT2cJTb277H+xpdX17jMdsfGfZTSr8QRt+MgMLUchGLzkaReYhPAExln/WbzDBJ903gzpr3xPsIyW+uppamm/uHFcRBPBZVHORr6Mf7cdw1YQUjE4N9FJu4wuo3d9NhuRyEwREA5iia9t+bxJc/MnOboXnMh7od2gTtuvHYbCuI+AsCTwlMoO2qAc3gG6u3YOdI0tsHLncHwPzbKQrvG/dOyPSLmhxRoSUUwA4TnGvYQMirBz2MPCiBPZ6vVnXtwPWTW0CL4befPxWtgiX/pUX9FqnnPXMpdYjknuQG1qZiKD43PM/gepi58LwSEu9yKFSOEYf9SOGy2dNnOe6rKKkj+IrZeMcTmrLDQO3BiTUZW2mTlzlMHzZgBJ6kkVaaOL5Few/MuoVwDXfF3DAHLMTtJUjuEU/cCHJhNt3xSR4Tq15QUNoMrpDTdSL6YjGURrTuAN9u3cOHbvB/wvRFDzJzI3u7jUYD4QBTnGCkY2SS0aqPySukwM/Ty75t5kmFnuQo6/an09WF/Dq2dUraDktTd6UiofdmftDOfjT7Vex66CB6Nc3uy513O0diJHmY9hXMO+YHCPnWIkAhTcsDnsyGXvNlCugqStV+E16wk2IIPM6P8IZAjoCHAnESxaVUOfkRIJ1peUBg57N0wavjLjTEFP7DmhTHaudJ4cqK5joClVaG/+z6OirfuCa7qXhR4FsMMo4E1Kk+nABo0qDcMvjAsegXaX1N8IDaMaQ3uplozho1HmnkleScx2kSdKYyN8aY4WgPHMlXE/pq+/gZpD4onnVIlMa1dGk5KKVTwCOMtDxYhzNz0xdvS5dAYUnKIdNKE
     * accountProfile: Personal
     * selectedAccount: 0
     * principalName: signed:200005501:111
     * principalSignature: Cs7Ofqz4u4XyTF8syrOuZ675xnU=
     * authorizationTimestamp: 1630968707373
     * timezoneAbbr: WEST
     * timezoneOffset: 60
     * lt: avwhuWCCqguW/SjKU2GBBQ==:login:/authenticate:1630968706803:1630968707442:200005501
     *
     *
     * {
     *    "accountFields":[
     *       {
     *          "number":"****6576",
     *          "hasFunds":true,
     *          "iban":null,
     *          "name":"Demo Checking Account",
     *          "index":0,
     *          "supported":true
     *       },
     *       {
     *          "number":"****6213",
     *          "hasFunds":true,
     *          "iban":null,
     *          "name":"Demo Savings Account",
     *          "index":1,
     *          "supported":true
     *       }
     *    ],
     *    "askForAccountProfile":false,
     *    "stepId":"accounts",
     *    "selectedAccount":{
     *       "number":"****6576",
     *       "hasFunds":true,
     *       "iban":null,
     *       "name":"Demo Checking Account",
     *       "index":0,
     *       "supported":true
     *    },
     *    "page":{
     *       "finishButtonLabel":"ux.finishButtonLabel.payNowContinueWithdrawDeposit.authorize"
     *    },
     *    "transaction":{
     *       "authorizationTextToken":null,
     *       "principalName":"signed:200005501:admin",
     *       "principalSignature":"uRI7MazlLrV2m7IWOsBTrjzMtfo=",
     *       "state":"I+6DNP2+r5zOEhhxEMwUJmnttjyhkU/RWnJca4X3sqn/bkgCsJlWIOMyVNKowqIRIfwKy7lDx3O3Dl7yzgWLVtXgRdX32Vvr/3izKj62MBbCayNChcuDGKc9q209qS6cqTLH2xuxCOMslr80RhpkhLyPSunwXpjhWcAMgWKenB1teHaQFScyT50gGv21bPMdzJNYbpRniV6xwVjw+9J7mUa1PvTbZgqdWEd4THJxsY/apH7aMseMoO5zNs+n71R3VBs5Pem2eYMsTT3d9Mh2KP7GqJu5xp1A5XTcHfSDsJYQi9ZOvtUzWMAQf2os0YEusY/XiLt01ijjHOCRHmWo0WyvG23ImM3SdVYaLEgYhlDjmHGJYsUhYp2vitqzibwXiIkg81TJOBGuVwLXGgUTL8MLKIrBAHiW2c4/tzAdE1WFrzW08VRRjbfUJwyqFoH6C4Ilat31mejAGYlykJ5plaYXyEc85vRHVLa43UINcWba8qqx/z7oQnZCYTkd6iuqPNd6+QkLc9kpSQxIXsLsGutM3Lw6uitMFT7vZmttmp191i8pxN2z+qDCx41eJg/E8Ymqs7xO1Fws75KrjcygtMJ0u8vnKnvVpg0TZsZlLQjM754ny8vVF+YbHSxLaSrlvf46Os/ABc7hi/Bz1ebTWKhTc9CBBNEFD3oJDDkTnxYyPlvurB6GyuamOY075XQOu/22ARHu+Em1OzJdYvDnO15oU+l3tZdHu6YSH/E4iwW75idtBeBc+hpWVaIx2er5+sVs9h8CT6ws4kK/DsavIffJkQ8spdJmShtLbT98756N6UD3IInnvTXVx/Ah2fzQ0AGHo6xGhbPNTLZ0S8zVoPkkO2xsXTd6bytGlxHeO3uuog8cgMhizQk4A5U4tmvPOtWm4SZbymE3Jm12aT2Pd9V9xMAzElADs4Ei4bE1qwkVPQezwAOxKYCpcuIpTa2FAg0tQ1cq4NUmJPqsixxKog==",
     *       "authorizationText":"",
     *       "authorizationTimestamp":1630966901476,
     *       "ppId":"ptx-LmgwNftUKB-hfHNd6xkja8oe-NAG"
     *    }
     * }
     *
     */



}
