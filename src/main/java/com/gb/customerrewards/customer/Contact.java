package com.gb.customerrewards.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private long customerId;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryPhone;
    private String secondaryPhone;
    private ContactPreference contactPreference;
    private CallPreference callPreference;
}
