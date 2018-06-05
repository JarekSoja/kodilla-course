package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private final String pesel;
    private final String firstname;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String pesel, String firstname, String lastname, BigDecimal baseSalary) {
        this.pesel = pesel;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pesel='" + pesel + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return pesel != null ? pesel.equals(employee.pesel) : employee.pesel == null;
    }

    @Override
    public int hashCode() {

        return pesel != null ? pesel.hashCode() : 0;
    }
}
