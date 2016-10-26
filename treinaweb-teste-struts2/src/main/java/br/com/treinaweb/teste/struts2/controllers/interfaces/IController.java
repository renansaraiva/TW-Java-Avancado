package br.com.treinaweb.teste.struts2.controllers.interfaces;

import java.util.List;

public abstract class IController<M> {

	public static String SUCCESS = "SUCCESS";
	public static String ERROR = "ERROR";
	
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

}
