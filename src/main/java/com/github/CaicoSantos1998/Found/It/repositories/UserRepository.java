package com.github.CaicoSantos1998.Found.It.repositories;

import com.github.CaicoSantos1998.Found.It.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
