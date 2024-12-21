package com.company.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "FrontendDeveloper")
@DiscriminatorValue("frontend_developer")
public class FrontendDeveloper extends Developer{
    private int salary;

    public FrontendDeveloper() {
    }

    public FrontendDeveloper(int salary) {
        this.salary = salary;
    }

    public FrontendDeveloper(int id, String name, String role, int salary) {
        super(id, name, role);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
