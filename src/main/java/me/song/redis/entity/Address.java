package me.song.redis.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Address {
    String Country;
    String City;
}
