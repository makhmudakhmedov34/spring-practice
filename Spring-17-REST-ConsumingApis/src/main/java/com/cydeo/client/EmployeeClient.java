package com.cydeo.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://dummyapi.io",name = "EMPLOYEE-CLIENT")
public interface EmployeeClient {
}



//https://dummyapi.io/data/v1/user?limit=10