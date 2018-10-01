package stu.duongpth.restserviceretrieve.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stu.duongpth.restserviceretrieve.domain.Customer;
import stu.duongpth.restserviceretrieve.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
//        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
