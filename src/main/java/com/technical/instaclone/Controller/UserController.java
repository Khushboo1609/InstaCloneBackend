package com.technical.instaclone.Controller;

import com.technical.instaclone.Entity.Users;
import com.technical.instaclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    private boolean submitUser(@RequestBody Users users)
    {
        userService.submitMetaDataofUser(users);
        return true;
    }
    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid")String userId){
        return userService.displayMetaDataofUser(userId);

    }
}
