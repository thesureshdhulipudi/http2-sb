package com.http2.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")https://localhost:8088/getAllEmp
@CrossOrigin(origins = "https://localhost")
public class Controller {

    @GetMapping("/getAllEmp")
    public ResponseEntity<Object> getData(){
    	
    	 List<EmployeeDTO> employees = new ArrayList<>();

         employees.add(new EmployeeDTO(1L, "John", "Doe", "john.doe@example.com", "Developer", 75000));
         employees.add(new EmployeeDTO(2L, "Jane", "Smith", "jane.smith@example.com", "Manager", 85000));
         employees.add(new EmployeeDTO(3L, "Emily", "Johnson", "emily.johnson@example.com", "Analyst", 65000));
         employees.add(new EmployeeDTO(4L, "Michael", "Brown", "michael.brown@example.com", "Designer", 70000));
         employees.add(new EmployeeDTO(5L, "Sarah", "Davis", "sarah.davis@example.com", "Tester", 60000));

    	
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }
}
