package com.springlearner.services.map;

import com.springlearner.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    HashMap<Long,T> hashMap=new HashMap();

    T save(T object){

        if(object != null){
            if(object.getId() == null)
                object.setId(getNextId());
            hashMap.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object can not be null");
        }

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

    Long getNextId(){

        Long nextId=null;

       try{
            nextId=Collections.max(hashMap.keySet()) +1;
        }
       catch(NoSuchElementException e){
           nextId=1L;
       }
         return nextId;

    }
}
