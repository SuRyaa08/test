package com.sapi.restsapi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sapi.restsapi.entity.user;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {

	user findByName(String name);
}
