package br.com.treinaweb.teste.struts2.controllers.impl;

import br.com.treinaweb.teste.struts2.controllers.interfaces.Controller;
import br.com.treinaweb.teste.struts2.dao.impl.MusicaDAO;
import br.com.treinaweb.teste.struts2.models.Musica;

public class MusicaController extends Controller<Musica, Integer>{

	public MusicaController() {
		super(new MusicaDAO());
	}

	@Override
	public String listar() {
		try {
			this.setModelos(this.dao.todos());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String detalhar() {
		try {
			this.setModelo(dao.porId(this.getId()));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String inserir() {
		try {
			dao.inserir(getModelo());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	@Override
	public String prepararAlterar() {
		try {
			Musica musica = dao.porId(getId());
			setModelo(musica);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String alterar() {
		try {
			dao.atualizar(getModelo());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String deletar() {
		try {
			Musica musica = dao.porId(getId());
			dao.deletar(musica);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
}
