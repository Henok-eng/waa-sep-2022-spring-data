package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Address;
import edu.miu.springdata.repo.AddressRepo;
import edu.miu.springdata.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Override
    public void save(Address address) {

    }

    @Override
    public Address getByID(int id) {
        return null;
    }

    @Override
    public void update(int id, Address addressreq) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Address> findAll() {
        return null;
    }
}
