package com.example.demo.services;

import com.example.demo.Player;
import com.example.demo.repository.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ServicePlayer {

    @Autowired
    private RepositoryPlayer repositoryPlayer;

    public Flux<Player> lista(){

        return (repositoryPlayer.findAll());
    }

}
