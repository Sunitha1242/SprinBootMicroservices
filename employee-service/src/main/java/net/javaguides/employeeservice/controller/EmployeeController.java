package net.javaguides.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.service1.EmployeeService;

@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	EmployeeService employeeService;

	// Build save Employee Rest API

	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.saveEmployee(employeeDto);
		EmployeeDto savedemployee = employeeService.saveEmployee(employeeDto);
		return new ResponseEntity<>(savedemployee, HttpStatus.CREATED);

	}

	// Build get Employees Rest API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long id) {
		EmployeeDto employeeDto = employeeService.findEmployeeById(id);

		return new ResponseEntity<>(employeeDto, HttpStatus.OK);

	}

}
