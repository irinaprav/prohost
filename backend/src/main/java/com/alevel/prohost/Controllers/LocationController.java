package com.alevel.prohost.Controllers;

import com.alevel.prohost.Entities.*;
import com.alevel.prohost.Operations.LocationOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


@Controller
@RequestMapping("/location")
public class LocationController {


    private final LocationOperations locationOperations;
    private Logger logger = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    public LocationController(LocationOperations locationOperations) {
        this.locationOperations = locationOperations;
    }

    @RequestMapping("/location/all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getAll(){
        return locationOperations.getAll() ;

    }

    @RequestMapping(value = "/location/active", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByStatusTrue(){
        return locationOperations.getByStatusTrue();
    }

    @RequestMapping(value = "/location/type", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByType (Type type){
        return locationOperations.getByType(type);
    }

    @RequestMapping(value = "/location/&photos", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<AttachedResource> getPhotosById(Long id){
        return locationOperations.getPhotosById(id);
    }

    @RequestMapping(value = "/location/pricetype", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByPriceType(PriceType priceType){
        return locationOperations.getByPriceType(priceType);
    }

    @RequestMapping(value = "/location/capacity", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByCapacity(Long capacity) {
        return locationOperations.getByCapacity(capacity);
    }

    @RequestMapping(value = "/location/amountbetween", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByAmountBetween(Long min, Long max){
        return locationOperations.getByAmountBetween(min, max);
    }

    @RequestMapping(value = "/location/bytenants", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> getTenantsById(Long id){
        return locationOperations.getTenantsById(id);
    }

    @RequestMapping(value = "/location/byhost", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Location> getByHostId (Long id){
        return locationOperations.getByHostId(id);
    }

    @RequestMapping(value = "/location/byid", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Location getLocationById(Long id) {
        return locationOperations.getLocationById(id);
    }

    @RequestMapping(value = "/location/save", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Long saveLocation(Location location) {
        return locationOperations.saveLocation(location);
    }

    @RequestMapping(value = "/location/updateall", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateAllLocations(Iterable<Location> locations)  {
    }

    @RequestMapping(value = "/location/update", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateLocation(Location location){}

    @RequestMapping(value = "/location/delete", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteLocationById(Long id){}
















}
