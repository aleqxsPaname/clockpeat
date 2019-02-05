package com.socge.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.socge.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {
	

}
