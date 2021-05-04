package com.ashraf.game.game.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashraf.game.game.entity.Game;
import com.ashraf.game.game.entity.Team;
import com.ashraf.game.game.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepo;

	@Override
	@Transactional
	public List<Game> findAll() {

		return gameRepo.findAll();
	}

	@Override
	@Transactional
	public Game save(Game Game) {
		
		return gameRepo.save(Game);
	}

	@Override
	@Transactional
	public Game findGame(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String deleteGame(int id) {
		gameRepo.deleteById(id);
		return "game deleted";
	}

	@Override
	@Transactional
	public List<Game> findByHomeTeam(Team team) {
		
		return gameRepo.findByHomeTeam(team);
	}

	@Override
	@Transactional
	public List<Game> findByAwayTeam(Team team) {
		return gameRepo.findByAwayTeam(team);

	}

}
