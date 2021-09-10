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
Id´s Chave Primária:
------
TransId -> Existem FIGTW e PWMB ambos sao chaves primárias de suas tabelas.
ppTTransactionId -> Chave que liga ambas as tabelas FIGTW <--> PWMB


------
Jira Integration x Application:
------
Existe um controller AdmConFicErrorLogEndpoint onde conseguimos atumaticamente atualizar o Jira com logs , o endpoint é o updateJiraIssue 


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


------
Transactions Types
------

Authorize
Capture
Pay

------
Payment Types, contém varias Transactions
------

1) Deferred :

    Primeiro momento uma transação de Authorize
    Depois você pode várias transações de Capture, até o montante.

    Crio uma sacola de dinheiro - Exemplo : Dinheiro virtual em um site de aposta e o merchant pode pegar aos poucos, varios capture
    conforme vai apostando o merchant executa um CAPTURES do dinheiro aos poucos
    Pode ser um Deferred de Zero , para ser ilimitado,
    ai tem o impacto no processo de garantia pois o merchant ajuda a Trustly a pegar o dinheiro de volta caso nao receba
    Somente deffered nao existe pagamento no momento zero

2) Disbursement : ******* , pq passamos ??????

    ********

3) Instant :

    Faz uma transação de PAY e Termina
    Paga na Hora ---> claro que tem o delay do process

4) Onfile :

    Como raiz eu faço um PAY ou um Authorize, e eu posso pagar mais do que o meu saco de dinheiro

    Posso fazer uma transação inicial ou não

    Se tu fiz transação incial de PAY e depois continuar a fazer captures (Instant + Deferred)
    Se tu fiz transação incial de Authorize e depois continuar a fazer captures (Deferred)

   
5) Recurring :

   Pagamento em Prestações, assinature
   Ele funciona como um defered com uma autorizacao durante o periodo 
   Authroize, e depois varios Captures recorrentes

6) Retrieval ******* , pq passamos dinheiro ??????

    https://paywithmybank.atlassian.net/wiki/spaces/PD/pages/63012917/Retrieval+Flow
    O Merchant quer informações do user, mas nao entendi, como você cria uma transacao com isso.





------
Tipos de Pagamentos
------




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

