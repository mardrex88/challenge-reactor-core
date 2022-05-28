package com.example.demo.controller;

import com.example.demo.Player;
import com.example.demo.services.ServicePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/player")
public class ControllerPlayer {
    @Autowired
    private ServicePlayer servicePlayer;

    @GetMapping("/players")
    public Flux<Player> listar(){

        return servicePlayer.lista().buffer(100).flatMap(x -> Flux.fromStream(x.parallelStream()));
    }
}
