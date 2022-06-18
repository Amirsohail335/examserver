package com.exam.examserver.repo;


//import com.exam.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
