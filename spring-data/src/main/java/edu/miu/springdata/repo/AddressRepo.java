package edu.miu.springdata.repo;

import edu.miu.springdata.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
