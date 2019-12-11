/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Tarefa;

/**
 * @author ht3000974
 * @author ht3000796
 */
public class TarefaDAO implements ITarefaDAO{

    @Override
    public void adicionar(Tarefa t) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Tarefa> obterTodos() {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        List<Tarefa> tarefas = new ArrayList<>();
        try {
            Query query = em.createQuery("from Tarefa");
            tarefas = query.getResultList();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tarefas;
    }
    
    
}
