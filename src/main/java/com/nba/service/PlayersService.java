package com.nba.service;

import java.util.List;

import com.nba.entity.Players;

public interface PlayersService {
	
	List<Players> getAllPlayers();
	
	Players getPlayerById(Integer id);
	
	List<Players> getPlayersByTeam(Integer teamId);
	
	boolean updatePlayer(Players player);
	
	boolean addPlayer(Players player);
	
	Players getPlayerByNumbAndTeam(Integer number, Integer team);
	
}
