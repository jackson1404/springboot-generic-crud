package com.jackson.generic_crud_testing.user.repository;

import com.jackson.generic_crud_testing.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
