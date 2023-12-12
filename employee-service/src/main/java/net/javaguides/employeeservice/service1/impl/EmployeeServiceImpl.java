package net.javaguides.employeeservice.service1.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import net.javaguides.employeeservice.repository.EmployeeRepository;
import net.javaguides.employeeservice.service1.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(),
				employeeDto.getEmail());

		Employee savedEmployee = employeeRepository.save(employee);
		EmployeeDto savedEmployeeDto = new EmployeeDto(savedEmployee.getId(), savedEmployee.getFirstName(),
				savedEmployee.getLastName(), savedEmployee.getEmail());

		return savedEmployeeDto;
	}

	@Override
	public EmployeeDto findEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id).get();
		EmployeeDto savedemployeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(),
				employee.getLastName(), employee.getEmail());

		return savedemployeeDto;
	}

}
