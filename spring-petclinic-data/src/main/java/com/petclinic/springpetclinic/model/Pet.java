package com.petclinic.springpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

	private LocalDate birthDay;
	private PetType petType;
	private Owner owner;

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Pet [birthDay=" + birthDay + ", petType=" + petType + ", owner=" + owner + "]";
	}

}
