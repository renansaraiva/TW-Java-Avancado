package br.com.treinaweb.teste.struts2.dao.interfaces;

import java.util.List;

public interface IDAOGenerico<M, K> {

	List<M> todos();
	M porId(K id);
	void inserir(M modelo);
	void atualizar(M modelo);
	void deletar(M modelo);
	
}
