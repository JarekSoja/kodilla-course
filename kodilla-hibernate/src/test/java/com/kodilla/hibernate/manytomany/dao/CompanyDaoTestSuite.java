package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeesByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        List<Employee> allSmiths = employeeDao.retrieveEmployeesByName("Smith");
        String employeeWithNameSmith = johnSmith.getLastName();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        List<Employee> allClarcksons = employeeDao.retrieveEmployeesByName("Clarckson");
        String employeeWithNameClarckson = stephanieClarckson.getLastName();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        List<Employee> allKovalskys = employeeDao.retrieveEmployeesByName("Kovalsky");
        String employeeWithNameKovalsky = lindaKovalsky.getLastName();

        //Then
        Assert.assertEquals(1, allSmiths.size());
        Assert.assertEquals(1, allClarcksons.size());
        Assert.assertEquals(1, allKovalskys.size());
        Assert.assertEquals("Smith", employeeWithNameSmith);
        Assert.assertEquals("Clarckson", employeeWithNameClarckson);
        Assert.assertEquals("Kovalsky", employeeWithNameKovalsky);

        //CleanUp
        employeeDao.delete(johnSmithId);
        employeeDao.delete(stephanieClarcksonId);
        employeeDao.delete(lindaKovalskyId);
    }

    @Test
    public void retrieveCompaniesByFirstThreeLetters() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        List<Company> companiesWithSof = companyDao.retrieveCompaniesByFirstThreeLetters("Sof");
        String companyWithSof = softwareMachine.getName();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        List<Company> companiesWithDat = companyDao.retrieveCompaniesByFirstThreeLetters("Dat");
        String companyWithDat = dataMaesters.getName();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        List<Company> companiesWithGre = companyDao.retrieveCompaniesByFirstThreeLetters("Gre");
        String companyWithGre = greyMatter.getName();

        //Then
        Assert.assertEquals(1, companiesWithSof.size());
        Assert.assertEquals(1, companiesWithDat.size());
        Assert.assertEquals(1, companiesWithGre.size());
        Assert.assertEquals("Software Machine", companyWithSof);
        Assert.assertEquals("Data Maesters", companyWithDat);
        Assert.assertEquals("Grey Matter", companyWithGre);

        //CleanUp
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);

    }
}