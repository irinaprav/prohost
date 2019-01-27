package com.alevel.prohost.Repositories;

import com.alevel.prohost.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {

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


}
