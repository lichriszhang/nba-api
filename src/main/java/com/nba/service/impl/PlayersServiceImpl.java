package com.nba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.entity.Players;
import com.nba.mapper.PlayersMapper;
import com.nba.service.PlayersService;

@Service
public class PlayersServiceImpl implements PlayersService {
	
	@Autowired
	private PlayersMapper playersMapper;

	@Override
	public List<Players> getAllPlayers() {
		return playersMapper.selectAll();
	}

	@Override
	public Players getPlayerById(Integer id) {
		return playersMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Players> getPlayersByTeam(Integer teamId) {
		return playersMapper.selectByTeam(teamId);
	}

	@Override
	public boolean updatePlayer(Players player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPlayer(Players player) {
		// TODO Auto-generated method stub
		return false;
	}

}
