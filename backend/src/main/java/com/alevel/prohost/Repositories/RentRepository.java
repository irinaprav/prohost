package com.alevel.prohost.Repositories;

import com.alevel.prohost.Entities.Rent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentRepository extends CrudRepository<Rent, Long> {
    List<Rent> getAll();

    List<Rent> getByAgreementTrue();

    List<Rent> getByUserAndByAgreementTrue();

}