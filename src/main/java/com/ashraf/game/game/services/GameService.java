package com.ashraf.game.game.services;

import java.util.List;

import com.ashraf.game.game.entity.Game;
import com.ashraf.game.game.entity.Team;


public interface GameService {


	public List<Game> findAll();
	public Game save(Game Game);
	public Game findGame(int id);
	public String deleteGame(int id);
	public List<Game> findByHomeTeam(Team team);
	public List<Game> findByAwayTeam(Team team);
}
