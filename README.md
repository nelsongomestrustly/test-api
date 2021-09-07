# test-api


------
Dto information
------
https://paywithmybank.atlassian.net/wiki/spaces/Engineering/pages/3014931/API+call+code+samples+-+Java

------
FDP
------
FPD = Flow Progress Data, também é opcional, serve pra track de conversão -> Conversão de UI mesmo, saber se é usuário recorrente, essas coisas

------
Id´s :
------
ID no PTWB -> Transaction ID
ID do merchante , que  -> Merchant Reference
ID no FIGTW -> ppTTransactionId.
orderId é usado para transações que fazem integração com a TrustlyAB e usam conectores PSD2.
Contextualizando: o eBay precisa validar contas bancárias de França, Itália e França (isso que chamamos de integração com TrustlyAB).
ID do Banco -> paymentProviderId
ID do merchant de Acesso, tipo a chave de Acesso -> AccessID

------
GRP ->
------
Eh um numero referente aos Payment Flows,
Existem Payment Flows de 0 a 100
Se o GRP for 40, somente vai executar os Flows abaixo ou acima ??

------
Logs
------
O lt = loadingTime que é usado para logs.

------
Organization
------
TrustlyAB = Trustly Europe

------
Merchant Into
------
Merchant ID é o ID do merchant no nosso sistema

------
Payment Panel
------
Endpoint Principal Select Bank, volta um link para a LightBox, nesse link tem Token
O que é esse token ????????






Eligible for frontEndSetupDTO (True ou False, devido ao ligh pannel, ao widget)


Token 
Separado Merchant Trustly
Recibdo Token = Parte do Token do Merchant ???????????



Duvidas adicionais ???
posso ter 2 merchant reference id duplicados, se sim como faço o match ?
FDP - Widget
isStandaloneFiLogin ??? 
Verify Transaction ??? Cria Transaction ??? Pois vc tem essa opcao no backend e nao no front end 
verifyIOSgrp ???
GRP ???
No flow da criação da frontEndSetupDTO quem cria o frontEndSetupDTO id, e o ppt id, e quando ?

Quando  clica no bank select panel index que vem do iframe
eu entendo que ele ja cria a frontEndSetupDTO
mas de onde o front end tira o ppt frontEndSetupDTO e o frontEndSetupDTO id ???? e o me


DemoBank
Entra ele ja gera o widget.

http://192.168.1.49:10000/frontend/setup ?? existe no backend ? onde ? 

