package org.launchcode.safehouse.models.data;

import org.springframework.data.repository.*;
import org.launchcode.safehouse.models.House;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface HouseDao extends CrudRepository<House, Integer>{

}
