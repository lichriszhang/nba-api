package com.nba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nba.entity.Players;
import com.nba.service.PlayersService;

@RestController
@RequestMapping("/players")
public class PlayersController {

	@Autowired
	private PlayersService playersService;
	
	@GetMapping("/all")
	public List<Players> getAll() {
		return playersService.getAllPlayers();
	}
	
	@GetMapping("/{pid}")
	public Players getPlayerById(@PathVariable(value="pid") Integer pid) {
		return playersService.getPlayerById(pid);
	}
	@GetMapping("/team/{teamId}")
	public List<Players> getPlayersByTeam(@PathVariable(value="teamId") Integer teamId) {
		return playersService.getPlayersByTeam(teamId);
	}
	
	@GetMapping("/number/{playerNumber}/{teamId}")
	public Players getPlayerByNumAndTeam(
			@PathVariable(value="playerNumber") Integer number, 
			@PathVariable(value="teamId") Integer teamId
			) {
		return playersService.getPlayerByNumbAndTeam(number, teamId);
	}
}
