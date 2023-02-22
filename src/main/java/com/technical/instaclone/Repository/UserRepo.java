package com.technical.instaclone.Repository;

import com.technical.instaclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UserRepo extends CrudRepository<Users, Id>{
Users save(Users user);
Users findByUserId(String userId);

}
