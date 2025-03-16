// Joao Pedro Silva Antunes RA 2400836
// Fernanda Aparecida Figueiredo da Silva RA 2401803

open class Funcionarios(var name: String , var Salario: Double) {

    open fun exibirInformacoes() {
        print("nome: ${this.name} Salario: ${this.Salario} \n")

    }
}

class Gerente(var Bonus: Double , name: String , Salario: Double): Funcionarios(name,Salario) {


    override fun exibirInformacoes() {
        print("nome: ${this.name} Salario: ${this.Salario + this.Bonus} \n")
    }


}

class Desenvolvedor(var linguagemProgramacao: String , name: String , Salario: Double): Funcionarios (name,Salario){

    override fun exibirInformacoes() {
        print("linguagem ${this.linguagemProgramacao} nome: ${this.name} Salario: ${this.Salario} \n")
    }


}

fun main(){
    val funcionarios: List<Funcionarios> = listOf(
        Funcionarios("Pedro",1000.00),
        Funcionarios("Enzo",500.00),
        Gerente(200.20,"JP",2000.00),
        Gerente(300.20,"Fe",3000.00),
        Desenvolvedor("Java", "JP",2000.20 ),
        Desenvolvedor("Kotlin", "Fe",2000.20 )
    )
    for ( funcionario in funcionarios ){
        funcionario.exibirInformacoes()
    }

}