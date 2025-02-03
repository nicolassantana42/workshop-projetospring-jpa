package com.projetowebservice.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservice.projeto.entities.User;
import com.projetowebservice.projeto.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }
}
