package com.alevel.prohost.Operations;

import com.alevel.prohost.Entities.Rent;

import java.util.List;

public interface RentOperations {

    List<Rent> getAll();

    List<Rent> getByAgreementTrue(Rent agreement);

    List<Rent> getByUserAndByAgreementTrue();

    List<Rent> getByRating(Double rating);

    Long saveRent(Rent newRent);

    void updateAll(Iterable<Rent> rents);

    void updateRent(Rent rent);

    void deleteRentById(Long Id);
}