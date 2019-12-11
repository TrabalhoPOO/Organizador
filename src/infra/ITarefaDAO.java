/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.List;
import modelo.Tarefa;

/**
 * @author ht3000974
 * @author ht3000796
 */
public interface ITarefaDAO {
    public void adicionar(Tarefa t);
    public List<Tarefa> obterTodos();
    
}
