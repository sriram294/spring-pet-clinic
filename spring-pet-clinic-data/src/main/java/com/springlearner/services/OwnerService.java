package com.springlearner.services;

import com.springlearner.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
