package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"00000099999", "Test", "Test"},
            {"55543443333", "Test2", "Test2"},
            {"53333333333", "Test3", "Test3"},
            {"22222222222", "Test4", "Test4"},
            {"11111111111", "Test5", "Test5"},

    };

    private double[] salaries = {
            4500.00,
            3500.00,
            6000.00,
            2200.00,
            5400.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }

        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
