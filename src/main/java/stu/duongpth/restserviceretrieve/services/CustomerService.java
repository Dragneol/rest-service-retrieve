package stu.duongpth.restserviceretrieve.services;

import stu.duongpth.restserviceretrieve.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
