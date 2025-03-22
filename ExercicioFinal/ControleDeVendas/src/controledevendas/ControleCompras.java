/* Implementem um sistema (livre escolha) com os conceitos abordados em aula
(classe, atributo – visibilidade, método, encapsulamento, herança, getters e
setters, sobrecarga de método e reescrita de método), podem realizar em duplas. 
*/
package controledevendas;

public class ControleCompras {
    public static void main(String[] args) {
        ComprasProdutos cp = new ComprasProdutos();
        
        cp.setCaixa(10000);
        System.out.println("Total em caixa: "+ cp.getCaixa());
        System.out.println("-----------------------");
        /*--------------*/
        cp.setNome("maca");
        cp.setValorProduto(30);
        cp.setQuantidadeProduto(10);
        cp.setDescricao("Compra de maca para estoque - 30/03/25");
        
        System.out.println("Nome produto: "+ cp.getNome());
        System.out.println("Valor produto: "+ cp.getValorProduto());
        System.out.println("Quantidade produto: "+ cp.getQuantidadeProduto());
        System.out.println("Descricao: "+ cp.getDescricao());
        /*-----------------*/
        System.out.println("-----------------------");
        cp.setSaque(cp.getValorProduto());
        cp.saca(cp.getSaque());
        cp.setDataRetirada("30/03/25");
        System.out.println("Valor de compra: "+ cp.getSaque());
        cp.imprimeExtrato();
        System.out.println("Data do compra: "+ cp.getDataRetirada());
        
    }
    
}

