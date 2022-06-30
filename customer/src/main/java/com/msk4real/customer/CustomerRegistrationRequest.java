package com.msk4real.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String secondName,
        String email
)
{
}
