package com.alevel.prohost.Services;

import com.alevel.prohost.Entities.Rent;
import com.alevel.prohost.Operations.RentOperations;
import com.alevel.prohost.Repositories.RentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService implements RentOperations {

    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public List<Rent> getAll() {
        return rentRepository.getAll();
    }

    @Override
    public List<Rent> getByAgreementTrue(Rent agreement) {
        return rentRepository.getByAgreementTrue(agreement);
    }

    @Override
    public List<Rent> getByUserAndByAgreementTrue() {
        return rentRepository.getByUserAndByAgreementTrue();
    }

    @Override
    public List<Rent> getByRating(Double rating) {
        return rentRepository.getByRating(rating);
    }

    @Override
    public Long saveRent(Rent newRent) {
        return newRent.getId();
    }

    @Override
    public void updateAll(Iterable<Rent> rents) {
    }

    @Override
    public void updateRent(Rent rent) {
    }

    @Override
    public void deleteRentById(Long Id) {
    }
}
