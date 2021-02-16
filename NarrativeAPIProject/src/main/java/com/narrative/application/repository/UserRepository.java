package com.narrative.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.narrative.application.model.UserRecords;

@Repository
public interface UserRepository extends JpaRepository<UserRecords, Long>{
	
	@Procedure(name = "getUniqueUsersByTimestamp")
	UserRecords getUniqueUsersByTimestamp(@Param("epochTime") Long epochTime);

	
}
