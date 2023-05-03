
package Model;

/**
 *
 * @author rafael
 */
public class Usuario {
     private Integer idUsuario;
    
    private String email,cPF,telefone,senha,nome;
    
    public Usuario(){}
    
    public Usuario(String email,String cpf,String telefone,String senha,String nome){
        this.cPF = cpf;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        
                
    }
    
}
