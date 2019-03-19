package com.codecool.springjpademo.repository;

import com.codecool.springjpademo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
