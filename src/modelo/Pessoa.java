
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author ht3000974
 * @author ht3000796
 */
@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
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

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }
    
    
    

}
