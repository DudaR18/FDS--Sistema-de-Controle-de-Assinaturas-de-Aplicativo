# FDS--Sistema-de-Controle-de-Assinaturas-de-Aplicativo
Fundamentos de Desenvolvimento de Software

Trabalho Final 2024/2 – Parte 1

Sistema de Controle de Assinaturas de Aplicativos

- Enunciado geral

Nos dias de hoje é comum o surgimento de startups baseadas em aplicativos para celular. Muitas vezes uma boa ideia se transforma em um aplicativo de sucesso e alavancando pequenas empresas para o sucesso rápido.

Considere que uma startup que trabalha com o modelo de assinaturas. Neste modelo de negócio o cliente pode baixar os aplicativos gratuitamente na loja, porém eles só funcionam se o cliente tiver uma assinatura paga. Em função disso, todo o mês, é necessário dispor de um sistema para manter o controle das assinaturas.

Neste modelo de negócio os aplicativos, periodicamente, precisam verificar se a assinatura continua válida para poder continuar funcionado. Em função disso o sistema tem de ser capaz de responder, rapidamente, se uma determinada assinatura continua válida. Quando um usuário assina um aplicativo deve ser gerado um código (código da assinatura). Esse código, juntamente com o código do cliente, deve ser inserido no aplicativo de maneira que o uso do aplicativo seja liberado. De tempos em tempos, o aplicativo deve questionar se o par cliente/assinatura continua válido. Conforme a resposta o aplicativo continua ativo ou não.


Para fazer toda esta gestão, startups que trabalham nesse modelo de negócio necessitam de um software de apoio que tenha as seguintes funcionalidades:


· Cadastrar/editar/listar a base de aplicativos que disponibiliza

· Cadastrar/editar/listar a base de clientes

· Cadastrar a assinatura de um aplicativo por parte de um cliente

· Atualizar o valor do custo mensal de um aplicativo

· Responder se um par cliente/assinatura continua válido

· Listar as assinaturas de um cliente

· Listar os assinantes de um aplicativo

· Receber a notificação de pagamento de uma assinatura (enviado pelo banco conveniado) e atualizar a data de validade da assinatura


O objetivo deste trabalho é desenvolver o módulo “backend” de um sistema de apoio para empresas que disponibilizem seus aplicativos neste modelo de negócio.


Considerando o prazo disponível para o desenvolvimento desta tarefa faremos uma simplificação importante: cada instância deste sistema irá atender uma única empresa e, por esta razão, ele terá apenas um único usuário cadastrado. Isso significa que todos os aplicativos e clientes cadastrados no sistema pertencem a uma única empresa/usuário.
