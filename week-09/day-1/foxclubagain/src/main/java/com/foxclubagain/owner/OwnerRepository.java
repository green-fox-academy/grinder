package com.foxclubagain.owner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
