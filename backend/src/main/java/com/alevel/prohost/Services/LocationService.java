package com.alevel.prohost.Services;

import com.alevel.prohost.Entities.*;
import com.alevel.prohost.Operations.LocationOperations;
import com.alevel.prohost.Repositories.LocationRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationService implements LocationOperations {

    public final LocationRepositories locationRepositories;

    public LocationService(LocationRepositories locationRepositories) {
        this.locationRepositories = locationRepositories;
    }


    @Override
    public List<Location> getAll() {
        return locationRepositories.getAll();
    }

    @Override
    public List<Location> getByStatusTrue() {
        return locationRepositories.getByStatusTrue();
    }

    @Override
    public List<Location> getByType(Type locationType) {
        return locationRepositories.getByType(locationType);
    }

    @Override
    public List<AttachedResource> getPhotosById(Long locationId) {
        return locationRepositories.getPhotosById(locationId);
    }

    @Override
    public List<Location> getByPriceType(PriceType priceTypes) {
        return locationRepositories.getByPriceType(priceTypes);
    }

    @Override
    public List<Location> getByCapacity(Long capacities) {
        return locationRepositories.getByCapacity(capacities);
    }

    @Override
    public List<Location> getByAmountBetween(Long min, Long max) {
        return locationRepositories.getByAmountBetween(min, max);
    }

    @Override
    public List<User> getTenantsById(Long locId) {
        return locationRepositories.getTenantsById(locId);
    }

    @Override
    public List<Location> getByHostId(Long hostId) {
        return locationRepositories.getByHostId(hostId);
    }

    @Override
    public Location getLocationById(Long locatId) {
        return locationRepositories.getLocationById(locatId);
    }

    @Override
    public Long saveLocation(Location newLocation) {
        return newLocation.getId();
    }

    @Override
    public void updateAllLocations(Iterable<Location> allUpdatedLocations) {

    }

    @Override
    public void updateLocation(Location location) {

    }

    @Override
    public void deleteLocationById(Long id) {

    }
}
