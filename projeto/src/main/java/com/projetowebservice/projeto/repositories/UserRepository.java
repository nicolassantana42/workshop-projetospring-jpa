package com.projetowebservice.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.projeto.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
