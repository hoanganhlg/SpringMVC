package org.example.entity;

public class Team {
    private Integer teamID;
    private String teamName;

    public Team(Integer teamID, String teamName) {
        this.teamID = teamID;
        this.teamName = teamName;
    }

    public Team() {
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
