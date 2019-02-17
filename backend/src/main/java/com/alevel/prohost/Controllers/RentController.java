package com.alevel.prohost.Controllers;


import com.alevel.prohost.Entities.Rent;
import com.alevel.prohost.Operations.RentOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentController {

    private final RentOperations rentOperations;
    private Logger logger = LoggerFactory.getLogger(RentController.class);

    @Autowired
    public RentController(RentOperations rentOperations) {
        this.rentOperations = rentOperations;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getAll() {
        return rentOperations.getAll();
    }

    @RequestMapping(value = "/byAgreementTrue", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getByAgreementTrue() {
        return rentOperations.getByAgreementTrue();
    }

    @RequestMapping(value = "/byUserAndByAgreementTrue", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getByUserAndByAgreementTrue() {
        return rentOperations.getByUserAndByAgreementTrue();
    }

    @RequestMapping(value = "/saveRent", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Long saveRent(Rent newRent) {
        return rentOperations.saveRent(newRent);
    }

    @RequestMapping(value = "/updateAll", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateAll(Iterable<Rent> rents) {

    }

    @RequestMapping(value = "/updateRent", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateRent(Rent rent) {

    }

    @RequestMapping(value = "/deleteRent", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteRentById(Long Id) {

    }
}
