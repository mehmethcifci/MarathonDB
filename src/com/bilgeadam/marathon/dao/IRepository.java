package com.bilgeadam.marathon.dao;

import java.util.ArrayList;

import org.hibernate.Session;

import com.bilgeadam.marathon.utils.HibernateSession;

public interface IRepository <T>{
	
	public void create(T entity);
	
	public void update(long id,T entity);
	
	public void delete(long id);
	
	default ArrayList<T> listAll() {
		return null;
	}
	
	default T find(long id) {
		return null;
	}
	
	default Session databaseConnectionHibernate() {
		return HibernateSession.getSessionFactory().openSession();

	}
}
