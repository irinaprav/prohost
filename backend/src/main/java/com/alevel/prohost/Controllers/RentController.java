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

    @RequestMapping(value = "/rent/all", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getAll() {
        return rentOperations.getAll();
    }

    @RequestMapping(value = "/rent/byAgreementTrue", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getByAgreementTrue() {
        return rentOperations.getByAgreementTrue();
    }

    @RequestMapping(value = "/rent/byUserAndByAgreementTrue", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Rent> getByUserAndByAgreementTrue() {
        return rentOperations.getByUserAndByAgreementTrue();
    }

    @RequestMapping(value = "/rent/saveRent", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Long saveRent(Rent newRent) {
        return rentOperations.saveRent(newRent);
    }

    @RequestMapping(value = "/rent/updateAll", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateAll(Iterable<Rent> rents) {

    }

    @RequestMapping(value = "/rent/updateRent", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateRent(Rent rent) {

    }

    @RequestMapping(value = "/rent/deleteRent", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteRentById(Long Id) {

    }
}
