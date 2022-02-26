package me.song.redis.repository;

import me.song.redis.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<Customer, Integer> {
}
