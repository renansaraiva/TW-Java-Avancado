package br.com.treinaweb.teste.struts2.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;
import br.com.treinaweb.teste.struts2.models.Musica;

public class MusicaDAO implements IDAOGenerico<Musica, Integer> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Musica> todos() {
		List<Musica> musicas = null;
		/* 
		 * UTILIZANDO HIBERNATE
		 * 
		 * SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		 * Session session = sf.openSession();
		 * albuns = (List<Album>)session.createQuery("from Album").list();
		 * session.close();
		 * 
		 */
		
		/* UTILIZANDO JPA */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		musicas = entityManager.createQuery("from Musica").getResultList();
		entityManager.close();
		entityManagerFactory.close();
		return musicas;
	}

	@Override
	public Musica porId(Integer id) {
		Musica musica = null;
		/*
		 * UTILIZANDO HIBERNATE
		 * 
		 * SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		 * Session session = sf.openSession();
		 * album = session.get(Album.class, id);
		 * session.close();
		 * 
		 */
		
		/* UTILIZANDO JPA */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		musica = entityManager.find(Musica.class, id);
		entityManager.close();
		entityManagerFactory.close();
		return musica;
	}

	@Override
	public void inserir(Musica modelo) {
		/*
		 * UTILIZANDO HIBERNATE
		 *
		 *SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		 *Session session = sf.openSession();
		 *Transaction transacao = session.beginTransaction();
		 *session.save(modelo);
		 *transacao.commit();
		 *session.close();
		 *
		 */
		
		/* UTILIZANDO JPA */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	@Override
	public void atualizar(Musica modelo) {
		/*
		 * UTILIZANDO HIBERNATE
		 *
		 *SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		 *Session session = sf.openSession();
		 *Transaction transacao = session.beginTransaction();
		 *session.update(modelo);
		 *transacao.commit();
		 *session.close();
		 */
		
		/* UTILIZANDO JPA */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	public void deletar(Musica modelo) {
		/*
		 * UTILIZANDO HIBERNATE
		 *
		 *SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		 *Session session = sf.openSession();
		 *Transaction transacao = session.beginTransaction();
		 *session.delete(modelo);
		 *transacao.commit();
		 *session.close();
		 */
		
		/* UTILIZANDO JPA */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		modelo = entityManager.find(Musica.class, modelo.getId());
		modelo.setAlbum(null);
		entityManager.remove(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
}
