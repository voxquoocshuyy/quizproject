package com.example.quizzproject.controller;

import com.example.quizzproject.entity.JwtUtil;
import com.example.quizzproject.model.Token;
import com.example.quizzproject.model.User;
import com.example.quizzproject.model.UserPrincipal;
import com.example.quizzproject.service.TokenService;
import com.example.quizzproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user){
        String userRe = user.getUsername();
        String userDb = (userService.findByUsername(user.getUsername())).getUsername();
        if(userDb != null && userDb.equals(userRe)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username đã tồn tại");
        }else {
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
        }
    }

    @Autowired
    private TokenService tokenService;

    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        UserPrincipal userPrincipal = userService.findByUsername(user.getUsername());
        if (null == user || !new BCryptPasswordEncoder().matches(user.getPassword(), userPrincipal.getPassword())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("tài khoản hoặc mật khẩu không chính xác");
        }
        Token token = new Token();
        token.setToken(jwtUtil.generateToken(userPrincipal));
        token.setTokenExpDate(jwtUtil.generateExpirationDate());
        token.setCreatedBy(userPrincipal.getUserId());
        tokenService.createToken(token);
        return ResponseEntity.ok(token.getToken());
    }

}
