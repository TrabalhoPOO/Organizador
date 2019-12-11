/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import infra.PessoaDAO;
import infra.TarefaDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import modelo.Pessoa;
import modelo.Tarefa;

/**
 * @author ht3000974
 * @author ht3000796
 */
public class main {

    public static void main(String[] args) {

        criarPessoa();
        Pessoa p = new Pessoa();
        PessoaDAO pdao = new PessoaDAO();
        p = pdao.getById(1);
        criarTarefa(p);
        listarPessoas();
        listarTarefas();
        
    }
    
    public static void criarPessoa() {
        Pessoa p = new Pessoa();
        PessoaDAO pdao = new PessoaDAO();
        
        p.setEmail("email@ifsp.com");
        p.setNome("Viviane");
        pdao.adicionar(p);
    }
    
    public static void criarTarefa() {
        Tarefa t = new Tarefa();
        TarefaDAO tdao = new TarefaDAO();
        
        t.setTitulo("Título");
        t.setDescricao("Descrição");
        t.setDataCriacao(Calendar.getInstance());
        tdao.adicionar(t);
    }
    
    public static void criarTarefa(Pessoa pessoa) {
        Tarefa t = new Tarefa();
        TarefaDAO tdao = new TarefaDAO();
        
        t.setTitulo("Título5");
        t.setDescricao("Descrição");
        t.setDataCriacao(Calendar.getInstance());
        t.setPessoa(pessoa);
        tdao.adicionar(t);
    }
    
    public static void listarPessoas() {
        PessoaDAO pdao = new PessoaDAO();
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas = pdao.obterTodos();
        pessoas.forEach(pessoa->System.out.println(pessoa.toString()));
    }
    
    public static void listarTarefas() {
        TarefaDAO tdao = new TarefaDAO();
        
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas = tdao.obterTodos();
        tarefas.forEach(tarefa->System.out.println(tarefa.toString()));
        
    }
}
