package com.gb.customerrewards.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private long customerId;
    private String addressLine1;
    private String addressLine2;
    private String street;
    private String city;
    private String state;
    private CountryCode country;
    private int pinCode;
}
