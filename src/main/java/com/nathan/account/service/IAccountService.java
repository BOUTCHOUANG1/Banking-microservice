package com.nathan.account.service;

import com.nathan.account.dto.CustomerDto;

public interface IAccountService {

/**
 * Creates a new account for a customer
 * @param customerDto The customer data transfer object containing customer information
 */
void createAccount(CustomerDto customerDto);

/**
 * Fetches account details based on the provided mobile number
 * @param mobileNumber The mobile number of the customer
 * @return CustomerDto containing the account details
 */
CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
