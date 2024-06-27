package org.example.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class EmployeeModel {
    private String empName;
    private Boolean empGender;
    private Date empBirthday;
    private String empPhone;
    private String empEmail;
    private String empAddress;
    private Date empStartDate;
    private Boolean empStatus;
    private Integer teamID;
    private Integer projectID;

    public EmployeeModel() {
    }

    public EmployeeModel(String empName, Boolean empGender, String empPhone, Date empBirthday, String empEmail, String empAddress, Boolean empStatus, Integer teamID, Date empStartDate, Integer projectID) {
        this.empName = empName;
        this.empGender = empGender;
        this.empPhone = empPhone;
        this.empBirthday = empBirthday;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
        this.empStatus = empStatus;
        this.teamID = teamID;
        this.empStartDate = empStartDate;
        this.projectID = projectID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Boolean getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Boolean empGender) {
        this.empGender = empGender;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Date getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(Date empStartDate) {
        this.empStartDate = empStartDate;
    }

    public Boolean getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Boolean empStatus) {
        this.empStatus = empStatus;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }
}
