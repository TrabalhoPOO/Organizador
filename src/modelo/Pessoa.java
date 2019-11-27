
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author ht3000974
 * @author ht3000796
 */
public class Pessoa implements Serializable{
    private int id;
    private String nome;
    private String email;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Tarefa> tarefa = new ArrayList<Tarefa>();

    public Pessoa() {
    }
    
    public void adicinarTarefa(Tarefa t){
        t.setPessoa(this);
        this.tarefa.add(t);
    }
    

//<editor-fold defaultstate="collapsed" desc="getters/setters">
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Tarefa> getTarefa() {
        return tarefa;
    }
    
    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }
//</editor-fold>
    
    
    

}
