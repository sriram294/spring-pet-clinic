package com.springlearner.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    HashMap<ID,T> hashMap=new HashMap();

    T save(ID id,T object){
        hashMap.put(id,object);
        return object;
    }

    T findById(ID id){
        return hashMap.get(id);
    }

    Set<T> findAll(){
        return new HashSet<T>(hashMap.values());
    }

    void deleteById(ID id){
        hashMap.remove(id);
    }

    void delete(T object){
        hashMap.entrySet().removeIf(entry ->entry.getValue().equals(object) );
    }
}
