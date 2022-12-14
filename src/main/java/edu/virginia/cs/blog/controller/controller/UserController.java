package edu.virginia.cs.blog.controller.controller;

import edu.virginia.cs.blog.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/logIn")
    public ResponseEntity<User> logIn() {
        return ResponseEntity.ok(new User("a", "b", "c"));
    }
}
