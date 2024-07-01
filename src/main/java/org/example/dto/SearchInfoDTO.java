package org.example.dto;

import java.time.LocalDate;

public class SearchInfoDTO {
    private Integer teamID;
    private Integer projectID;
    private Boolean empStatus;
    private String empName;
    private LocalDate fromDate;
    private LocalDate toDate;

    private String username;

    public SearchInfoDTO() {
    }

    public SearchInfoDTO(Integer teamID, Integer projectID, Boolean empStatus, String empName, LocalDate fromDate, LocalDate toDate, String username) {
        this.teamID = teamID;
        this.projectID = projectID;
        this.empStatus = empStatus;
        this.empName = empName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Boolean getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Boolean empStatus) {
        this.empStatus = empStatus;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
