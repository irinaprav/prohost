package com.alevel.prohost.Operations;

import com.alevel.prohost.Entities.*;

import java.util.List;

public interface LocationOperations {

    List<Location> getAll();

    List<Location> getByStatusTrue();

    List<Location> getByType(Type locationType);

    List<AttachedResource> getPhotosById(Long locationId);

    List<Location> getByPriceType(PriceType priceTypes);

    List<Location> getByCapacity(Long capacities);

    List<Location> getByAmountBetween(Long min, Long max);

    List<User> getTenantsById(Long locId);

    List<Location> getByHostId(Long hostId);

    Location getLocationById(Long locatId);

    Long saveLocation(Location newLocation);

    void updateAllLocations(Iterable<Location> allUpdatedLocations);

    void updateLocation(Location location);

    void deleteLocationById(Long id);

}
