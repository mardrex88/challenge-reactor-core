package com.example.demo.repository;

import com.example.demo.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RepositoryPlayer extends ReactiveMongoRepository<Player, Integer> {

}
