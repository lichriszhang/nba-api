package com.nba.service;

import java.util.List;

import com.nba.entity.Teams;

public interface TeamsService {
	
	public List<Teams> getAllTeams();
	
	public Teams getTeamById(Integer teamId);

}
