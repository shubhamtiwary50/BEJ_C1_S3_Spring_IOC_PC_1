package com.niit.domain;

import java.util.Objects;

public class Department {

    private String deptName;
    private String deptId;

    public Department() {
    }

    public Department(String deptName, String deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getDeptName(), that.getDeptName()) && Objects.equals(getDeptId(), that.getDeptId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptName(), getDeptId());
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}
