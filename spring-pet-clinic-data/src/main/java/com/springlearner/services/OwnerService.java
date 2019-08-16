package com.springlearner.services;

import com.springlearner.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long Id);

    Owner findByLastName(String lastName);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
