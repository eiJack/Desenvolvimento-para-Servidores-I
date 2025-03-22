/* Implementem um sistema (livre escolha) com os conceitos abordados em aula
(classe, atributo – visibilidade, método, encapsulamento, herança, getters e
setters, sobrecarga de método e reescrita de método), podem realizar em duplas. 
*/
package controledevendas;

public class VendasDosProdutos extends Produto{
    private String dataVenda;
    private double quantidadeEstoque;
    private double retiradaEstoque;
    
    
    public String getDataVenda(){
        return this.dataVenda;
    }
    public void setDataVenda(String dataVenda){
        this.dataVenda = dataVenda;
    } 
    
    /*-------------*/
    
    public double getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(double quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    /*---------------*/
    public double getRetiradaEstoque () {
        return this.retiradaEstoque;
    }
    public void setRetiradaEstoque (double retiradaEstoque) {
        this.retiradaEstoque = retiradaEstoque;
    }
    
    public void compra (double valor) {
        this.quantidadeEstoque -= valor;
    }
    
    /*-----*/
    void imprimeExtrato () {
        this.imprimeExtrato(15);
        System.out.println("Em estoque apos venda: " + this.quantidadeEstoque);
    }
    void imprimeExtrato (int dias) {  
    }
    
    /*-------------*/
    @Override
    public double getValorVenda(){
        return super.valorVenda() + 2.5;
    }
}
