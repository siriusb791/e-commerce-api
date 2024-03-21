package com.sirius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
