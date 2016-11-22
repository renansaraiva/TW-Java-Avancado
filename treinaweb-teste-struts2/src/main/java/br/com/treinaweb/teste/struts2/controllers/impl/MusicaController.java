package br.com.treinaweb.teste.struts2.controllers.impl;

import java.util.List;

import br.com.treinaweb.teste.struts2.controllers.interfaces.Controller;
import br.com.treinaweb.teste.struts2.dao.impl.AlbumDAO;
import br.com.treinaweb.teste.struts2.dao.impl.MusicaDAO;
import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;
import br.com.treinaweb.teste.struts2.models.Album;
import br.com.treinaweb.teste.struts2.models.Musica;

public class MusicaController extends Controller<Musica, Integer> {

	private List<Album> albuns;
	private int albumId;
	
	private IDAOGenerico<Album, Integer> albumDAO = new AlbumDAO();

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

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
	
	public String prepararInserir() {
		try {
			albuns = albumDAO.todos();
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String inserir() {
		try {
			Musica musica = getModelo();
			Album albumSelecionado = albumDAO.porId(getAlbumId());
			musica.setAlbum(albumSelecionado);
			dao.inserir(musica);
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
