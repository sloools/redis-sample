package me.song.redis.service;

import me.song.redis.entity.Address;
import me.song.redis.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void saveCustomerRedisTest(){

        Customer me = Customer.builder()
                .id(1)
                .name("Song")
                .address(Address.builder().Country("Korea").City("Seoul").build())
                .build();

        customerService.saveCustomer(me);
    }

    @Test
    public void findCustomerRedisTest(){
        Customer me = customerService.getCustomerId(1);

        assertThat(me.getName()).isEqualTo("Song");



    }
}
