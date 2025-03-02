package com.backend.kanban.Proxy;

import com.backend.kanban.Domain.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="userservice",url="http://localhost:8082")
public interface EmployeeProxy {
    @PostMapping("/api/v1/employee")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee);
}
