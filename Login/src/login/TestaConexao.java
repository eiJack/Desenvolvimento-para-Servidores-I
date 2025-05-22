package login;

public class TestaConexao {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.abrirConexao();
        
        try {
          Thread.sleep(4000);
          c.fecharConexao();
        } catch (InterruptedException ex){
          System.out.println("Houve algum problema no este de conexao. " + ex.getMessage());
        }
    }
    
}
/*Shift + f6 para testar conexao*/