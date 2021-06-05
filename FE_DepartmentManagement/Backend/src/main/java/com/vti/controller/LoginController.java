package com.vti.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.AccountDTO;
import com.vti.dto.DepartmentDTO;
import com.vti.dto.DetailDepartmentDTO;
import com.vti.dto.LoginInfoDTO;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.filter.DepartmentFilter;
import com.vti.form.DepartmentFormForCreating;
import com.vti.form.DepartmentFormForUpdating;
import com.vti.service.IAccountService;
import com.vti.service.IDepartmentService;

@RestController
@RequestMapping(value = "api/v1/login")
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class LoginController {

	@Autowired
	private IAccountService service;

	@GetMapping()
	public ResponseEntity<?> login(Principal principal) {
		String username = principal.getName();
		Account entity = service.getAccountByUsername(username);
		
		// convert entity --> dto
		LoginInfoDTO dto = new LoginInfoDTO(entity.getId(), entity.getFullName(), entity.getRole());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

}
