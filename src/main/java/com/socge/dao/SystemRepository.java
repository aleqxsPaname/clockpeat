package com.socge.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.socge.model.SystemExample;

@Repository
public interface SystemRepository extends CrudRepository<SystemExample,Long> {
	

}
