package com.ashraf.game.game.services;

import java.util.List;

import com.ashraf.game.game.entity.Team;


public interface TeamService {

	public List<Team> findAll();
	public Team save(Team Team);
	public Team findTeam(int id);
	public String deleteTeam(int id);
}
