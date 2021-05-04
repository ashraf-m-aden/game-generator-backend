package com.ashraf.game.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashraf.game.game.entity.Game;
import com.ashraf.game.game.entity.Team;

public interface GameRepository extends JpaRepository<Game, Integer> {
	
	public List<Game> findByHomeTeam(Team team);
	public List<Game> findByAwayTeam(Team team);


}
