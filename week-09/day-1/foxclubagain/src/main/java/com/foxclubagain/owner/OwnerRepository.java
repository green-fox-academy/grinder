package com.foxclubagain.owner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {


}
