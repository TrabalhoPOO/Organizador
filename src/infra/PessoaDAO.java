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
import modelo.Pessoa;

/**
 * @author ht3000974
 * @author ht3000796
 */
public class PessoaDAO implements IPessoaDAO{

    @Override
    public void adicionar(Pessoa p) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Pessoa> obterTodos() {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            Query query = em.createQuery("from Pessoa");
            pessoas = query.getResultList();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return pessoas;
    }
    
    public Pessoa getById(int id) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        Pessoa p = new Pessoa();
        try {
            p = em.find(Pessoa.class, id);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return p;
    }
}
