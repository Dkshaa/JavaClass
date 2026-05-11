package com.diksha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.diksha.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
