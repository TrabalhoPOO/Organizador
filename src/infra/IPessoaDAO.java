/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author ht3000974
 */
public interface IPessoaDAO {
    public void adicionar(Pessoa p);
    public List<Pessoa> obterTodos();
}
