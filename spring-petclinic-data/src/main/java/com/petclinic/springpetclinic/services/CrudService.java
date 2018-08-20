package com.petclinic.springpetclinic.services;

import java.util.Set;


public interface CrudService<T, ID> {

	public Set<T> findAll();

	T findById(ID id);

	T save(T entity);

	void delete(T entity);

	void deleteById(ID id);

}
