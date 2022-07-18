package com.gb.customerrewards.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private long customerId;
    private CustomerProfile customerProfile;
}
