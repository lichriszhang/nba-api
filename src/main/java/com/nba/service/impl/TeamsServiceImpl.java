package com.nba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nba.entity.Teams;
import com.nba.mapper.TeamsMapper;
import com.nba.service.TeamsService;

@Service
public class TeamsServiceImpl implements TeamsService {

	@Autowired
	private TeamsMapper teamsMapper;
	
	@Value("${teams.top.count}")
	private Integer topCount;

	@Override
	public List<Teams> getAllTeams() {
		return teamsMapper.selectAll();
	}

	@Override
	public Teams getTeamById(Integer teamId) {
		return teamsMapper.selectByPrimaryKey(teamId);
	}

	@Override
	public List<Teams> getTeamsByArea(String area) {
		return teamsMapper.selectByArea(area);
	}

	@Override
	public List<Teams> getEastTopTeams() {
		return teamsMapper.selectEastTop(topCount);
	}

	@Override
	public List<Teams> getWestTopTeams() {
		return teamsMapper.selectWestTop(topCount);
	}

}
