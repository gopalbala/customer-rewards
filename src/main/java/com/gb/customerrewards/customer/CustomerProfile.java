package com.gb.customerrewards.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerProfile {
    private long customerId;
    private String userName;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private Contact contact;
}
