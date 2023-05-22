package com.bhaktapur.schoolmanagement.repositories;

import com.bhaktapur.schoolmanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
