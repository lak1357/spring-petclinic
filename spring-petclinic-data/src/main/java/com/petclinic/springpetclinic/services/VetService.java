package com.petclinic.springpetclinic.services;

import java.util.Set;

import com.petclinic.springpetclinic.model.Owner;
import com.petclinic.springpetclinic.model.Pet;
import com.petclinic.springpetclinic.model.Vet;

public interface VetService {

	public Vet findById(Long id);

	public Vet save(Owner owner);

	public Set<Vet> findAll();

}
