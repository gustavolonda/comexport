package com.comexport.commons.api.domains.services;


import java.util.List;

import com.comexport.commons.api.domains.data.ResponseBase;


public interface IEndPointService  < T, ID> {
	
	List<T> saveAll(List<T> entityList);
	
	 T save(T entity);

	 T update(T entity);
	
	 T delete(ID id);
	
	 T getById(ID id);
	
	 List<T> getAll();
	 
	
	 
}