package com.ashraf.game.game.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashraf.game.game.entity.Game;
import com.ashraf.game.game.services.GameServiceImpl;

@RestController
public class GameRestController {

	
	private GameServiceImpl gameServImpl;

	@Autowired
	public GameRestController(GameServiceImpl gameServImpl) {
		this.gameServImpl = gameServImpl;
	}
	
	@GetMapping("/games")
	public List<Game> getAllGame(){
		
		return gameServImpl.findAll();
	}
	
	@GetMapping("/games/{id}")
	public Game getOneGame(@PathVariable int id){
		
		return gameServImpl.findGame(id);
	}
	
	@PostMapping("/games")
	public Game postOneGame(@RequestBody Game game) {
		
		return gameServImpl.save(game);
	}
	
	@DeleteMapping("/games/{id}")
	public void removeOneGame(@PathVariable int id) {
		
		gameServImpl.deleteGame(id);
	}
}
