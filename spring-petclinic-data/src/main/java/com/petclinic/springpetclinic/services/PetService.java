package com.petclinic.springpetclinic.services;

import java.util.Set;

import com.petclinic.springpetclinic.model.Owner;
import com.petclinic.springpetclinic.model.Pet;

public interface PetService {

	public Pet findById(Long id);

	public Pet save(Owner owner);

	public Set<Pet> findAll();

}
