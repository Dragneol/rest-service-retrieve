package stu.duongpth.restserviceretrieve.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.duongpth.restserviceretrieve.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
