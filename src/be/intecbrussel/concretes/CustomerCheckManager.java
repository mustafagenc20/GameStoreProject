package be.intecbrussel.concretes;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
