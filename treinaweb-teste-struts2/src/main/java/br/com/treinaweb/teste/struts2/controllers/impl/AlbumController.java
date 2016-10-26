package br.com.treinaweb.teste.struts2.controllers.impl;

import br.com.treinaweb.teste.struts2.controllers.interfaces.Controller;
import br.com.treinaweb.teste.struts2.dao.impl.AlbumDAO;
import br.com.treinaweb.teste.struts2.models.Album;

public class AlbumController extends Controller<Album, Integer>{

	public AlbumController() {
		super(new AlbumDAO());
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
			Album album = dao.porId(getId());
			setModelo(album);
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
		// TODO Auto-generated method stub
		return null;
	}
	
}
