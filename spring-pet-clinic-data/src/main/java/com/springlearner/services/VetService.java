package com.springlearner.services;

import com.springlearner.model.Vet;

import java.util.Set;

public interface VetService {

    Vet save(Vet vet);

    Set<Vet> findAll();

    Vet findById(Long id);

}
