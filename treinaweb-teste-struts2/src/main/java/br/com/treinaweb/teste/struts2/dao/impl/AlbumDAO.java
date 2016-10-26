package br.com.treinaweb.teste.struts2.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transacao = session.beginTransaction();
		session.save(modelo);
		transacao.commit();
		session.close();
	}
	
	@Override
	public void atualizar(Album modelo) {
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transacao = session.beginTransaction();
		session.update(modelo);
		transacao.commit();
		session.close();
	}

	@Override
	public void deletar(Album modelo) {
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		session.delete(modelo);
		session.close();
	}
	
	
}
