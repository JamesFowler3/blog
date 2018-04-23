package com.example.blog.repositories;

import com.example.blog.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

   Users findById (Long id);
   Users findByUsername(String username);
}
