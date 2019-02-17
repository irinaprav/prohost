package com.alevel.prohost.Controllers;

import com.alevel.prohost.Entities.*;
import com.alevel.prohost.Operations.LocationOperations;
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
@RequestMapping("/location")
public class LocationController {


    private final LocationOperations locationOperations;
    private Logger logger = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    public LocationController(LocationOperations locationOperations) {
        this.locationOperations = locationOperations;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getAll() {
        return locationOperations.getAll();

    }

    @RequestMapping(value = "/active", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByStatusTrue() {
        return locationOperations.getByStatusTrue();
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByType(Type type) {
        return locationOperations.getByType(type);
    }

    @RequestMapping(value = "/photos", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<AttachedResource> getPhotosById(Long id) {
        return locationOperations.getPhotosById(id);
    }

    @RequestMapping(value = "/priceType", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByPriceType(PriceType priceType) {
        return locationOperations.getByPriceType(priceType);
    }

    @RequestMapping(value = "/capacity", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByCapacity(Long capacity) {
        return locationOperations.getByCapacity(capacity);
    }

    @RequestMapping(value = "/amountBetween", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByAmountBetween(Long min, Long max) {
        return locationOperations.getByAmountBetween(min, max);
    }

    @RequestMapping(value = "/byTenants", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> getTenantsById(Long id) {
        return locationOperations.getTenantsById(id);
    }

    @RequestMapping(value = "/byHost", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByHostId(Long id) {
        return locationOperations.getByHostId(id);
    }

    @RequestMapping(value = "/byId", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Location getLocationById(Long id) {
        return locationOperations.getLocationById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Long saveLocation(Location newLocation) {
        return locationOperations.saveLocation(newLocation);
    }

    @RequestMapping(value = "/updateAll", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateAllLocations(Iterable<Location> locations) {
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateLocation(Location location) {
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteLocationById(Long id) {
    }


}
