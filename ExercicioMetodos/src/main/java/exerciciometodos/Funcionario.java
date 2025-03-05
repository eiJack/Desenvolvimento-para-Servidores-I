package exerciciometodos;

public class Funcionario {
    String nome;
    double salario;
    
    void aumento (double valor){
        this.salario += valor;
    };
    
    void imprimeSalarioNovo () {
        System.out.println("Salario novo: " + this.salario);
    }
    
    void imprimeUsuario () {
        System.out.println("Funcionario: " + this.nome + " e seu salario: " + this.salario);
    }
}
/*
- precisa conter nome e salario
- depois de usar o TesteFuncionario para verificar a adição de nome e salario 
adicione metodo para aumento de salario e consulta dos dados dos funcionarios 
e ai vai novamente para testaFuncionario

*/