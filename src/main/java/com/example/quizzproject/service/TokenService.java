package com.example.quizzproject.service;

import com.example.quizzproject.model.Token;

public interface TokenService {
    Token createToken(Token token);
    Token findByToken(String token);
}
