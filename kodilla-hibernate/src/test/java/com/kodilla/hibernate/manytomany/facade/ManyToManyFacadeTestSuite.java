package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {


    @Autowired
    private CompanyAndEmployeeFacade facade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private List<Employee> employees;
    private List<Company> companies;

    @Before
    public void createData() {
        employees = new ArrayList<>();
        employees.add(new Employee("Jaaa", "hmkii"));
        employees.add(new Employee("Jbbb", "nhhhyyttt"));
        employees.add(new Employee("Jccc", "vvvbbbbt"));
        employees.add(new Employee("Jddd", "momomomom"));
        employees.add(new Employee("Jeee", "vevevevev"));

        companies = new ArrayList<>();
        companies.add(new Company("Test name"));
        companies.add(new Company("Test name 2"));
        companies.add(new Company("Test name with param"));
        companies.add(new Company("Test name 4"));

        for (int c = 0; c < companies.size(); c++) {
            for (int i = 0; i < employees.size(); i++) {
                companies.get(c).getEmployees().add(employees.get(i));
            }
        }
        companies.stream()
                .forEach(c -> companyDao.save(c));

        employees.stream()
                .forEach(e -> employeeDao.save(e));
    }

    @After
    public void cleanup() {
        companyDao.deleteAll();

        employeeDao.deleteAll();
    }


    @Test
    public void testFindEmployeesWithPartOfLastName() {
        // When
        String givenString = "vevevevev";
        List<Employee> foundEmployees = new ArrayList<>(facade.findEmployeesWithPartOfLastName(givenString));
        int numberOfFoundEmployees = foundEmployees.size();


        // Then
        Assert.assertEquals(1, numberOfFoundEmployees);
    }

    @Test
    public void testFindCompaniesWithPartOfName() {
        //When
        String givenString = "with";
        List<Company> foundCompanies = new ArrayList<>(facade.findComaniesWithPartOfName(givenString));
        int numberOfFoundCompanies = foundCompanies.size();

        // Then
        Assert.assertEquals(1, numberOfFoundCompanies);
    }
}

