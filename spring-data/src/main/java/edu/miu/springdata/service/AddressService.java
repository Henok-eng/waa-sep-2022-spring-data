package edu.miu.springdata.service;

import edu.miu.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);
    Address getByID(int id);
    void update(int id, Address addressreq);
    void delete(int id);
    List<Address> findAll();
}
