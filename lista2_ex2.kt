import java.text.Format
// Joao Pedro Silva Antunes RA 2400836
// Fernanda Aparecida Figueiredo da Silva RA 2401803

open class ContaBancaria(var nome_titular: String, var saldo_conta: Double )  {

    open fun depositar(valor: Double){
    this.saldo_conta += valor;
    }
    open fun sacar(valor: Double){
    this.saldo_conta -= valor;
    }
    open fun exibirSaldo(){
        var saldoformatado = String.format("%.2f",this.saldo_conta)
        print("|nome: ${nome_titular} | saldo: ${(saldoformatado)}|\n")
    }

}
class ContaCorrente(var taxaoperacao: Double,nome_titular: String,saldo_conta: Double):ContaBancaria(nome_titular, saldo_conta){

    override fun sacar(valor: Double){
       super.sacar(valor + this.taxaoperacao);
    }

}
class ContaPoupanca(var rendimento: Double ,nome_titular: String,saldo_conta: Double):ContaBancaria(nome_titular, saldo_conta) {

    override fun depositar(valor: Double){
       super.depositar(valor + ((saldo_conta + valor) * (this.rendimento/100)))

    }

}

fun main() {
    var cliente = ContaBancaria("GP",3000.00)
    var cliente2 = ContaCorrente(5.00,"Jesus",1000.00)
    var cliente3 = ContaPoupanca(2.00,"Fe",1000.00)


    cliente.depositar(500.00)
    cliente.exibirSaldo() // 3500.00
    cliente.sacar(1000.00)
    cliente.exibirSaldo() // 2500.00

    cliente2.sacar(500.00)
    cliente2.exibirSaldo() // 495.00

    cliente3.depositar(1000.00)
    cliente3.exibirSaldo() // 2040.00
}
