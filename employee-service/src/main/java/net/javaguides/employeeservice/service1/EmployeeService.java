package net.javaguides.employeeservice.service1;

import net.javaguides.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
EmployeeDto saveEmployee(EmployeeDto employeeDto);

EmployeeDto findEmployeeById(Long id);
}
