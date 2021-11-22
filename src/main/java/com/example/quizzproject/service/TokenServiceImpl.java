package com.example.quizzproject.service;

import com.example.quizzproject.model.Token;
import com.example.quizzproject.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token){
        return tokenRepository.saveAndFlush(token);
    }
    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
