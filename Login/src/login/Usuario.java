package login;

import java.sql.SQLException;

public class Usuario {
    static String usuario;
    static String nome;
    private String senha;
    
    private boolean resultUsuario;
    private boolean resultCadastro;
    
    private boolean resultAlteracao;
    private boolean resultExclusao;
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public boolean verificaUsuario (String usuario, String senha){
        Conexao banco = new Conexao();
        
        try{
            banco.abrirConexao();
            banco.stmt=banco.con.createStatement();
            banco.resultset= banco.stmt.executeQuery
                                        ("SELECT * FROM Usuario "
                                        + "WHERE usuario = '" + usuario +"'"
                                        + " AND senha = md5('" + senha + "')");
            if (banco.resultset.next()){
                resultUsuario = true;
                
                setUsuario(banco.resultset.getString(1));
                setNome(banco.resultset.getString(2));
                
                nome = this.getNome();
                usuario = this.getUsuario();
                
            } else {
                resultUsuario = false;
            }
            
            banco.fecharConexao();
            
        } catch (SQLException ec) {
            System.out.println("Erro ao consultar usuário " + ec.getMessage());
        }
        
        return resultUsuario;
    }

    boolean verificaUsuario(String usuario) {
        Conexao banco = new Conexao();
        
        try {
            banco.abrirConexao();
            
            banco.stmt= banco.con.createStatement();
            
            banco.resultset = banco.stmt.executeQuery("SELECT * FROM usuario"
                                                      + "WHERE usuario = ' " + usuario
                                                      + "'");
            
            if (banco.resultset.next()){
            resultUsuario = true;
            } else {
            resultUsuario = false;
            }
            
            banco.fecharConexao();
        } catch (SQLException ec) {
            System.out.println("Erro ao consultar usuario " + ec.getMessage());
        }
        
        return resultUsuario;
    }

    boolean cadastraUsuario(String nome, String usuario, String senha) {
        Conexao banco = new Conexao();
        
        try{
        banco.abrirConexao();
        
        banco.stmt = banco.con.createStatement();
        
        banco.stmt.execute("INSERT INTO usuario (nome, usuario, senha)"
                            + " VALUES ('"+ nome +"','" + usuario + "', md5('"
                            + senha + "'))");
        resultCadastro = true;
        }catch(SQLException ec){
            System.out.println("Erro ao inserir usuario " + ec.getMessage());
            resultCadastro = false;
   
        }
        return resultCadastro;
    }
    
    boolean alteraUsuario(String nome, String usuario, String senha){
        Conexao banco = new Conexao();
        
        try{
            banco.abrirConexao();
            banco.stmt = banco.con.createStatement();
            
            banco.stmt.execute("UPDATE usuario SET nome = '" + nome +
                   "', senha = md5('" + senha + "') WHERE usuario = '" +
                   usuario + "'");
            resultAlteracao = true;

        }catch (SQLException ec){
            System.out.println("Erro ao atualizar usuario " + ec.getMessage());
            resultAlteracao = false;
        }
        
        banco.fecharConexao();
        return resultAlteracao;
    }
    
    boolean excluiUsuario(String nome, String usuario){
        Conexao banco = new Conexao();
        
        try{
            banco.abrirConexao();
            banco.stmt = banco.con.createStatement();
            
            banco.stmt.execute("DELETE FROM usuario WHERE usuario = '" 
                                + usuario + " '");
            
            resultExclusao = true;
        }catch (SQLException ec){
            System.out.println("Erro ao excluir usuario " + ec.getMessage());
            resultExclusao = false;
        }
        
        banco.fecharConexao();
        return resultExclusao;
    }
}
