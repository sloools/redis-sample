package me.song.redis.service;

import lombok.RequiredArgsConstructor;
import me.song.redis.entity.Address;
import me.song.redis.entity.Customer;
import me.song.redis.repository.RedisRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final RedisRepository redisRepository;

    @Override
    public void saveCustomer(Customer customer) {

        redisRepository.save(customer);
    }

    @Override
    public Customer getCustomerId(Integer id) {
        Customer customer = redisRepository.findById(id).orElseGet(null);

        return customer;
    }

}
