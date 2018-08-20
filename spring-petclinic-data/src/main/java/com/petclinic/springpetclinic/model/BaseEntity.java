package com.petclinic.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -3345529394415334487L;

	private Long id;

	public BaseEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
