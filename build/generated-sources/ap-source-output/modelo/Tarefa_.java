package modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefa.class)
public abstract class Tarefa_ {

	public static volatile SingularAttribute<Tarefa, String> titulo;
	public static volatile SingularAttribute<Tarefa, Integer> id;
	public static volatile SingularAttribute<Tarefa, Calendar> dataCriacao;
	public static volatile SingularAttribute<Tarefa, String> descricao;

	public static final String TITULO = "titulo";
	public static final String ID = "id";
	public static final String DATA_CRIACAO = "dataCriacao";
	public static final String DESCRICAO = "descricao";

}

