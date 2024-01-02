package com.comexport.accounts.user.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comexport.accounts.user.infraestructure.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

}
