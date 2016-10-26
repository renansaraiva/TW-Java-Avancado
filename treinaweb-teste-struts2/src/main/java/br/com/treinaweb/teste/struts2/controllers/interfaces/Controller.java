package br.com.treinaweb.teste.struts2.controllers.interfaces;

import java.util.List;

import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;

public abstract class Controller<M, K> {

	public static String SUCCESS = "SUCCESS";
	public static String ERROR = "ERROR";
	
	protected IDAOGenerico<M, K> dao;
	
	protected M modelo;
	protected List<M> modelos;

	public M getModelo() {
		return modelo;
	}

	public void setModelo(M modelo) {
		this.modelo = modelo;
	}

	public List<M> getModelos() {
		return modelos;
	}

	public void setModelos(List<M> modelos) {
		this.modelos = modelos;
	}

	public Controller(IDAOGenerico<M, K> dao) {
		this.dao = dao;
	}
	
	public abstract String listar();
	public abstract String detalhar();
	public abstract String inserir();
	public abstract String alterar();
	public abstract String deletar();
	
}
