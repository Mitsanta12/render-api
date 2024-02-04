package com.javaadr.renderapi.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L, "Toky", "Niaina", "tokiniaina@gmail.com"),
            new Customer(2L, "Nantenaina", "public", "nantenaina@gmail.com"),
            new Customer(3L, "Rakoto", "Safidy","safidyrak@gmail.com"),
            new Customer(4L, "Fytia","Andriah","andriah@gmail.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
}