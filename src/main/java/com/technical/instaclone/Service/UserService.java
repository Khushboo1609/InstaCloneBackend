package com.technical.instaclone.Service;

import com.technical.instaclone.Entity.Users;
import com.technical.instaclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
 public Users submitMetaDataofUser(Users user)
 {
     return userRepo.save(user);
 }
    public Users displayMetaDataofUser(String userId)
    {
      return userRepo.findByUserId(userId);
    }
}
