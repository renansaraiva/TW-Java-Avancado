package br.com.treinaweb.teste.struts2.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;
import br.com.treinaweb.teste.struts2.hibernate.util.HibernateSessionFactoryUtils;
import br.com.treinaweb.teste.struts2.models.Album;

public class AlbumDAO implements IDAOGenerico<Album, Integer> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Album> todos() {
		List<Album> albuns = null;
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		albuns = (List<Album>)session.createQuery("from Album").list();
		session.close();
		return albuns;
	}

	@Override
	public Album porId(Integer id) {
		Album album = null;
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		album = session.get(Album.class, id);
		session.close();
		return album;
	}

	@Override
	public void inserir(Album modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Album modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Album modelo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
