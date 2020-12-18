package com.famcs;

import java.util.Objects;

public class Company {
    String name;
    Integer foundation_year;
    Integer staff;

    Company (String name, Integer foundation_year, Integer staff) {
        this.name = name;
        this.foundation_year = foundation_year;
        this.staff = staff;
    }

    public String getName() {
        return this.name;
    }

    public Integer getFoundation_year() {
        return  this.foundation_year;
    }

    public Integer getStaff() {
        return this.staff;
    }

    @Override

    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company cmp = (Company) o;
        return name == cmp.name && foundation_year == cmp.foundation_year && staff == cmp.staff;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,foundation_year,staff);
    }

    @Override
    public String toString() {
        return "name: " + name + ", foundation year: " + foundation_year + ", staff: " + staff;
    }

}
