package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    public CompanyAndEmployeeFacade() {
    }

    public List<Employee> findEmployeesWithPartOfLastName(String givenString) {
        return employeeDao.retrieveEmployeesWithLastNameContaining(givenString);
    }

    public List<Company> findComaniesWithPartOfName(String givenString) {
        return companyDao.retrieveCompaniesWithNameContaining(givenString);
    }
}

