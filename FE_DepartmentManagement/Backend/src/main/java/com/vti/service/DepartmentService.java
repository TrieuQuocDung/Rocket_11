package com.vti.service;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.filter.DepartmentFilter;
import com.vti.form.DepartmentFormForCreating;
import com.vti.form.DepartmentFormForUpdating;
import com.vti.repository.IAccountRepository;
import com.vti.repository.IDepartmentRepository;
import com.vti.spacification.DepartmentSpacification;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository departmentRepository;

	@Autowired
	private IAccountRepository accountRepository;

	@SuppressWarnings("deprecation")
	public Page <Department> getAllDepartments(Pageable pageable , String search , DepartmentFilter filter) {
			Specification<Department> where = null;
		
				// search by name
				if (!StringUtils.isEmpty(search)) {
					DepartmentSpacification nameSpacification = new DepartmentSpacification("name","LIKE", search);
					DepartmentSpacification authorSpacification = new DepartmentSpacification("author.fullName","LIKE", search);
					
					where = Specification.where(nameSpacification).or(authorSpacification);
				}
				
				// minDate
				if(filter != null && filter.getMinDate() != null) {
				DepartmentSpacification minDateSpacification = new DepartmentSpacification("createDate" ,">=", filter.getMinDate());
				 if(where == null) {
					 where = Specification.where(minDateSpacification);
				 }else {
					 where = where.and(minDateSpacification);
				 }
				}
				// maxDate
				if(filter != null && filter.getMaxDate() != null) {
					DepartmentSpacification maxDateSpacification = new DepartmentSpacification("createDate" ,"<", filter.getMaxDate());
					 if(where == null) {
						 where = Specification.where(maxDateSpacification);
					 }else {
						 where = where.and(maxDateSpacification);
					 }
					}
				
				
		return departmentRepository.findAll(where, pageable);
	}


	@SuppressWarnings("serial")
	// id > ?
	private Specification<Department> greaterThanById(int id) {
		return new Specification<Department>() {

			@Override
			public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
				return criteriaBuilder.greaterThan(root.get("id"), id);
			}

		};
	}

	@SuppressWarnings("serial")
	// id > ?
	private Specification<Department> lessThanById(int id) {
		return new Specification<Department>() {

			@Override
			public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
				return criteriaBuilder.lessThan(root.get("id"), id);
			}

		};
	}


	public Department getDepartmentByID(short id) {
		return departmentRepository.findById(id).get();
	}

	public Department getDepartmentByName(String name) {
		return departmentRepository.findByName(name);
	}

	@Override
	public void createDepartment(DepartmentFormForCreating form) {

		// convert form --> entity
		Department department = new Department(form.getName());
		// get author
		Account author = accountRepository.findById(form.getAuthorId()).get();
		department.setAuthor(author);
		departmentRepository.save(department);
	}

	public void updateDepartment(short id, DepartmentFormForUpdating form) {
		Department department = getDepartmentByID(id);
		department.setName(form.getName());
		department.setModifiedDate(new Date());
		departmentRepository.save(department);
	}

	public void deleteDepartment(short id) {
		departmentRepository.deleteById(id);
	}

	public boolean isDepartmentExistsByID(short id) {
		return departmentRepository.existsById(id);
	}

	public boolean isDepartmentExistsByName(String name) {
		return departmentRepository.existsByName(name);
	}

	public void deleteDepartments(List<Short> ids) {
		departmentRepository.deleteByIds(ids);
	}
}
