# Exercicios-POO-Kotlin
Sistema de Funcionários: Você foi contratado pela empresa IMPACTA DEVS para
desenvolver o novo sistema de funcionários da empresa. Para isso as seguintes orientações devem
ser seguidas:
• Crie a classe Funcionários com os seguintes atributos: nome do funcionário e salário.
Também deve ser implementado o método exibirInformacoes( ) responsável por imprimir o
nome e salário de cada funcionário.
• Crie a subclasse Gerente que herda de Funcionário e possui o atributo bônus: Double. O
salário total do gerente deve considerar o bônus.
• Crie a subclasse Desenvolvedor que herda de funcionário e possui o atributo
linguagemProgramacao: String.
• Aplique o polimorfismo no método exibirInformacoes( ) nas subclasses.
• Por fim crie uma lista com 2 funcionários, 2 gerentes e 2 desenvolvedores, e chame
exibirInformacoes() para cada um deles.

Sistema Bancário: Crie um sistema de contas bancárias em Kotlin, utilizando os
conceitos de OO vistos em aula, seguindo as diretrizes:
• Crie a classe ContaBancaria com os seguintes atributos: nome_titular e saldo_conta. A
classe também possui os métodos depositar(valor) e sacar(valor).
• Crie a subclasse ContaCorrente que contém o atributo taxaoperacao. Toda vez que o
cliente saca dinheiro da ContaCorrente é cobrada uma taxa de R$5,00.
• Crie a subclasse ContaPoupanca que contém o atributo rendimento. Toda vez que o
cliente deposita dinheiro na Conta Poupança, o dinheiro rende 2% a mais em relação a
quantia que foi depositado.
• Implemente o método exibirSaldo() na classe ContaBancaria e em suas respectivas
subclasses.
• Crie um cliente que possua uma ContaCorrente e faça a simulação do funcionamento
dessa subclasse.
• Crie um cliente que possua ContaPoupanca e faca a simulação do funcionamento dessa
subclasse.
• Faça todas as validações necessárias no programa.
• O saldo da conta precisa estar formatado com 2 casas decimais.
