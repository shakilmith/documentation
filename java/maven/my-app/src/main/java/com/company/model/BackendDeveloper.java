package com.company.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "BackendDeveloper")
@DiscriminatorValue("backend_developer")
public class BackendDeveloper extends Developer {

    private int experience;
    private int salary;
    private int bonus;

    public BackendDeveloper() {
    }

    public BackendDeveloper(int experience, int salary, int bonus) {
        this.experience = experience;
        this.salary = salary;
        this.bonus = bonus;
    }

    public BackendDeveloper(int id, String name, String role, int experience, int salary, int bonus) {
        super(id, name, role);
        this.experience = experience;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
