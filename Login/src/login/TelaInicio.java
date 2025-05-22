package login;

import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaInicio extends JFrame{
    private final JPanel tela;
    
    private boolean exclusaoValida;
    
    public TelaInicio(){
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu - Senac");
        
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 426, 212);
        
        tela = new JPanel();
        tela.setBackground(SystemColor.gray);
        setContentPane(tela);
        tela.setLayout(null);
        
        JLabel lblUsuario = new JLabel("Bem vindo " + Usuario.nome);
        lblUsuario.setBounds(24, 65, 200, 15);
        tela.add(lblUsuario);
        
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds (2, 130, 117, 25);
        tela.add(btnExcluir);
        
        JButton btnAlterar = new JButton("Alterar Dados");
        btnAlterar.setBounds(150, 130, 117, 25);
        tela.add(btnAlterar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(300, 130, 117, 25);
        tela.add(btnVoltar);
        
        btnVoltar.addActionListener((ActionEvent e) -> {
            try{
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.setVisible(true);
                dispose();
            }catch (Exception ec) {
                System.out.println("Erro ao acessar a tela login" + ec.getMessage());
            }
        });
        
        btnAlterar.addActionListener((ActionEvent e) -> {
            try {
                TelaAlteracao telaAlterar = new TelaAlteracao();
                telaAlterar.setVisible(true);
                dispose();
            }catch(Exception ec){
                System.out.println("Erro ao acessar tela de alteracao" + ec.getMessage());
            }
        });
        
        btnExcluir.addActionListener((ActionEvent e) -> {
            try {
                Object[] options = {"Sim", "Não"};
                int opcao = JOptionPane.showOptionDialog(null,
                        Usuario.nome + 
                                ", deseja se excluir?", "Atencao",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null,
                                options, options[0]);
                
                if (opcao == 0){
                    Usuario usu = new Usuario();
                    
                    exclusaoValida = 
                            usu.excluiUsuario(Usuario.usuario,Usuario.nome);
                    
                    if (exclusaoValida == true){
                        JOptionPane.showMessageDialog(null,
                                "Usuario deletado corretamente, voltaremos"
                                    + "a tela de login",
                                "Atenção",
                                JOptionPane.INFORMATION_MESSAGE);
                        
                        TelaLogin tLogin = new TelaLogin();
                        tLogin.abreTela();
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "Problemas ao excluir o usuario",
                                "Atencao",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }catch(HeadlessException ec){
                System.out.println("Erro ao excluir usuario" + ec.getMessage());
            }
        });
        
    }
    
    public void abreTela(){
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.setVisible(true);
    };    
}
