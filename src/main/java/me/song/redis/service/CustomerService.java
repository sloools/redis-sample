package me.song.redis.service;

import me.song.redis.entity.Customer;

public interface CustomerService {
    void saveCustomer(Customer customer);

    Customer getCustomerId(Integer id);
}
