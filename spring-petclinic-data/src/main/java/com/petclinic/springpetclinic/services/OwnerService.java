package com.petclinic.springpetclinic.services;

import com.petclinic.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	public Owner findByLastName(String lastName);

}
