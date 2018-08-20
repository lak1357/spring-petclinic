package com.petclinic.springpetclinic.services;

import java.util.Set;

import com.petclinic.springpetclinic.model.Owner;

public interface OwnerService {

	public Owner findByLastName(String lastName);

	public Owner findById(Long id);

	public Owner save(Owner owner);

	public Set<Owner> findAll();

}
