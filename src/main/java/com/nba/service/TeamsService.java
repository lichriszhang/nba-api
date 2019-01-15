package com.nba.service;

import java.util.List;

import com.nba.entity.Teams;

public interface TeamsService {
	
	public List<Teams> getAllTeams();
	
	public Teams getTeamById(Integer teamId);
	
	List<Teams> getTeamsByArea(String area);
	
	List<Teams> getEastTopTeams();
	
	List<Teams> getWestTopTeams();
	
	boolean updateTeams(Teams team);

}
