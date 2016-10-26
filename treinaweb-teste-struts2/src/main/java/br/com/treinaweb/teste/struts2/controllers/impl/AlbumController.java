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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String detalhar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inserir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
