/* Implementem um sistema (livre escolha) com os conceitos abordados em aula
(classe, atributo – visibilidade, método, encapsulamento, herança, getters e
setters, sobrecarga de método e reescrita de método), podem realizar em duplas. 
*/
package controledevendas;

public class ComprasProdutos extends Produto {
    private String descricao;
    private double caixa;
    private double saque;
    private String dataRetirada;
    
    public String getDescricao(){ /*get para acessar os dados*/
        return this.descricao;
    }
    public void setDescricao(String descricao){/*set para inserir os dados*/
        this.descricao = descricao;
    }
    
    public double getCaixa(){
        return this.caixa;
    }
    public void setCaixa(double caixa){
        this.caixa = caixa;
    }
    
    public double getSaque(){
        return this.saque;
    }
    public void setSaque(double saque){
        this.saque = saque;
    }
    
    public void saca (double valor) {
        this.caixa -= valor;
    }
    
    public String getDataRetirada(){
        return this.dataRetirada;
    }
    public void setDataRetirada(String dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    void imprimeExtrato () {
        this.imprimeExtrato(15);
        System.out.println("Saldo do caixa apos compra: " + this.caixa);
    }
    
    void imprimeExtrato (int dias) {  
    }

    
    
}
