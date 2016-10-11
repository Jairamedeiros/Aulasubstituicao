
package controle;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Pessoa;

@ManagedBean
@SessionScoped
public class ControlePessoaBean {
    private List<Pessoa> pessoas;
    public Pessoa pessoa;

    public ControlePessoaBean(){
        inicializarValores();
        pessoas= new ArrayList<Pessoa>();
        
        
    }

    private void inicializarValores() {
        pessoa = new Pessoa();
        
    }
    
    
    public String cadastrar(){
        pessoas.add(pessoa);
        inicializarValores();
        return "/index.xhtml";
        
    }
    
    
    
    public void excluir(Pessoa pessoa){
        pessoas.remove(pessoa);
        
        
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
