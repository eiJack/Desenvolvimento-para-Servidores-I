package controledevendas;

public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private double quantidadeProduto;
    private double valorVenda;
    
    public String getNome(){
        return this.nomeProduto;
    }
    public void setNome(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    /*-------------*/
    
    public double getValorProduto(){ /*get para acessar os dados*/
        return this.valorProduto;
    }
    public void setValorProduto(double valorProduto){/*set para inserir os dados*/
        this.valorProduto = valorProduto;
    }
    
    /*-------------*/
    
    public double getQuantidadeProduto(){
        return this.quantidadeProduto;
    }
    public void setQuantidadeProduto(double quantidadeProduto){
        this.quantidadeProduto = quantidadeProduto;
    }
    
    /*-------------*/
    public double getValorVenda(){
        return this.valorVenda;
    }
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }

    public double valorVenda() {
        return (double) this.valorVenda;
    }
    
}
