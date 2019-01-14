package com.nba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.entity.Teams;
import com.nba.mapper.TeamsMapper;
import com.nba.service.TeamsService;

@Service
public class TeamsServiceImpl implements TeamsService {

	@Autowired
	private TeamsMapper teamsMapper;

	@Override
	public List<Teams> getAllTeams() {
		return teamsMapper.selectAll();
	}

	@Override
	public Teams getTeamById(Integer teamId) {
		return teamsMapper.selectByPrimaryKey(teamId);
	}

}
