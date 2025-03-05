package exerciciometodos;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Maria Julia";
        f1.salario = 1000.50;
        
        System.out.println("Funcionario: " + f1.nome);
        System.out.println("Salario: " + f1.salario);
        
        f1.aumento(1000);
        f1.imprimeSalarioNovo();
        
        Funcionario f2 = new Funcionario();
        
        f2.nome = "Jackeline de Paula";
        f2.salario = 3180.50;
        
        System.out.println("Funcionario: " + f2.nome);
        System.out.println("Salario: " + f2.salario);
        
        f1.imprimeUsuario();
        f2.imprimeUsuario();
    }
    
}
/*Crie dois funcionarios*/