package com.example.customer_api.service;

import java.util.List;

import com.example.customer_api.dto.CustomerRequestDTO;
import com.example.customer_api.dto.CustomerResponseDTO;
import com.example.customer_api.dto.CustomerUpdateDTO;

public interface CustomerService {
    
    List<CustomerResponseDTO> getAllCustomers();
    
    CustomerResponseDTO getCustomerById(Long id);
    
    CustomerResponseDTO createCustomer(CustomerRequestDTO requestDTO);
    
    CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO requestDTO);
    
    CustomerResponseDTO partialUpdateCustomer(Long id, CustomerUpdateDTO updateDTO);
    
    void deleteCustomer(Long id);
    
    List<CustomerResponseDTO> searchCustomers(String keyword);
    
    List<CustomerResponseDTO> getCustomersByStatus(String status);
    
    List<CustomerResponseDTO> advancedSearch(String name, String email, String status);
    
    org.springframework.data.domain.Page<CustomerResponseDTO> getAllCustomers(int page, int size);
    
    List<CustomerResponseDTO> getAllCustomers(org.springframework.data.domain.Sort sort);
    
    org.springframework.data.domain.Page<CustomerResponseDTO> getAllCustomers(int page, int size, org.springframework.data.domain.Sort sort);
}
