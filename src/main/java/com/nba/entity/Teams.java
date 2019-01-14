package com.nba.entity;

import java.util.Date;

public class Teams {
    private Integer teamId;

    private String teamName;

    private Integer teamWin;

    private Integer teamLose;

    private Date createTime;

    private String teamBoss;

    private Integer ranking;

    private String teamArea;

    private String teamCity;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public Integer getTeamWin() {
        return teamWin;
    }

    public void setTeamWin(Integer teamWin) {
        this.teamWin = teamWin;
    }

    public Integer getTeamLose() {
        return teamLose;
    }

    public void setTeamLose(Integer teamLose) {
        this.teamLose = teamLose;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTeamBoss() {
        return teamBoss;
    }

    public void setTeamBoss(String teamBoss) {
        this.teamBoss = teamBoss == null ? null : teamBoss.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getTeamArea() {
        return teamArea;
    }

    public void setTeamArea(String teamArea) {
        this.teamArea = teamArea == null ? null : teamArea.trim();
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity == null ? null : teamCity.trim();
    }
}