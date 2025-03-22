
package controledevendas;

public class ControleVendas {
    public static void main(String[] args) {
        VendasDosProdutos vp = new VendasDosProdutos();
        Produto p = new Produto();
        
        vp.setNome("maca");
        vp.setValorVenda(3);
        p.setValorVenda(3);
        vp.setDataVenda("01/04/25");
        vp.setRetiradaEstoque(1);
        vp.setQuantidadeEstoque(20);
        
        System.out.println("Nome produto: "+ vp.getNome());
        System.out.println("Quantidade em estoque: "+ vp.getQuantidadeEstoque());
        System.out.println("Quantidade un. da compra: " + vp.getRetiradaEstoque());
        System.out.println("Valor de venda: " + vp.getValorVenda());
        System.out.println("Valor de venda sem lucro: " + p.getValorVenda());
        System.out.println("Data venda: " + vp.getDataVenda());
        
        System.out.println("-----------------");
        vp.compra(vp.getRetiradaEstoque());
        vp.imprimeExtrato();
    }  
}
