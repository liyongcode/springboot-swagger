package com.example.swagger.model;

public class Department {

    private String departmentName;
    private String departmentNo;

    public Department() {
        super();
    }

    public Department(String departmentName, String departmentNo) {
        this.departmentName = departmentName;
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentNo='" + departmentNo + '\'' +
                '}';
    }
}
